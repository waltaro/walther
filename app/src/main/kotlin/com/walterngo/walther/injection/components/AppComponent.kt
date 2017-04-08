package com.walterngo.walther.injection.components

import com.walterngo.walther.WaltherApplication
import com.walterngo.walther.injection.modules.AppComponentModule
import com.walterngo.walther.injection.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author walterngo
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, AppComponentModule::class))
interface AppComponent {
    fun inject(waltherApplication: WaltherApplication)
}