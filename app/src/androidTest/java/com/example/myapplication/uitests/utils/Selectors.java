package com.example.myapplication.uitests.utils;

import androidx.test.uiautomator.UiSelector;

/**
 * Created by zeeshanahmed on 2/14/23.
 */
public class Selectors {
    public static UiSelector androidResId(String resId) {
        return new UiSelector().resourceId("android:id/" + resId);
    }

    public static UiSelector description(String desc) {
        return new UiSelector().description(desc);
    }

    public static UiSelector descriptionContains(String desc) {
        return new UiSelector().descriptionContains(desc);
    }

    public static UiSelector className(String className) {
        return new UiSelector().className(className);
    }

    public static UiSelector text(String text) {
        return new UiSelector().text(text);
    }

    public static UiSelector textContains(String text) {
        return new UiSelector().textContains(text);
    }

    public static UiSelector resourceId(String resourceId) {
        return new UiSelector().resourceId(Constants.APP_PACKAGE + ":id/" + resourceId);
    }

    public static UiSelector resourceIdForDefaultApp(String resourceId) {
        return new UiSelector().resourceId(Constants.DEFAULT_APP_PACKAGE + ":id/" + resourceId);
    }

    public static UiSelector scrollable() {
        return new UiSelector().scrollable(true);
    }

    public static UiSelector scrollableInstance0() {
        return scrollable().instance(0);
    }
}