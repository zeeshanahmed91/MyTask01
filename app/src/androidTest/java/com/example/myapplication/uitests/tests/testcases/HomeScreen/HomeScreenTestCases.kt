package com.example.myapplication.uitests.tests.testcases.HomeScreen

import com.example.myapplication.uitests.poms.HomeScreen.HomeScreenConfig
import com.example.myapplication.uitests.poms.HomeScreen.HomeScreenController
import com.example.myapplication.uitests.poms.SettingsModal.SettingsModalConfig
import com.example.myapplication.uitests.poms.SettingsModal.SettingsModalController
import com.example.myapplication.uitests.tests.Tests
import com.example.myapplication.uitests.utils.Log
import org.junit.Test

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class HomeScreenTestCases : Tests() {

    private val homeScreenController = HomeScreenController()
    private val settingsModalController = SettingsModalController()

    @Test
    fun verifyHomeScreenDetails() {
        //Start of the test case
        Log.startTestCase("Home Screen Details Verification Test Case Execution Started !")

        Log.info("Verify Home Screen Details")
        homeScreenController.verifyHomeScreenDetails()

        //End of the test case
        Log.endTestCase("Home Screen Details Verification Test Case Execution Completed !")
    }

    @Test
    fun verifyHomeScreenFrenchLanguageTransition() {
        //Start of the test case
        Log.startTestCase("Home Screen (French) Language Transition Details Verification Test Case Execution Started !")

        Log.info("Tap Settings Button")
        homeScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (French) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalFrenchButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Verify (Settings Modal) Should Go Away After Option Selection")
        settingsModalController.verifySettingsModalTitleShouldNotExists()

        Log.info("Verify Options Should Be In (French) Language Mode")
        homeScreenController.verifyAllButton(
            leftArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_LEFT_BUTTON_1_TEXT,
            rightArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_RIGHT_BUTTON_1_TEXT,
            leftFrenchButtonText = HomeScreenConfig.FRENCH_NATIVE_LEFT_BUTTON_2_TEXT,
            rightFrenchButtonText = HomeScreenConfig.FRENCH_NATIVE_RIGHT_BUTTON_2_TEXT
        )

        //End of the test case
        Log.endTestCase("Home Screen (French) Language Transition Details Verification Test Case Execution Completed !")
    }

    @Test
    fun verifyHomeScreenArabicLanguageTransition() {
        //Start of the test case
        Log.startTestCase("Home Screen (Arabic) Language Transition Details Verification Test Case Execution Started !")

        Log.info("Tap Settings Button")
        homeScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (Arabic) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalArabicButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Verify (Settings Modal) Should Go Away After Option Selection")
        settingsModalController.verifySettingsModalTitleShouldNotExists()

        Log.info("Verify Options Should Be In (Arabic) Language Mode")
        homeScreenController.verifyAllButton(
            leftArabicButtonText = HomeScreenConfig.ARABIC_NATIVE_LEFT_BUTTON_1_TEXT,
            rightArabicButtonText = HomeScreenConfig.ARABIC_NATIVE_RIGHT_BUTTON_1_TEXT,
            leftFrenchButtonText = HomeScreenConfig.ARABIC_NATIVE_LEFT_BUTTON_2_TEXT,
            rightFrenchButtonText = HomeScreenConfig.ARABIC_NATIVE_RIGHT_BUTTON_2_TEXT
        )

        //End of the test case
        Log.endTestCase("Home Screen (Arabic) Language Transition Details Verification Test Case Execution Completed !")
    }
}