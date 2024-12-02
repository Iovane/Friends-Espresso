package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.steps.ChatSteps
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.steps.MenuSteps
import com.atiurin.sampleapp.tests.BaseTest
import com.atiurin.ultron.extensions.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests: BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun chatWithRachel() {
        DashboardSteps.dashboardDisplayed()
        DashboardSteps.openChat()

        val textToSend = "Hi Rachel hows your cat doing?"
        ChatSteps.sendText(textToSend)
        ChatSteps.checkSentText(textToSend)
    }

    @Test
    fun customClicksTest() {
        DashboardSteps.dashboardDisplayed()
        MenuSteps.openMenu()
        MenuSteps.openCustomClicks()
        MenuSteps.clickRadioBtns()
        MenuSteps.validateAllRadiosMarked()
    }
}