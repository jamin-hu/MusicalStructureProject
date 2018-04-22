package com.example.jaminhu.musicalstructureproject;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();

        Resources res = getResources();

        TypedArray titleArray = res.obtainTypedArray(R.array.title);
        TypedArray artistArray = res.obtainTypedArray(R.array.artist);
        TypedArray imageArray = res.obtainTypedArray(R.array.image);

        for (int i=0; i<titleArray.length(); i++){
            songs.add(new Song(titleArray.getString(i), artistArray.getString(i), imageArray.getResourceId(i, -1)));
        }

        SongItemAdapter songItemAdapter = new SongItemAdapter(this, songs);
        ListView library = findViewById(R.id.library_list);
        library.setAdapter(songItemAdapter);

        library.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(view.getContext(), DetailedActivity.class);
                intent.putExtra("selectedSong", position);
                startActivity(intent);
            }
        });
    }
}