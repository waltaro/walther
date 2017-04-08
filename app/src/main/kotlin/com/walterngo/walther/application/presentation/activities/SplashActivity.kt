package com.walterngo.walther.application.presentation.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.walterngo.walther.WaltherApplication
import com.walterngo.walther.application.presentation.presenters.SplashPresenter
import com.walterngo.walther.injection.components.DaggerActivityComponent
import org.jetbrains.anko.startActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), SplashPresenter.ViewSurface {

    @Inject
    lateinit var mSplashPresenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerActivityComponent.builder()
                .appComponent((application as WaltherApplication).getAppComponent())
                .build()
                .inject(this)
        mSplashPresenter.onCreate(this)
    }

    override fun navigateToMain() {
        startActivity<MainActivity>()
        finish()
    }
}
