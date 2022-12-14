package com.apap.automotiveplayground.presentation

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*

class PlaygroundScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val row = Row.Builder().setTitle("Hello Moto!").build()
        val pane = Pane.Builder().addRow(row).build()
        return PaneTemplate.Builder(pane)
            .setHeaderAction(Action.APP_ICON)
            .build()
    }
}
