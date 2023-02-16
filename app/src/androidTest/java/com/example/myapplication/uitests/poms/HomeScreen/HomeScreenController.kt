package com.example.myapplication.uitests.poms.HomeScreen

import com.example.myapplication.uitests.interfaces.ControllerInterface
import com.example.myapplication.uitests.utils.Log
import org.junit.Assert

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class HomeScreenController : ControllerInterface {

    private val homeScreen = HomeScreen()

    override fun pageExists(): Boolean {
        return homeScreen.mainAppTitleLogo.exists()
    }

    override fun verifyPageExists() {
        Assert.assertTrue(pageExists())
    }

    fun verifyHomeScreenActivityTitleShouldExist() {
        Assert.assertTrue(homeScreen.mainAppTitleLogo.exists())
    }

    fun verifyHomeScreenLogo() {
        Log.info("Verify Home Screen Logo")
        Assert.assertTrue(homeScreen.homeScreenLogo.exists())
    }

    fun verifySettingOptionShouldExist() {
        Log.info("Verify Setting Option Exists")
        Assert.assertTrue(homeScreen.settingsButton.exists())
    }

    fun tapSettingsButton() {
        Log.info("Tap Settings Button")
        homeScreen.settingsButton.click()
    }

    fun verifyLeftArabicButtonExist(leftArabicButtonText: String) {
        Log.info("Verify Arabic Button (Left Text View)")
        Assert.assertTrue(homeScreen.getArabicLeftButton(leftArabicButtonText).exists())
    }

    fun verifyRightArabicButtonExist(rightArabicButtonText: String) {
        Log.info("Verify Arabic Button (Right Text View)")
        Assert.assertTrue(homeScreen.getArabicRightButton(rightArabicButtonText).exists())
    }

    fun verifyLeftFrenchButtonExist(leftFrenchButtonText: String) {
        Log.info("Verify French Button (Left Text View)")
        Assert.assertTrue(homeScreen.getFrenchLeftButton(leftFrenchButtonText).exists())
    }

    fun verifyRightFrenchButtonExist(rightFrenchButtonText: String) {
        Log.info("Verify French Button (Right Text View)")
        Assert.assertTrue(homeScreen.getFrenchRightButton(rightFrenchButtonText).exists())
    }

    fun tapArabicButton(leftArabicButtonText: String) {
        Log.info("Tap Arabic Button")
        homeScreen.getArabicLeftButton(leftArabicButtonText).click()
    }

    fun tapFrenchButton(leftFrenchButtonText: String) {
        Log.info("Tap French Button")
        homeScreen.getFrenchLeftButton(leftFrenchButtonText).click()
    }

    fun verifyArabicButtons(leftArabicButtonText: String, rightArabicButtonText: String) {
        this.verifyLeftArabicButtonExist(leftArabicButtonText)
        this.verifyRightArabicButtonExist(rightArabicButtonText)
    }

    fun verifyAndTapArabicButton(leftArabicButtonText: String, rightArabicButtonText: String) {
        this.verifyLeftArabicButtonExist(leftArabicButtonText)
        this.verifyRightArabicButtonExist(rightArabicButtonText)
        this.tapArabicButton(leftArabicButtonText)
    }

    fun verifyFrenchButtons(leftFrenchButtonText: String, rightFrenchButtonText: String) {
        this.verifyLeftFrenchButtonExist(leftFrenchButtonText)
        this.verifyRightFrenchButtonExist(rightFrenchButtonText)
    }

    fun verifyAndTapFrenchButton(leftFrenchButtonText: String, rightFrenchButtonText: String) {
        this.verifyLeftFrenchButtonExist(leftFrenchButtonText)
        this.verifyRightFrenchButtonExist(rightFrenchButtonText)
        this.tapFrenchButton(leftFrenchButtonText)
    }

    /*
        Aggregate Functions
    */
    fun verifyHomeScreenDetails() {
        this.verifyHomeScreenActivityTitleShouldExist()
        this.verifyHomeScreenLogo()
        this.verifySettingOptionShouldExist()
    }

    /*
        This method will take care of all buttons verification in one go
        depends on test data
    */
    fun verifyAllButton(
        leftArabicButtonText: String,
        rightArabicButtonText: String,
        leftFrenchButtonText: String,
        rightFrenchButtonText: String
    ) {
        this.verifyArabicButtons(leftArabicButtonText, rightArabicButtonText)
        this.verifyFrenchButtons(leftFrenchButtonText, rightFrenchButtonText)
    }

    /*
        Default App Handling Method
    */
    fun tapNextButtonToOpenFreeTestCodeApp() {
        Log.info("Tap Next Button To Open (Free Test Code App)")
        homeScreen.nextButton.click()
    }
}