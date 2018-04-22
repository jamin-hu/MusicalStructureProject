package com.example.jaminhu.musicalstructureproject;

public class Song {

    private String mSongTitle;
    private String mSongArtist;
    private int mSongImage;

    public Song(String songTitle, String songArtist, int songImage) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongImage = songImage;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public int getSongImage() {
        return mSongImage;
    }
}
