package com.darkhorse.mvpframe.mvp.presenter

import com.darkhorse.mvpframe.mvp.BaseMvpPresenter
import com.darkhorse.mvpframe.mvp.contract.TestMvpContract
import com.darkhorse.mvpframe.mvp.model.TestMvpModel

/**
 * Description:
 * Created by DarkHorse on 2018/5/8.
 */
class TestMvpPresenter : TestMvpContract.Presenter, BaseMvpPresenter<TestMvpContract.Model, TestMvpContract.View>() {
    override fun getData() {
        if (mModel!!.getData()) {
            mView!!.onSuccess()
        }
    }

    override fun createModel(): TestMvpContract.Model = TestMvpModel()
}
