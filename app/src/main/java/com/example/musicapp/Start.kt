package com.example.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.musicapp.baza_danych.navi_view_recy_view_2_adapter
import kotlinx.android.synthetic.main.activity_start.*

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        recy_view_navi_view_1.layoutManager = GridLayoutManager(this, 2)
        recy_view_navi_view_1.adapter = navi_view_recy_view_2_adapter()



        u1.setOnClickListener(View.OnClickListener {

            val sett: Intent = Intent(applicationContext, Settings::class.java)
            startActivity(sett)

        })

    }
}