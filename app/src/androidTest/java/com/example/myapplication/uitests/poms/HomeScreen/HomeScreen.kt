package com.example.myapplication.uitests.poms.HomeScreen

import com.example.myapplication.uitests.interfaces.PageInterface
import com.example.myapplication.uitests.utils.Selectors
import com.example.myapplication.uitests.utils.UiObject1
import com.example.myapplication.uitests.utils.Utils

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class HomeScreen : PageInterface {
    val homeScreenLogo: UiObject1
    val settingsButton: UiObject1
    val mainAppTitleLogo: UiObject1
    val nextButton : UiObject1

    init {
        homeScreenLogo = Utils.findObject(Selectors.resourceId("imageView4"))
        settingsButton = Utils.findObject(Selectors.resourceId("settings"))
        mainAppTitleLogo = Utils.findObject(Selectors.resourceId("imageView5"))

        /*
             Default Launch App Handling
        */
        nextButton = Utils.findObject(Selectors.resourceIdForDefaultApp("button_first"))
    }

    override fun exists(): Boolean {
        return mainAppTitleLogo.exists()
    }

    /*
        Arabic Button
    */
    fun getArabicLeftButton(buttonText: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("arabicLeft").text(buttonText))
    }

    fun getArabicRightButton(buttonText: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("arabicRight").text(buttonText))
    }

    /*
       French Button
    */
    fun getFrenchLeftButton(buttonText: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("frenchLeft").text(buttonText))
    }

    fun getFrenchRightButton(buttonText: String): UiObject1 {
        return Utils.findObject(Selectors.resourceId("frenchRight").text(buttonText))
    }
}