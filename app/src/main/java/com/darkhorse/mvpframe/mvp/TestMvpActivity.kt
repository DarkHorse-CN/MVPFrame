package com.darkhorse.mvpframe.mvp

import android.view.View
import android.widget.Toast
import com.darkhorse.mvpframe.R
import com.darkhorse.mvpframe.mvp.contract.TestMvpContract
import com.darkhorse.mvpframe.mvp.presenter.TestMvpPresenter
import kotlinx.android.synthetic.main.activity_test_mvp.*

class TestMvpActivity : BaseMvpActivity<TestMvpContract.Model, TestMvpContract.View, TestMvpPresenter>(), TestMvpContract.View, View.OnClickListener {

    override fun createPresenter(): TestMvpPresenter = TestMvpPresenter()

    override fun getLayoutId(): Int = R.layout.activity_test_mvp

    override fun initView() {

    }

    override fun initListener() {
        btn_test.setOnClickListener(this)
    }

    override fun initData() {
    }

    override fun onSuccess() {
        Toast.makeText(mContext, "666", Toast.LENGTH_SHORT).show()
    }

    override fun onFailure() {

    }

    override fun onClick(v: View?) {
        when (v) {
            btn_test -> mPresenter.getData()
        }
    }

}
