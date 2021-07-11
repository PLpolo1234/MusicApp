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

        val adater = navi_view_recy_view_2_adapter()
        recy_view_navi_view_1.layoutManager = GridLayoutManager(this, 2)

        recy_view_navi_view_1.adapter = adater
        adater.setOnItemClickListener(object : navi_view_recy_view_2_adapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0){}
                if (position == 1){}
                if (position == 2){}
                if (position == 3){
                    val sett: Intent = Intent(applicationContext, Settings::class.java)
                    startActivity(sett)
                }
            }
        })





    }
}