package com.rnexitapp

import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class NativeExitAppPackage : TurboReactPackage() {

    override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? =
            if (name == NativeExitAppModule.NAME) {
                NativeExitAppModule(reactContext)
            } else {
                null
            }

    override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
        mapOf(
                NativeExitAppModule.NAME to ReactModuleInfo(
                        _name = NativeExitAppModule.NAME,
                        _className = NativeExitAppModule.NAME,
                        _canOverrideExistingModule = false,
                        _needsEagerInit = false,
                        isCxxModule = false,
                        isTurboModule = true
                )
        )
    }
}