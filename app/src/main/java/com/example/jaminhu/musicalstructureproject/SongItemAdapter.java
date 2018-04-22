package com.example.jaminhu.musicalstructureproject;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongItemAdapter extends ArrayAdapter<Song>{

    public SongItemAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.songTitle);
        titleTextView.setText(currentSong.getSongTitle());

        TextView artistTextView = listItemView.findViewById(R.id.songArtist);
        artistTextView.setText(currentSong.getSongArtist());

        ImageView imageView = listItemView.findViewById(R.id.songImage);
        imageView.setImageResource(currentSong.getSongImage());

        return listItemView;
    }
}
