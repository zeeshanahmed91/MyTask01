package com.example.myapplication.uitests.poms.MenuScreen

import com.example.myapplication.uitests.interfaces.PageInterface
import com.example.myapplication.uitests.utils.Selectors
import com.example.myapplication.uitests.utils.UiObject1
import com.example.myapplication.uitests.utils.Utils

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class MenuScreen : PageInterface {
    val settingsButton: UiObject1
    val meuScreenLogo: UiObject1

    val motoCycleLogo: UiObject1
    val carLogo: UiObject1
    val carriageVehicleLogo: UiObject1
    val busLogo: UiObject1

    init {
        meuScreenLogo = Utils.findObject(Selectors.resourceId("logoImage"))
        settingsButton = Utils.findObject(Selectors.resourceId("settings"))

        motoCycleLogo = Utils.findObject(Selectors.resourceId("motocycleImage"))
        carLogo = Utils.findObject(Selectors.resourceId("vehicleImage"))
        carriageVehicleLogo = Utils.findObject(Selectors.resourceId("camionImage"))
        busLogo = Utils.findObject(Selectors.resourceId("busImage"))
    }

    override fun exists(): Boolean {
        return meuScreenLogo.exists()
    }

    fun getMotorCycleLabel(motorCycleLabel: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("motocycleLabel").text(motorCycleLabel))
    }

    fun getCarLabel(carLabel: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("vehicleLabel").text(carLabel))
    }

    fun getCarriageVehicleLabel(carriageVehicleLabel: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("camionLabel").text(carriageVehicleLabel))
    }

    fun getBusLabel(busLabel: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("busLabel").text(busLabel))
    }

    fun getHistoryButton(historyButtonText:String) : UiObject1{
        return Utils.findObject(Selectors.resourceId("historyButton").text(historyButtonText))
    }
}