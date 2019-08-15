package com.pavankumarpatruni.fragmentdemo.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pavankumarpatruni.fragmentdemo.R
import kotlinx.android.synthetic.main.fragment_increment.view.*


class IncrementFragment : Fragment() {

    private var counter: Int = 0
    private lateinit var callback: OnCounterClickListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_increment, container, false)

        view.buttonIncrement.setOnClickListener {
            callback.onCounterClicked(++counter)
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnCounterClickListener) {
            callback = context
        } else {
            throw RuntimeException("$context must implement OnCounterClickListener")
        }
    }

    interface OnCounterClickListener {
        fun onCounterClicked(count: Int)
    }

}
