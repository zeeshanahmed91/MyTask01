# Table of Contents
1. [Overview](#1-overview)
2. [Installation](#2-installation)
3. [Code Overview](#3-code-overview)
4. [Development Environment](#4-development-environment)
5. [Build Tests](#5-build-tests)
6. [Run Tests](#6-run-tests)
7. [Analyze Test Results](#7-analyze-tests-results)
8. [Troubleshooting](#8-troubleshooting)

## 1. Overview
The UI tests cover the functional UI testing of the (Free Test Mobile) app. In UI testing we test the app the way the user uses the app. Let’s take an example like a login screen user input username in
username field & password in password field on the basis of text representing those fields. In ui-testing we verify labels, textfield, text inside text fields & actions on those fields.

## 2. Installation
Not valid in current scenario.

## 3. Code Overview
In the section we talk about code architecture and code hierarchy.

### Architecture
We are following a page object model for UI testing of an android app. We have an enhanced version like 1 screen consist of 3 layers
1. Screen POM which is responsible for maintaining all the locators on the screen.
2. Screen Controller which is responsible for maintaining all the methods & is also responsible for performing action on those locators like click(), textAssertion.
3. Screen Config responsible for maintaining test data used by the test cases.

### Test Code Folder Hierarchy
Ui test code is inside androidTest folder, hierarchy looks like this

     uitest
      +-- flows
        || +-- DetailLogScreenFlows.kt 
      +-- interfaces
        || +-- ControllerInterface.kt
        || +-- PageInterface.kt
      +-- modals            
        || +-- CycleRuleModel.kt
      +-- poms
        || +-- detailLogScreen
        ||| +-- DetailLogConfig.java
        ||| +-- DetailLogScreen.kt
        ||| +-- DetailLogScreenController.kt   
      +-- tests
        || +-- testcases
        ||| +-- DOTInspectionMode
        |||| +-- DOTInspectionModeTestCases.kt      
        || +-- testsuites
        ||| +-- All_Tests_Suites_Executor.java
        | +-- Tests.java
      +-- utils
        || +-- Constants.java       
      +-- ReadMe.md

Following are sub folders in uitests

**/Pom**
This folder has sub-folders on the basis of screens which then has relevant class like LoginPage, LoginController & LoginConfig (test data file to be used while writing test cases).

**/Modal**
This folder has modal also known as data classes which are common in our uitests.

**/Flows**
There are some repetitive tasks in which we are doing in our test cases like setting up user’s cycle settings.
We used to call these repetitive actions as flows. This folder has different classes on the basis of different  screens.

**/Interfaces**
This folder contains interfaces which are common in our uitests.

**/Utils**
This folder contains helper functions, constants, enums and much more. You can call this folder the backbone of the entire uitest framework.

**/Tests**
This folder contains all the test cases & test suites on the basis of different features in our app. All test cases extends from Tests.kt.

## 4. Development Environment
1. Not valid in current scenario.
2. In most of the cases app have multiple product flavors for e.g preview & staging environment.

### Minor Dependencies
1. Not valid in current scenario.

## 5. Build Tests
After cloning the repository when you open the project in android studio. It takes more time than usual because in the android app we are using the gradle management system. Gradle downloads all the libraries mentioned in the project file (build.gradle). So it takes more time than usual.

## 6. Run Tests
We have a tests folder as mentioned in Test Code Folder Hierarchy.
1. If you want to execute test cases section wise then right click on classes inside tests/testcases.
2. If you want to execute test suites then right click on classes inside test/testsuites.

## 7. Analyze Tests Results
1. Results will be shown in Logcat (File > View > Tool Windows > Logcat).
2. Logcat shows both failure's and successive test cases.

## 8. Troubleshooting
1. After test case completion android studio shows  the pass/fail status in Logcat.
2. If the test fails it shows the failure reason either assertion error or due to some issue (when user clicks on that specific test).
3. You have to execute the failed test cases again in order to make sure either it's a valid failure or not.