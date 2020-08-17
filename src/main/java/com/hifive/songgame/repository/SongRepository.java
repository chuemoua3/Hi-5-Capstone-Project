package com.hifive.songgame.repository;


import com.hifive.songgame.model.Song;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SongRepository extends JpaRepository <Song, Long>{
    Song findByName(String title);
    
}