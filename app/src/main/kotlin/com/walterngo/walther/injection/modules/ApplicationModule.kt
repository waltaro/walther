package com.walterngo.walther.injection.modules

import android.content.Context
import com.walterngo.walther.WaltherApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author walterngo
 */

@Module
class ApplicationModule(val waltherApplication: WaltherApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return waltherApplication
    }
}