package com.walterngo.walther

import android.app.Application
import com.walterngo.walther.injection.components.AppComponent
import com.walterngo.walther.injection.components.DaggerAppComponent
import com.walterngo.walther.injection.modules.AppComponentModule
import com.walterngo.walther.injection.modules.ApplicationModule

/**
 * @author walterngo
 */
class WaltherApplication : Application() {

    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initialiseDagger()
    }

    fun initialiseDagger() {
        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(ApplicationModule(this))
                .appComponentModule(AppComponentModule(this))
                .build()
        mAppComponent.inject(this)
    }

    fun getAppComponent(): AppComponent {
        return mAppComponent
    }
}