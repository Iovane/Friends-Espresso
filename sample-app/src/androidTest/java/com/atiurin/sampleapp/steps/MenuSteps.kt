package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.sampleapp.pages.MenuPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isChecked
import com.atiurin.ultron.extensions.tap

object MenuSteps {
    fun openMenu() {
        DashboardPage.menuButton.click()
    }

    fun openCustomClicks() {
        MenuPage.customClickBtn.tap()
    }

    fun clickRadioBtns() {
        MenuPage.topLeftRadioBtn.tap()
        MenuPage.topCenterRadioBtn.tap()
        MenuPage.topRightRadioBtn.tap()
        MenuPage.centerRightRadioBtn.tap()
        MenuPage.bottomRightRadioBtn.tap()
        MenuPage.bottomCenterRadioBtn.tap()
        MenuPage.bottomLeftRadioBtn.tap()
        MenuPage.centerLeftRadioBtn.tap()
    }

    fun validateAllRadiosMarked(){
        MenuPage.topLeftRadioBtn.isChecked()
        MenuPage.topCenterRadioBtn.isChecked()
        MenuPage.topRightRadioBtn.isChecked()
        MenuPage.centerRightRadioBtn.isChecked()
        MenuPage.bottomRightRadioBtn.isChecked()
        MenuPage.bottomCenterRadioBtn.isChecked()
        MenuPage.bottomLeftRadioBtn.isChecked()
        MenuPage.centerLeftRadioBtn.isChecked()
    }
}