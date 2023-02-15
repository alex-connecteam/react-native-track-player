package com.doublesymmetry.trackplayer

import android.content.ComponentName

interface ComponentNameProvider {
    fun getComponentNameToOverride() : ComponentName
}
