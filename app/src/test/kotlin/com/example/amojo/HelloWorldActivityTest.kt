package com.example.amojo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HelloWorldActivityTest {
    @Test
    fun saysHelloWorld() {
        val activity = HelloWorldActivity()
        assertEquals("Hello World!", activity.message)
    }
}
