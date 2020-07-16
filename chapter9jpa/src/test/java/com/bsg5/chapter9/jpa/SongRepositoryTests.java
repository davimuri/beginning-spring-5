package com.bsg5.chapter9.jpa;

import com.bsg5.chapter9.test.BaseSongRepositoryTests;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class SongRepositoryTests
        extends BaseSongRepositoryTests<Artist, Song, Integer> {
    @Override
    protected Artist createArtist(String name) {
        return new Artist(name);
    }

    @Override
    protected Song createSong(Artist artist, String name) {
        return new Song(artist, name);
    }
}