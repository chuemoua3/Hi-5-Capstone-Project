package com.hifive.songgame;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class DemoApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(DemoApplication.class, args);
// 	}

// }

import com.hifive.songgame.model.Song;
import com.hifive.songgame.repository.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private SongRepository songRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// this.songRepository.save(new Song(artist, genre, lyrics, songtitle))

		this.songRepository.save(new Song("Chris Brown", "Hip-Hop",
				"Oh, baby, everything you do is amazing Aint nobody watching, go crazy, I got what you need…",
				"Go Crazy"));
		this.songRepository.save(new Song("Drake", "Hip-Hop",
				"Man what a time to be alive.  You and yours vs me and mine.  Oh we talking teams? Oh we talking teams? Oh you switchin sides? Wanna come with me?",
				"Big Rings"));
		this.songRepository.save(new Song("Tim McGraw", "Country",
				"Dont expect a free ride from no one.  Dont hold a grudge or a chip and heres why.  Bitterness keeps you from flyin.  Always stay humble and kind.",
				"Ring of Fire"));
		this.songRepository.save(new Song("test", "test", "test", "test"));

		// this.songRepository.save(new Song());

	}
}
