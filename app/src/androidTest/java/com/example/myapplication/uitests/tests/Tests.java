package com.example.myapplication.uitests.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;

import com.example.myapplication.uitests.utils.Utils;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by zeeshanahmed on 2/15/23.
 */
@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class Tests {
    /*
        If the app supposed to have permissions then these line of code help them to by pass the permission to avoid system permission
        modals prompts. (Runtime Permissions have been introduced in Android OS: 6.0).
    */
    /*@Rule
    public GrantPermissionRule mRuntimePermissionRuleLocation = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);
    @Rule
    public GrantPermissionRule mRuntimePermissionRuleCamera = GrantPermissionRule.grant(Manifest.permission.CAMERA);
    @Rule
    public GrantPermissionRule mRuntimePermissionRuleReadStorage = GrantPermissionRule.grant(Manifest.permission.READ_EXTERNAL_STORAGE);
    @Rule
    public GrantPermissionRule mRuntimePermissionRuleWriteStorage = GrantPermissionRule.grant(Manifest.permission.WRITE_EXTERNAL_STORAGE);*/

    @Before
    public void setup() {
        Utils.launchApp();

        /*
            Thread.sleep is bad approach to use but sometime we need this sleep to slow down the execution
            it varies from case to case. So placing this sleep intentionally for the safe side for App Animation
            and splash screen smooth transition.
        */
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
