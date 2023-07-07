package com.bookmark.utility;

import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bookmark.entity.Bookmark;
import com.bookmark.repository.BookmarkRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
	private final BookmarkRepository repository;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * repository.save(new Bookmark(null, "SpringBootKuberTutorial"
		 * ,"https://www.youtube.com/watch?v=UhEMh-HZIMY&list=PLuNxlOYbv61h66_QlcjCEkVAj6RdeplJJ&index=3",
		 * Instant.now())); repository.save(new Bookmark(null, "google"
		 * ,"https://www.google.com/", Instant.now())); repository.save(new
		 * Bookmark(null, "facebook" ,"https://www.facebook.com/", Instant.now()));
		 * repository.save(new Bookmark(null, "twitter" ,"https://www.twitter.com/",
		 * Instant.now())); repository.save(new Bookmark(null, "linkedin"
		 * ,"https://www.linkedin.com/", Instant.now())); repository.save(new
		 * Bookmark(null, "posco" ,"https://www.posco.com/", Instant.now()));
		 * repository.save(new Bookmark(null, "govin" ,"https://www.gov.in.com/",
		 * Instant.now())); repository.save(new Bookmark(null, "incometax"
		 * ,"https://www.income.com/", Instant.now())); repository.save(new
		 * Bookmark(null, "gmail" ,"https://www.gmail.com/", Instant.now()));
		 */
	}

}
