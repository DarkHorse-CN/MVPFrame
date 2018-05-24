package com.darkhorse.mvpframe.mvp

import com.darkhorse.baseframe.permission.PermissionActivity

/**
 * Description:
 * Created by DarkHorse on 2018/5/24.
 */
abstract class BaseMvpPermissionActivity<M, V : BaseMvpView, P : BaseMvpPresenter<M, V>> : PermissionActivity() {
    @Suppress("UNCHECKED_CAST")
    protected var mPresenter: P? = null
        get() {
            if (field == null) {
                field = createPresenter()
                field!!.attachView(this as V)
                hasAttach = true
            }
            return field
        }

    private var hasAttach: Boolean = false

    protected abstract fun createPresenter(): P

    override fun onDestroy() {
        super.onDestroy()
        if (hasAttach) {
            mPresenter!!.detachView()
        } else {
            hasAttach = false
        }
    }
}
