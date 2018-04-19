package com.example.jaminhu.musicalstructureproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Careless Whisper", "George Michael", "I'm never gonna dance again", R.drawable.careless));
        songs.add(new Song("Hello", "Lionel Richie", "Hello... is it me you\'re looking for?", R.drawable.hello));
        songs.add(new Song("September", "Earth Wind and Fire", "Do you remember, the 21st night of september", R.drawable.september));

        LibraryAdapter libraryAdapter = new LibraryAdapter(this, songs);
        ListView library = (ListView) findViewById(R.id.library_list);
        library.setAdapter(libraryAdapter);
    }
}