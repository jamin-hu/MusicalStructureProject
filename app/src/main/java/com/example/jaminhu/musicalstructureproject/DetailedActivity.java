package com.example.jaminhu.musicalstructureproject;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        int selectedSongIndex = getIntent().getIntExtra("selectedSong", 0);

        Resources res = getResources();

        TextView titleView = findViewById(R.id.detailedTitle);
        TypedArray titles = res.obtainTypedArray(R.array.title);
        titleView.setText(titles.getString(selectedSongIndex));
        titles.recycle();

        ImageView imageView = findViewById(R.id.detailedImage);
        TypedArray images = res.obtainTypedArray(R.array.image);
        imageView.setImageResource(images.getResourceId(selectedSongIndex, -1));
        images.recycle();

        TextView artistView = findViewById(R.id.detailedArtist);
        TypedArray artist = res.obtainTypedArray(R.array.artist);
        artistView.setText(artist.getString(selectedSongIndex));
        artist.recycle();

        TextView lyricsView = findViewById(R.id.detailedLyrics);
        TypedArray lyrics = res.obtainTypedArray(R.array.lyrics);
        lyricsView.setText(lyrics.getString(selectedSongIndex));
        lyrics.recycle();

    }
}
