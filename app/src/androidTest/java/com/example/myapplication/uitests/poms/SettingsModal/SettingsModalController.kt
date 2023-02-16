package com.example.myapplication.uitests.poms.SettingsModal

import com.example.myapplication.uitests.interfaces.ControllerInterface
import com.example.myapplication.uitests.utils.Log
import org.junit.Assert

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class SettingsModalController : ControllerInterface {

    private val settingsModalScreen = SettingsModalScreen()

    override fun pageExists(): Boolean {
        return settingsModalScreen.modalTitle.exists()
    }

    override fun verifyPageExists() {
        Assert.assertTrue(pageExists())
    }

    /*
        Settings Modal
    */
    fun verifySettingModalIconShouldExist() {
        Log.info("Verify Settings Modal Icon")
        Assert.assertTrue(settingsModalScreen.modalIcon.exists())
    }

    fun verifySettingsModalTitle(expectedModalTitle: String) {
        this.verifySettingModalIconShouldExist()
        Log.info("Verify Settings Modal Title")
        Assert.assertEquals(expectedModalTitle, settingsModalScreen.modalTitle.text)
    }

    fun verifySettingsModalTitleShouldNotExists() {
        Log.info("Verify Settings Modal Title Should Not Exists")
        Assert.assertFalse(settingsModalScreen.modalTitle.exists())
    }

    fun tapFrenchAsLanguageButton() {
        Log.info("Tap French Language Button")
        settingsModalScreen.modalFrenchButton.click()
    }

    fun tapArabicAsLanguageButton() {
        Log.info("Tap Arabic Language Button")
        settingsModalScreen.modalArabicButton.click()
    }

    fun tapSupportButton() {
        Log.info("Tap Support Button")
        settingsModalScreen.modalSupportButton.click()
    }

    /*
        Aggregate Functions
    */
    fun verifyAndTapSettingsModalFrenchButton(expectedModalTitle: String) {
        this.verifySettingsModalTitle(expectedModalTitle)
        this.tapFrenchAsLanguageButton()
    }

    fun verifyAndTapSettingsModalArabicButton(expectedModalTitle: String) {
        this.verifySettingsModalTitle(expectedModalTitle)
        this.tapArabicAsLanguageButton()
    }

    fun verifyAndTapSettingsModalSupportButton(expectedModalTitle: String) {
        this.verifySettingsModalTitle(expectedModalTitle)
        this.tapSupportButton()
    }
}