package com.darkhorse.mvpframe.mvp.model

import com.darkhorse.mvpframe.mvp.contract.TestMvpContract

/**
 * Description:
 * Created by DarkHorse on 2018/5/8.
 */
class TestMvpModel : TestMvpContract.Model {
    override fun getData(): Boolean {
        return true
    }
}
