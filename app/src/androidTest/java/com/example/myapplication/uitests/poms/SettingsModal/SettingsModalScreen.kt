package com.example.myapplication.uitests.poms.SettingsModal

import com.example.myapplication.uitests.interfaces.PageInterface
import com.example.myapplication.uitests.utils.Selectors
import com.example.myapplication.uitests.utils.UiObject1
import com.example.myapplication.uitests.utils.Utils

/**
 * Created by zeeshanahmed on 2/15/23.
 */
class SettingsModalScreen : PageInterface {
    val modalIcon: UiObject1
    val modalTitle: UiObject1
    val modalFrenchButton: UiObject1
    val modalArabicButton: UiObject1
    val modalSupportButton: UiObject1

    init {
        modalIcon = Utils.findObject(Selectors.resourceId("imageView2"))
        modalTitle = Utils.findObject(Selectors.resourceId("textView2"))
        modalFrenchButton = Utils.findObject(Selectors.resourceId("french").text("Français"))
        modalArabicButton = Utils.findObject(Selectors.resourceId("arabic").text("العربية"))
        modalSupportButton = Utils.findObject(Selectors.resourceId("discussion").text("Support"))
    }

    override fun exists(): Boolean {
        return modalTitle.exists()
    }
}