package com.hifive.songgame.controller;

import java.util.List;

import com.hifive.songgame.model.Song;
// import com.hifive.songgame.model.SongRequest;
import com.hifive.songgame.repository.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SongController {
    
    @Autowired
    SongRepository songRepository;

    @PostMapping("/post")
    public void postSong(@RequestBody Song song){
        songRepository.save(song);
    }

    @PostMapping("/forcepost")
    public void forcePostSong(){
        songRepository.save(new Song("Get Jiggy", "Will Smith", "Get jiggy with it", "Pop"));
    }



    @GetMapping("/all")
    public List<Song> getSong(){
        return songRepository.findAll();
    }

    @GetMapping("/{name}")
    public Song getSongByTitle(@PathVariable String title){
        return songRepository.findByName(title);
    }

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome to my Backend Fam";
    }
}