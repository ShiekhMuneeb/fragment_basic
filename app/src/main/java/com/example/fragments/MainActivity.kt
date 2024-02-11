package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Istfrag = Fragment1()
        val secfrag = Fragment2()
        val first_frag: Button = findViewById(R.id.frag1)
        val sec_frag: Button = findViewById(R.id.frag2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, Istfrag).commit()
        }
        first_frag.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, Istfrag).commit()
            }

            sec_frag.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fragmentContainer, secfrag).commit()
                }
        }
    }}}