package com.example.myapplication.uitests.poms.MenuScreen

import com.example.myapplication.uitests.interfaces.ControllerInterface
import com.example.myapplication.uitests.utils.Log
import org.junit.Assert
import kotlin.math.exp

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class MenuScreenController : ControllerInterface {

    private val menuScreen = MenuScreen()

    override fun pageExists(): Boolean {
        return menuScreen.meuScreenLogo.exists()
    }

    override fun verifyPageExists() {
        Assert.assertTrue(pageExists())
    }

    fun verifyMenuScreenLogo() {
        Log.info("Verify Menu Screen Logo")
        Assert.assertTrue(menuScreen.meuScreenLogo.exists())
    }

    fun verifySettingOptionShouldExist() {
        Log.info("Verify Setting Option Exists")
        Assert.assertTrue(menuScreen.settingsButton.exists())
    }

    fun tapSettingsButton() {
        Log.info("Tap Settings Button")
        menuScreen.settingsButton.click()
    }

    fun verifyMotorCycleLabel(expectedMotorCycleLabel: String) {
        Log.info("Verify Motorcycle Label")
        Assert.assertEquals(
            expectedMotorCycleLabel,
            menuScreen.getMotorCycleLabel(expectedMotorCycleLabel).text
        )
    }

    fun verifyMotorCycleLogoShouldExists() {
        Log.info("Verify MotorCycle Logo Should Exist")
        Assert.assertTrue(menuScreen.motoCycleLogo.exists())
    }

    fun verifyCarLabel(expectedCarLabel: String) {
        Log.info("Verify Car Label")
        Assert.assertEquals(expectedCarLabel, menuScreen.getCarLabel(expectedCarLabel).text)
    }

    fun verifyCarLogoShouldExists() {
        Log.info("Verify Car Logo Should Exist")
        Assert.assertTrue(menuScreen.carLogo.exists())
    }

    fun verifyCarriageVehicleLabel(expectedCarriageVehicleLabel: String) {
        Log.info("Verify Carriage Vehicle Label")
        Assert.assertEquals(
            expectedCarriageVehicleLabel,
            menuScreen.getCarriageVehicleLabel(expectedCarriageVehicleLabel).text
        )
    }

    fun verifyCarriageVehicleLogoShouldExists() {
        Log.info("Verify Carriage Vehicle Logo Should Exist")
        Assert.assertTrue(menuScreen.carriageVehicleLogo.exists())
    }

    fun verifyBusLabel(expectedBusLabel: String) {
        Log.info("Verify Bus Label")
        Assert.assertEquals(expectedBusLabel, menuScreen.getBusLabel(expectedBusLabel).text)
    }

    fun verifyBusLogoShouldExists() {
        Log.info("Verify BusLogo Should Exist")
        Assert.assertTrue(menuScreen.busLogo.exists())
    }

    fun tapMotorCycleButton() {
        Log.info("Tap Motorcycle Button")
        menuScreen.motoCycleLogo.click()
    }

    fun tapCarButton() {
        Log.info("Tap Car Button")
        menuScreen.carLogo.click()
    }

    fun tapCarriageVehicleButton() {
        Log.info("Tap Carriage Vehicle Button")
        menuScreen.carriageVehicleLogo.click()
    }

    fun tapBusButton() {
        Log.info("Tap Bus Button")
        menuScreen.busLogo.click()
    }

    fun verifyHistoryButtonShouldExist(expectedHistoryButtonTet: String) {
        Log.info("Verify History Button Text")
        Assert.assertTrue(menuScreen.getHistoryButton(expectedHistoryButtonTet).exists())
    }

    fun tapHistoryButton(expectedHistoryButtonText: String) {
        Log.info("Tap History Button")
        menuScreen.getHistoryButton(expectedHistoryButtonText).click()
    }

    /*
        Aggregate Functions
    */
    fun verifyMenuScreenDetails() {
        this.verifyMenuScreenLogo()
        this.verifySettingOptionShouldExist()
    }

    fun verifyMenuLanguageTransition(
        expectedMotorCycleLabel: String, expectedCarLabel: String,
        expectedCarriageVehicleLabel: String, expectedBusLabel: String,
        expectedHistoryButtonText: String
    ) {
        this.verifyMotorCycleLogoShouldExists()
        this.verifyMotorCycleLabel(expectedMotorCycleLabel)

        this.verifyCarLogoShouldExists()
        this.verifyCarLabel(expectedCarLabel)

        this.verifyCarriageVehicleLogoShouldExists()
        this.verifyCarriageVehicleLabel(expectedCarriageVehicleLabel)

        this.verifyBusLogoShouldExists()
        this.verifyBusLabel(expectedBusLabel)

        this.verifyHistoryButtonShouldExist(expectedHistoryButtonText)
    }
}
