package com.example.myapplication.uitests.tests.testcases.MenuScreen

import com.example.myapplication.uitests.poms.HomeScreen.HomeScreenConfig
import com.example.myapplication.uitests.poms.HomeScreen.HomeScreenController
import com.example.myapplication.uitests.poms.MenuScreen.MenuScreenConfig
import com.example.myapplication.uitests.poms.MenuScreen.MenuScreenController
import com.example.myapplication.uitests.poms.SettingsModal.SettingsModalConfig
import com.example.myapplication.uitests.poms.SettingsModal.SettingsModalController
import com.example.myapplication.uitests.tests.Tests
import com.example.myapplication.uitests.utils.Log
import com.example.myapplication.uitests.utils.Utils
import org.junit.Test

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class MenuScreenTestCases : Tests() {

    private val menuScreenController = MenuScreenController()
    private val homeScreenController = HomeScreenController()
    private val settingsModalController = SettingsModalController()

    @Test
    fun verifyMenuScreenDetails() {
        //Start of the test case
        Log.startTestCase("Menu Screen Details Verification Test Case Execution Started !")

        Log.info("Tap Settings Button")
        homeScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (French) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalFrenchButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Tap Code An Arab Option")
        homeScreenController.verifyAndTapArabicButton(
            leftArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_LEFT_BUTTON_1_TEXT,
            rightArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_RIGHT_BUTTON_1_TEXT
        )

        Log.info("Verify Menu Screen Details")
        menuScreenController.verifyMenuScreenDetails()

        Log.info("Tap Device Back Button (Exit From Menu Screen)")
        Utils.pressDeviceBackBtn()

        //End of the test case
        Log.endTestCase("Menu Screen Details Verification Test Case Execution Completed !")
    }

    @Test
    fun verifyMenuScreenFrenchLanguageTransitions() {
        //Start of the test case
        Log.startTestCase("Menu Screen (French) Language Transition Details Verification Test Case Execution Started !")

        Log.info("Tap Settings Button")
        homeScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (French) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalFrenchButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Tap Code An Arab Option")
        homeScreenController.verifyAndTapArabicButton(
            leftArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_LEFT_BUTTON_1_TEXT,
            rightArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_RIGHT_BUTTON_1_TEXT
        )

        Log.info("Tap Settings Button")
        menuScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (French) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalFrenchButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Verify (Settings Modal) Should Go Away After Option Selection")
        settingsModalController.verifySettingsModalTitleShouldNotExists()

        Log.info("Verify Options Should Be In (French) Language Mode")
        menuScreenController.verifyMenuLanguageTransition(
            expectedMotorCycleLabel = MenuScreenConfig.FRENCH_MOTORCYCLE_LABEL,
            expectedCarLabel = MenuScreenConfig.FRENCH_CAR_LABEL,
            expectedCarriageVehicleLabel = MenuScreenConfig.FRENCH_CARRIAGE_VEHICLE_LABEL,
            expectedBusLabel = MenuScreenConfig.FRENCH_BUS_LABEL,
            expectedHistoryButtonText = MenuScreenConfig.HISTORY_BUTTON_FRENCH_TEXT
        )

        Log.info("Tap Device Back Button (Exit From Menu Screen)")
        Utils.pressDeviceBackBtn()

        //End of the test case
        Log.endTestCase("Menu Screen (French) Language Transition Details Verification Test Case Execution Completed !")
    }

    @Test
    fun verifyMenuScreenArabicLanguageTransitions() {
        //Start of the test case
        Log.startTestCase("Menu Screen (Arabic) Language Transition Details Verification Test Case Execution Started !")

        Log.info("Tap Settings Button")
        homeScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (French) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalFrenchButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Tap Code An Arab Option")
        homeScreenController.verifyAndTapArabicButton(
            leftArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_LEFT_BUTTON_1_TEXT,
            rightArabicButtonText = HomeScreenConfig.FRENCH_NATIVE_RIGHT_BUTTON_1_TEXT
        )

        Log.info("Tap Settings Button")
        menuScreenController.tapSettingsButton()

        Log.info("Verify And Tap Settings Modal (Arabic) As Language Button ")
        settingsModalController.verifyAndTapSettingsModalArabicButton(SettingsModalConfig.SETTINGS_MODAL_TITLE)

        Log.info("Verify (Settings Modal) Should Go Away After Option Selection")
        settingsModalController.verifySettingsModalTitleShouldNotExists()

        Log.info("Verify Options Should Be In (Arabic) Language Mode")
        menuScreenController.verifyMenuLanguageTransition(
            expectedMotorCycleLabel = MenuScreenConfig.ARABIC_MOTORCYCLE_LABEL,
            expectedCarLabel = MenuScreenConfig.ARABIC_CAR_LABEL,
            expectedCarriageVehicleLabel = MenuScreenConfig.ARABIC_CARRIAGE_VEHICLE_LABEL,
            expectedBusLabel = MenuScreenConfig.ARABIC_BUS_LABEL,
            expectedHistoryButtonText = MenuScreenConfig.HISTORY_BUTTON_ARABIC_TEXT
        )

        Log.info("Tap Device Back Button (Exit From Menu Screen)")
        Utils.pressDeviceBackBtn()

        //End of the test case
        Log.endTestCase("Menu Screen (Arabic) Language Transition Details Verification Test Case Execution Completed !")
    }
}