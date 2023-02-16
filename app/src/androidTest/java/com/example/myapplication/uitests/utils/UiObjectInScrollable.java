package com.example.myapplication.uitests.utils;

import androidx.test.uiautomator.UiSelector;

/**
 * Created by zeeshanahmed on 2/15/23.
 */
public class UiObjectInScrollable {
   private final static String TAG = "UiObjectInScrollable";
   public UiScrollable1 uiScrollable1;
   public UiObject1 uiObject1;

   public UiObjectInScrollable(UiScrollable1 uiScrollable1, UiObject1 uiObject1) {
      this.uiScrollable1 = uiScrollable1;
      this.uiObject1 = uiObject1;
   }

   public boolean scrollClick() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.click();
   }

   public boolean setText(String text) {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.setText(text);
   }

   public void clearTextField() {
      uiScrollable1.scrollIntoView(uiObject1);
      uiObject1.clearTextField();
   }

   public String getText() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.getText();
   }

   public String getDescription() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.description();
   }

   public boolean clickAndWaitForNewScreen() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.clickAndWaitForNewWindow();
   }

   public boolean exists() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.exists();
   }

   public boolean waitForExists(long timeout) {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.waitForExists(timeout);
   }

   public UiObject1 getChild(UiSelector uiSelector) {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.getChild(uiSelector);
   }

   public boolean isChecked() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.isChecked();
   }

   public boolean isEnabled() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.isEnabled();
   }

   public boolean isSelected() {
      uiScrollable1.scrollIntoView(uiObject1);
      return uiObject1.isSelected();
   }
}