package com.apap.automotiveplayground.session

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session
import com.apap.automotiveplayground.presentation.PlaygroundScreen

class PlaygroundSession : Session() {

    override fun onCreateScreen(intent: Intent): Screen = PlaygroundScreen(carContext)

}