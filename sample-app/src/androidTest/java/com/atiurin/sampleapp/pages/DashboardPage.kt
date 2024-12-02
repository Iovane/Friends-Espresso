package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object DashboardPage {
    val dashboard: Matcher<View> by lazy { withId(R.id.recycler_friends) }
    val menuButton: Matcher<View> by lazy { withContentDescription(R.string.navigation_drawer_open) }
    val nameRachel: Matcher<View> by lazy { Matchers.allOf(withId(R.id.tv_name), withText("Rachel Green")) }

}