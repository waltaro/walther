package com.walterngo.walther.application.presentation.presenters

import javax.inject.Inject

/**
 * @author walterngo
 */
class SplashPresenter @Inject constructor() {

    lateinit var mViewSurface: ViewSurface

    fun onCreate(viewSurface: ViewSurface) {
        mViewSurface = viewSurface
        mViewSurface.navigateToMain()
    }

    interface ViewSurface {
        fun navigateToMain()
    }

}