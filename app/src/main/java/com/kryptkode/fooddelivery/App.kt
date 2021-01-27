package com.kryptkode.fooddelivery

import android.app.Application
import com.airbnb.mvrx.Mavericks
import com.kryptkode.core.di.coreModule
import com.kryptkode.shopping.di.shoppingModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
        initTimberLogger()
        startKoin {
            // Android context
            androidContext(this@App)
            // modules
            modules(coreModule, shoppingModule)
        }
    }

    private fun initTimberLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
