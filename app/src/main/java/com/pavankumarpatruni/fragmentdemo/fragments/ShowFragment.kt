package com.pavankumarpatruni.fragmentdemo.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.pavankumarpatruni.fragmentdemo.R
import kotlinx.android.synthetic.main.fragment_show.view.*

class ShowFragment : Fragment() {

    private var textViewCounter: TextView? = null
    private var valCounter: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_show, container, false)

        textViewCounter = view.textViewCounter
        textViewCounter?.let {
            it.text = valCounter.toString()
        }

        return view
    }

    fun onCounterClicked(count: Int) {
        textViewCounter?.text = count.toString()
    }

}
