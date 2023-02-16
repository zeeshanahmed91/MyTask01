package com.example.myapplication.uitests.interfaces

import org.junit.Assert

/**
 * Created by zeeshanahmed on 2/15/23.
 */
interface ControllerInterface {

    fun pageExists(): Boolean

    fun verifyPageExists() {
        Assert.assertTrue(pageExists())
    }

    fun verifyPageNotExists() {
        Assert.assertFalse(pageExists())
    }
}