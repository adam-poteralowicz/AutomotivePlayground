package com.apap.automotiveplayground

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    companion object {

        private val TAG = MainActivity::class.java

        private const val GEAR_UNKNOWN = "GEAR_UNKNOWN"

        // Values are taken from android.car.hardware.CarSensorEvent class.
        private val VEHICLE_GEARS = mapOf(
            0x0000 to GEAR_UNKNOWN,
            0x0001 to "GEAR_NEUTRAL",
            0x0002 to "GEAR_REVERSE",
            0x0004 to "GEAR_PARK",
            0x0008 to "GEAR_DRIVE"
        )
    }
}