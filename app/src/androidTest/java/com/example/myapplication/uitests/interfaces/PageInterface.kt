package com.example.myapplication.uitests.interfaces

/**
 * Created by zeeshanahmed on 2/15/23.
 *
 * Rules for declaring uiObjects and selectors:
 *
 * 1. Include 'text' to selectors chain with resourceId, where possible, so that if object's text is changed in the app, it is caught.
 *    This way, there is no need for assertions on object.getText()
 */
interface PageInterface {
    fun exists():Boolean
}