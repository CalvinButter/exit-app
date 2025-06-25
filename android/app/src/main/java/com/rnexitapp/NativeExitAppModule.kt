package com.rnexitapp

import android.content.Context
import android.content.SharedPreferences
import com.givebutter.exitapp.NativeExitAppSpec
import com.facebook.react.bridge.ReactApplicationContext

class NativeExitAppModule(reactContext: ReactApplicationContext) : NativeExitAppSpec(reactContext) {
    override fun getName() = NAME

    override fun exitApp() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    companion object {
        const val NAME = "NativeExitApp"
    }
}