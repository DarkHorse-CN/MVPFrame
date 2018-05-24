package com.darkhorse.mvpframe

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Description:
 * Created by DarkHorse on 2018/5/8.
 */
abstract class BaseActivity : AppCompatActivity() {
    protected lateinit var mContext: Context
    protected var mBundle: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        preSetContentView()
        setContentView(getLayoutId())
        initView()
        initListener()
        initData()
    }

    protected fun preSetContentView() {

    }

    abstract fun getLayoutId(): Int

    abstract fun initView()

    abstract fun initListener()

    abstract fun initData()

    protected fun startActivity(clz: Class<out Activity>) {
        startActivity(Intent(mContext, clz))
    }

    protected fun startActivity(clz: Class<out Activity>, bundle: Bundle) {
        val intent = Intent(mContext, clz)
        intent.putExtra("data", bundle)
        startActivity(intent)
    }

    protected fun getBundle(): Bundle? {
        if (mBundle == null) {
            mBundle = intent.getBundleExtra("data")
        }
        return mBundle
    }


}