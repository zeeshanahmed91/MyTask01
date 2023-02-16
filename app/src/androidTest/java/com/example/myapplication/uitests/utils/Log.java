package com.example.myapplication.uitests.utils;

/**
 * Created by zeeshanahmed on 2/14/23.
 */
public class Log {
   private static String tag = "Automation";

   /*
       This Method is  to print log for the beginning of the test case, as we usually run so many
       test cases as a test suite.
    */
   public static void startTestCase(String sTestCaseName) {
      Log.info("****************************************************************************************");
      Log.info("****************************************************************************************");
      Log.info("$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$");
      Log.info("****************************************************************************************");
      Log.info("****************************************************************************************");
   }

   /*
      This Method  is to print log for the ending of the test case, as we usually run so many
      test cases as a test suite
   */
   public static void endTestCase(String sTestCaseName) {
      Log.info("****************************************************************************************");
      Log.info("****************************************************************************************");
      Log.info("$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$");
      Log.info("****************************************************************************************");
      Log.info("****************************************************************************************");
   }

   /*
      This Method  is to print Line of Text to track Test Case Execution Line By Line
      to track the  Failure at Specific Point
   */
   public static void info(String message) {
      android.util.Log.i(tag, message);
   }

   /*
     This Method  is for Warning Purpose While Executing Test Case
   */
   public static void warn(String message) {
      Log.warn(message);
   }

   /*
      This Method  is for Error Purpose While Executing Test Case
   */
   public static void error(String errorMessage) {
      Log.error(errorMessage);
   }

   /*
      This Method  is for Error Purpose While Executing Test Case
   */
   public static void error(Throwable errorMessage) {
      Log.error(errorMessage.getMessage());
   }

   /*
      This Method  is for Fatal Warning Purpose While Executing Test Case
   */
   public static void fatal(String message) {
      Log.fatal(message);
   }

   /*
      This Method  is for Debug Purpose While Executing Test Case
   */
   public static void debug(String message) {
      Log.debug(message);
   }
}