package com.example.musicapp.Start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import kotlinx.android.synthetic.main.music_resorver_revi.view.*


class Music_revi_adapter(val Song_name_list: ArrayList<String>): RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val menu_songs = layoutInflater.inflate(R.layout.music_resorver_revi, viewGroup,false)


        return MyViewHolder(menu_songs)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val song_name = holder.view.music_name
        val song_author = holder.view.music_author



        song_name.setText("x")
        song_author.setText("x")

    }

    override fun getItemCount(): Int {
        return 2
    }


}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view)