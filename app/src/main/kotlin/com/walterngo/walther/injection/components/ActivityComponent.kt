package com.walterngo.walther.injection.components

import com.walterngo.walther.application.presentation.activities.SplashActivity
import com.walterngo.walther.injection.scopes.ActivityScope
import dagger.Component

/**
 * @author walterngo
 */

@Component(dependencies = arrayOf(AppComponent::class))
@ActivityScope
interface ActivityComponent {
    fun inject(splashActivity: SplashActivity)
}