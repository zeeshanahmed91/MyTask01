package com.example.myapplication.uitests.tests.testsuites;

import com.example.myapplication.uitests.tests.testcases.HomeScreen.HomeScreenTestCases;
import com.example.myapplication.uitests.tests.testcases.MenuScreen.MenuScreenTestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by zeeshanahmed on 2/16/23.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses
        ({
                HomeScreenTestCases.class,
                MenuScreenTestCases.class
        })
public class All_Test_Suites_Executor_01 {
}
