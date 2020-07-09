package kr.co.tjoeun.fragment_20200709

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setupValues()


}