package com.example.lab_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondActivityFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_activity,container,false)
        val button = view.findViewById<Button>(R.id.button_to_first_activity)
        button.setOnClickListener{
            val intent = Intent(activity,MainActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}