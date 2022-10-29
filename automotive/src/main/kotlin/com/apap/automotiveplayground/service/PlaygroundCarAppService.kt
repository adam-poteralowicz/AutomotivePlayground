package com.apap.automotiveplayground.service

import android.content.pm.ApplicationInfo
import androidx.car.app.CarAppService
import com.apap.automotiveplayground.R.array.hosts_allowlist
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import com.apap.automotiveplayground.session.PlaygroundSession

class PlaygroundCarAppService : CarAppService() {

    override fun createHostValidator(): HostValidator =
        if ((applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0) {
            HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
        } else {
            HostValidator.Builder(applicationContext)
                .addAllowedHosts(hosts_allowlist)
                .build()
        }

    override fun onCreateSession(): Session = PlaygroundSession()
}