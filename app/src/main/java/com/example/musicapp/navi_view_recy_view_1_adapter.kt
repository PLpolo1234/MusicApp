//package com.example.musicapp
//
//import android.R
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.musicapp.baza_danych.Menu_database_1
//import kotlinx.android.synthetic.main.menu_recy_view_1.view.*
//
//
//class navi_view_recy_view_1_adapter: RecyclerView.Adapter<MyViewHolder>()
////{
////    override fun onCreateViewHolder(viewGrop: ViewGroup, p1: Int): MyViewHolder
////    {
////        val layoutInflater = LayoutInflater.from(viewGrop.context)
////        val menu_piece = layoutInflater.inflate(R.layout.menu_recy_view_1, viewGrop, false)
////        return MyViewHolder(menu_piece)
////
////    }
////
////    override fun onBindViewHolder(holder: MyViewHolder, position: Int)
////    {
////        val name = holder.view.text_menu_1
////        val image = holder.view.menu_image_1
////
////        name.setText(Menu_database_1.names_menu_1[position])
//////        //image.setImageResource()
//////        val context: Context = image.getContext()
//////        val id: Int = context.getResources().getIdentifier(Menu_database_1.image_names_menu_1.toString(), "drawable", context.getPackageName())
//////        image.setImageResource(id)
////
////    }
////
////
////
////    override fun getItemCount(): Int
////    {
////       return 2
////    }
//
//}

