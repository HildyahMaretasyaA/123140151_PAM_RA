package com.example.praktikum1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "PRAKTIKUM1_123140151",
    ) {
        App()
    }
}