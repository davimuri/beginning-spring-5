package com.bsg5.chapter3.mem04;

import com.bsg5.chapter3.MusicService;
import com.bsg5.chapter3.MusicServiceTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = "/config-04.xml")
public class TestMusicService4 extends AbstractTestNGSpringContextTests {
    @Autowired
    MusicService service;
    @Autowired
    MusicServiceTests tests;

    @Test
    public void testSongVoting() {
        tests.testSongVoting(service);
    }

    @Test
    public void testGetMatchingArtistNames() {
        tests.testMatchingArtistNames(service);
    }

    @Test
    public void testGetSongsForArtist() {
        tests.testSongsForArtist(service);
    }

    @Test
    public void testMatchingSongNamesForArtist() {
        tests.testMatchingSongNamesForArtist(service);
    }

}
