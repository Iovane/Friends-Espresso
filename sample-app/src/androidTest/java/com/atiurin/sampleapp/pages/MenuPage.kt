package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object MenuPage {
    val customClickBtn: Matcher<View> by lazy { withId(R.id.custom_clicks_nav_item)}
    val topLeftRadioBtn: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val centerLeftRadioBtn: Matcher<View> by lazy { withId(R.id.rB_center_left) }
    val bottomLeftRadioBtn: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
    val topRightRadioBtn: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val centerRightRadioBtn: Matcher<View> by lazy { withId(R.id.rB_center_right) }
    val bottomRightRadioBtn: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
    val topCenterRadioBtn: Matcher<View> by lazy { withId(R.id.rB_top_center) }
    val bottomCenterRadioBtn: Matcher<View> by lazy { withId(R.id.rB_bottom_center) }
}