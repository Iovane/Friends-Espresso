package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed
import org.junit.Assert


object DashboardSteps {

    fun dashboardDisplayed() {
        DashboardPage.dashboard.isDisplayed()
    }
    fun openChat() {

        DashboardPage.nameRachel.click()
        Assert.assertEquals(ChatPage.chatTitle.getText(), "Rachel Green")
    }
}