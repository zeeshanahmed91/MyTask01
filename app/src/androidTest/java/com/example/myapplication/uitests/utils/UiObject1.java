package com.example.myapplication.uitests.utils;

import android.view.accessibility.AccessibilityWindowInfo;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiObject;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiSelector;

/**
 * Created by zeeshanahmed on 2/15/23.
 */
public class UiObject1 {

    private final static String TAG = "UiObject1";
    public final UiObject uiObject;

    public UiObject1(UiObject uiObject) {
        this.uiObject = uiObject;
    }

    public void backSpace() {
        try {
            uiObject.click();
            Thread.sleep(2000);
            Utils.pressKeyboardDelBtn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean click() {
        try {
            return uiObject.click();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean longClick() {
        try {
            return uiObject.longClick();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isEnabled() {
        try {
            return uiObject.isEnabled();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Enabled Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isFocused() {
        try {
            return uiObject.isFocused();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Focused Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isClickable() {
        try {
            return uiObject.isClickable();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Clickable Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isChecked() {
        try {
            return uiObject.isChecked();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Checked Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isCheckable() {
        try {
            return uiObject.isCheckable();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Checkable Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean isSelected() {
        try {
            return uiObject.isSelected();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find Selected Status with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean swipeDown() {
        try {
            return uiObject.swipeDown(5);
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to do Swipe with : " + getSelector() + e.getStackTrace());
        }
    }

    public UiObject1 getChild(UiSelector uiSelector) {
        try {
            return new UiObject1(uiObject.getChild(uiSelector));
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Cannot getChild(). Failed to find parent uiObject1 with: " + getSelector() + e.getStackTrace());
        }
    }

    public String description() {
        try {
            return uiObject.getContentDescription();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public boolean setText(String text) {
        try {
            return uiObject.setText(text);
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public void clearTextField() {
        try {
            uiObject.clearTextField();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("ClearTextFieldFailed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public String getText() {
        try {
            return uiObject.getText();
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public UiSelector getSelector() {
        return uiObject.getSelector();
    }

    public boolean exists() {
        return uiObject.exists();
    }

    public boolean waitForExists(long timeout) {
        return uiObject.waitForExists(timeout);
    }

    public boolean waitUntilGone(long timeout) {
        return uiObject.waitUntilGone(timeout);
    }

    public boolean clickAndWaitForNewWindow() {
        try {
            return uiObject.clickAndWaitForNewWindow(4000);
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("Failed to find UiObject with: " + getSelector() + e.getStackTrace());
        }
    }

    public int getChildCount() {
        try {
            return uiObject.getChildCount();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void deviceBackButton() {

        try {
            Thread.sleep(2000);
            Utils.pressDeviceBackBtn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isKeyboardOpened() {
        for (AccessibilityWindowInfo window : InstrumentationRegistry.getInstrumentation().getUiAutomation().getWindows()) {
            if (window.getType() == AccessibilityWindowInfo.TYPE_INPUT_METHOD) {
                return true;
            }
        }
        return false;
    }
}