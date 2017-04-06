package com.walterngo.walther.presentation.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.walterngo.walther.R
import com.walterngo.walther.presentation.presenters.SplashPresenter
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity(), SplashPresenter.ViewSurface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        navigateToMain()
    }

    override fun navigateToMain() {
        startActivity<MainActivity>()
        finish()
    }
}
