package com.example.amojo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HelloWorldActivity : Activity() {
    companion object {
        const val HELLO_MESSAGE = "Hello World!"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply { text = HELLO_MESSAGE }
        setContentView(textView)
    }
}
