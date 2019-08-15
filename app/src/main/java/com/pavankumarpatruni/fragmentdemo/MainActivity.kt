package com.pavankumarpatruni.fragmentdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pavankumarpatruni.fragmentdemo.fragments.IncrementFragment
import com.pavankumarpatruni.fragmentdemo.fragments.ShowFragment

class MainActivity : AppCompatActivity(), IncrementFragment.OnCounterClickListener {

    private var fragmentIncrement: IncrementFragment? = null
    private var fragmentShow: ShowFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentIncrement = IncrementFragment()
        fragmentShow = ShowFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentIncrement, fragmentIncrement!!)
            .replace(R.id.fragmentShow, fragmentShow!!)
            .commit()

    }

    override fun onCounterClicked(count: Int) {
        fragmentShow?.onCounterClicked(count)
    }

}
