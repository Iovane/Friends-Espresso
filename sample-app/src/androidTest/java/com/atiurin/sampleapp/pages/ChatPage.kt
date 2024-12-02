package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf

object ChatPage {
    val chatTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val textInput: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { withId(R.id.send_button) }
    val sentText: Matcher<View> = allOf(withId(R.id.message_text), withText("Hi Rachel hows your cat doing?"))

}