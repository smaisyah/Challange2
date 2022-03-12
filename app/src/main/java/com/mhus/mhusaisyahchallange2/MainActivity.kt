package com.mhus.mhusaisyahchallange2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var gojek: Button
    private lateinit var tokped: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gojek = findViewById(R.id.btn_gojek)
        gojek.setOnClickListener(this)

        tokped = findViewById(R.id.btn_tokped)
        tokped.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_gojek -> run {
                    val intenGojek = Intent(this@MainActivity, GojekActivity::class.java)
                    startActivity(intenGojek)
                }
                R.id.btn_tokped -> run {
                    val intenTokped = Intent(this@MainActivity, TokpedActivity::class.java)
                    startActivity(intenTokped)
                }
            }
        }
    }
}