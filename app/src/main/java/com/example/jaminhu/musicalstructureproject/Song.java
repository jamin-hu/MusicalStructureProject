package com.example.jaminhu.musicalstructureproject;

public class Song {

    private String mSongTitle;
    private String mSongArtist;
    private String mSongLyrics;
    private int mSongImage;

    public Song(String songTitle, String songArtist, String songLyrics, int songImage) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongLyrics = songLyrics;
        mSongImage = songImage;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongArtist() {
        return mSongArtist;
    }

    public String getSongLyrics() {
        return mSongLyrics;
    }

    public int getSongImage() {
        return mSongImage;
    }
}
