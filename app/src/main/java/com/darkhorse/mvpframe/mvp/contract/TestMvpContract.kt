package com.darkhorse.mvpframe.mvp.contract
import com.darkhorse.mvpframe.mvp.BaseMvpView

/**
 * Description:
 * Created by DarkHorse on 2018/5/8.
 */
interface TestMvpContract {
    interface Model {
        fun getData(): Boolean
    }

    interface View : BaseMvpView {
        fun onSuccess()
        fun onFailure()
    }

    interface Presenter  {
        fun getData()
    }

}
