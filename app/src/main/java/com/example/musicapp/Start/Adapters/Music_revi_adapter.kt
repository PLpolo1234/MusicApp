package com.example.musicapp.Start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.Start.Models.SongModel
import kotlinx.android.synthetic.main.music_resorver_revi.view.*


class Music_revi_adapter(SongModel:ArrayList<SongModel>): RecyclerView.Adapter<MyViewHolder>(){

    var mSongModel = SongModel

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(viewGroup.context)
        val menu_songs = layoutInflater.inflate(R.layout.music_resorver_revi, viewGroup,false)


        return MyViewHolder(menu_songs)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        if (mSongModel.size==0 || mSongModel.size == null){
            holder.song_name.text = "a"
            holder.song_author.text = "a"
        }else{
            var model = mSongModel[position]

            var SongName = model.mSongName

            holder!!.song_name.text = SongName
            //holder.song_name.text = "b"
            holder.song_author.text = "b"
        }

    }

    override fun getItemCount(): Int {

        //return mSongModel.size
        return 2
    }


}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view){

    var song_name:TextView
    var song_author:TextView


    init {
        song_name = view.findViewById(R.id.music_name)
        song_author = view.findViewById(R.id.music_author)
    }
}