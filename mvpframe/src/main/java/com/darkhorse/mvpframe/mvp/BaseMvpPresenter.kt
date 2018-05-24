package com.darkhorse.mvpframe.mvp

import java.lang.ref.WeakReference

/**
 * Description:
 * Created by DarkHorse on 2018/5/8.
 */
abstract class BaseMvpPresenter<M, V : BaseMvpView> {
    private var mWeakReference: WeakReference<V>? = null

    protected var mView: V? = null
        get() {
            return mWeakReference?.get()
        }

    protected var mModel: M? = null
        get() {
            if (field == null) {
                field = createModel()
            }
            return field
        }

    fun attachView(view: V) {
        mWeakReference = WeakReference(view)
    }

    fun detachView() {
        mWeakReference?.clear()
        mWeakReference = null
    }

    abstract fun createModel(): M
}