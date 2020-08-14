package com.hifive.songgame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

// @lombok
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String title;
    private String artist;
    private String lyrics;
    private String genre;

    public Song(){}

    public Song(int id, String title, String artist, String lyrics, String genre){
        this.id = id;
        this.title = title;
        this.lyrics = lyrics;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    
    

    
}