package com.example.myapplication.uitests.utils;

import static androidx.test.InstrumentationRegistry.getContext;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.BySelector;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;
import androidx.test.uiautomator.Until;

import java.io.IOException;
import java.util.List;

/**
 * Created by zeeshanahmed on 2/15/23.
 */
public class Utils {
    private static final String TAG = "Utils";

    //**IMPORTANT**//
   /*
       This {UiDevice} object is the only one which needs to be set in
       @Before in tests and to be used by screens/controllers classes
   */
    public static final UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    static String[] kill_ap_command = {"am", "force-stop", Constants.APP_PACKAGE};
    private static final int SHORT_TIMEOUT = Constants.SHORT_TIMEOUT;
    private static final int LONG_TIMEOUT = Constants.LONG_TIMEOUT;

    //Waiters
    public static boolean isVisible(BySelector selector) {
        UiObject2 object2 = uiDevice.wait(Until.findObject(selector), SHORT_TIMEOUT);
        return object2 != null;
    }

    public static UiObject2 findObject(BySelector selector) {
        UiObject2 object2 = uiDevice.wait(Until.findObject(selector), SHORT_TIMEOUT);
        if (object2 == null) {
            throw new RuntimeException("Failed to find object: " + selector.toString());
        }
        return object2;
    }

    public static UiObject1 findObject(UiSelector uiSelector) {
        UiObject uiObject = uiDevice.findObject(uiSelector);
        return new UiObject1(uiObject);
    }

    public static List<UiObject2> findObjects(UiObject2 firstObject, String childObject) {
        System.out.println("Enter select_element_inside_layout Method using content description");
        //Finding child element using parent
        return firstObject.wait(Until.findObjects(By.descContains(childObject)), LONG_TIMEOUT);
    }

    /**
     * Scroll to uiObject1 inside uiScrollable1 before performing any action on it
     * The '...scrollable(true).instance(0)' selector is used for uiScrollable1.
     */
    public static UiObjectInScrollable findObjectInScrollable(UiSelector scrollerSelector, UiSelector objSelector) {
        UiScrollable1 uiScrollable1 = new UiScrollable1(new UiScrollable(scrollerSelector));
        UiObject1 uiObject1 = new UiObject1(uiDevice.findObject(objSelector));
        return new UiObjectInScrollable(uiScrollable1, uiObject1);
    }

    /**
     * Uses default selector (...scrollable(true).instance(0)) for uiScrollable1
     * If you want to provide selector for a specific uiScrollable1 element then use overloaded method
     *
     * @param objSelector
     * @return If there are more than 1 scrollable elements and
     */
    public static UiObjectInScrollable findObjectInScrollable(UiSelector objSelector) {
        UiScrollable1 uiScrollable1 = new UiScrollable1(new UiScrollable(Selectors.scrollableInstance0()));
        UiObject1 uiObject1 = new UiObject1(uiDevice.findObject(objSelector));
        return new UiObjectInScrollable(uiScrollable1, uiObject1);
    }

    public static UiScrollable1 findScrollable(UiSelector uiSelector) {
        return new UiScrollable1((new UiScrollable(uiSelector)));
    }

    public static boolean pressKeyboardDelBtn() {
        return uiDevice.pressKeyCode(KeyEvent.KEYCODE_DEL);
    }

    public static boolean pressKeyboardEnterBtn() {
        return uiDevice.pressKeyCode(KeyEvent.KEYCODE_ENTER);
    }

    public static boolean pressDeviceBackBtn() {
        return uiDevice.pressBack();
    }

    public static boolean hideKeyboard() {
        Log.info("Hide Keyboard If Visible");
        InputMethodManager imm = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm.isAcceptingText()) {
            return uiDevice.pressBack();
        } else return false;
    }

    public static void launchApp() {
        assertThat(uiDevice, notNullValue());
        uiDevice.pressHome();

        //Wait for launcher
        final String launcherPackage = uiDevice.getLauncherPackageName();
        assertThat(launcherPackage, notNullValue());
        uiDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)), LONG_TIMEOUT);

        //Launch the Application
        Context context = ApplicationProvider.getApplicationContext();
        final Intent intent = context.getPackageManager().getLaunchIntentForPackage(Constants.APP_PACKAGE);

        //Clear out any previous instances
        intent.addFlags((Intent.FLAG_ACTIVITY_CLEAR_TASK));
        context.startActivity(intent);

        //Wait for the app to appear
        uiDevice.wait(Until.hasObject(By.pkg(Constants.APP_PACKAGE).depth(0)), LONG_TIMEOUT);
    }

    public static void killApp() {
        Process process;
        try {

            Log.info("Executing Application Kill Command");
            process = Runtime.getRuntime().exec(kill_ap_command);

            Log.info("Done with command execution");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) {
        try {
            print(TAG, "Sleeping for" + seconds + " seconds");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void print(String msg) {
        print("NO TAG", msg);
    }

    public static void print(String tag, String message) {
        System.out.println("UiAutomator - " + tag + ": " + message);
    }

    /**
     * Scroll forward to the element which has a description or name which contains the input text.
     * The scrolling is performed on the first scrollView present on the UI
     *
     * @param text
     */
    public static UiObject2 scrollTo(String text) throws UiObjectNotFoundException {
        UiScrollable scroller = new UiScrollable(new UiSelector().scrollable(true).instance(0));
        scroller.scrollIntoView(new UiSelector().text(text));
        return uiDevice.findObject(By.text(text));
    }

    /**
     * Scroll forward to the element which has a description or name which exactly matches the input text.
     * The scrolling is performed on the first scrollView present on the UI
     *
     * @param text
     */
    public static UiObject2 scrollToExact(String text) throws UiObjectNotFoundException {
        UiScrollable scroller = new UiScrollable(new UiSelector().scrollable(true).instance(0));
        scroller.scrollIntoView(new UiSelector().text(text));
        return uiDevice.findObject(By.text(text));
    }

    /*
       This Method is  used to Scroll to the Intended Value and Click on it
    */
    public static void scroll_to(String input) {
        try {
            scrollTo(input).click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
      This Method is  used to Scroll to the Intended text Field Label
    */
    public static void form_Scroller(String input) {
        try {
            scrollTo(input);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
}