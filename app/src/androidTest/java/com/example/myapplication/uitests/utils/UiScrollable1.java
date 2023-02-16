package com.example.myapplication.uitests.utils;

import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;

/**
 * Created by zeeshanahmed on 2/15/23.
 */
public class UiScrollable1 {
    public final UiScrollable uiScrollable;

    public UiScrollable1(UiScrollable uiScrollable) {
        this.uiScrollable = uiScrollable;
    }

    public UiScrollable1(UiSelector uiSelector) {
        this.uiScrollable = new UiScrollable(uiSelector);
    }

    public boolean scrollIntoView(UiObject1 uiObject1) {
        try {
            return uiScrollable.scrollIntoView(uiObject1.uiObject);
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("UiScrollable not found with selector: " + uiScrollable.getSelector());
        }
    }

    public boolean scrollTextIntoView(String text) {
        try {
            return uiScrollable.scrollTextIntoView(text);
        } catch (UiObjectNotFoundException e) {
            throw new RuntimeException("UiScrollable not found with selector: " + uiScrollable.getSelector());
        }
    }

    public boolean scrollForward() {
        try {
            return uiScrollable.scrollForward();
        } catch (Exception e) {
            throw new RuntimeException("Failed to scrollForward");
        }
    }

    public boolean scrollBackward() {
        try {
            return uiScrollable.scrollBackward();
        } catch (Exception e) {
            throw new RuntimeException("Failed to scrollBackward");
        }
    }

    public boolean scrollToEnd(int maxSwipes) {
        try {
            return uiScrollable.scrollToEnd(maxSwipes);
        } catch (Exception e) {
            throw new RuntimeException("Failed to scrollToEnd");
        }
    }

    public boolean scrollToBeginning(int maxSwipes) {
        try {
            return uiScrollable.scrollToBeginning(maxSwipes);
        } catch (Exception e) {
            throw new RuntimeException("Failed to scrollToBeginning");
        }
    }

    public void waitForExists(long timeout) {
        if (!uiScrollable.waitForExists(timeout)) {
            throw new RuntimeException("Wait for Exist Failed" + uiScrollable.getSelector());
        }
    }

    public boolean exists() {
        try {
            return uiScrollable.exists();
        } catch (Exception e) {
            throw new RuntimeException("Exist Failed" + uiScrollable.getSelector());
        }
    }
}