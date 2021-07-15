package com.example.musicapp;

import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class tests {


    String[] items;

    public ArrayList<File> findSong(File file)
    {
        ArrayList<File> arrayList = new  ArrayList<>();
        File[] files = file.listFiles();

        for(File singleFile : files)
        {
            if(singleFile.isDirectory() && !singleFile.isHidden())
            {
                arrayList.addAll(findSong(singleFile));
            }
            else
            {

                if(singleFile.getName().endsWith(".mp3") || singleFile.getName().endsWith(".wav"))
                {
                    arrayList.add(singleFile);
                }

            }


        }
        return arrayList;
    }

    public void displaySong()
    {
        final ArrayList<File> mySong = findSong(Environment.getExternalStorageDirectory());
        items = new String[mySong.size()];
        for (int i=0;i<mySong.size();i++)
        {
            items[i]=mySong.get(i).getName().toString().replace(".mp3","").replace(".wav","");
        }

        int length = items.length;

    }
}

