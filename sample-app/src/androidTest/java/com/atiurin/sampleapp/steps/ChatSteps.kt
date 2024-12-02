package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatSteps {

    fun sendText(textToSend: String) {
        ChatPage.textInput.typeText(textToSend)
        ChatPage.sendButton.tap()
    }

    fun checkSentText(textToSend: String) {
        Assert.assertEquals(textToSend, ChatPage.sentText.getText())
    }


}