package com.example.musicapp.Info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.musicapp.R
import kotlinx.android.synthetic.main.activity_settings.*

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        back_bt.setOnClickListener {
            onBackPressed()

        }

    }
}