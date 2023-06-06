package com.example.myjob

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import com.example.myjob.ui.MainActivity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Before
    fun setUp(){
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkNavigationBetweenFragment() {

        onView(withId(R.id.map_fragment)).perform(click())
        onView(withId(R.id.map_fragment)).check(matches(isDisplayed()))
        onView(withId(R.id.list_fragment)).perform(click())
        onView(withId(R.id.list_fragment)).check(matches(isDisplayed()))
        onView(withId(R.id.add_job_fragment)).perform(click())
        onView(withId(R.id.add_job_fragment)).check(matches(isDisplayed()))

    }
}