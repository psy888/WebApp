package com.psy888;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private MusicPlayer() {
    }




    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(MusicType type) {
        switch (type) {
            case ROCK:
                return "Playing " + music.getSong();
            case CLASSICAL:
                return "Playing " + music2.getSong();
            default:
                return "not selected music type";
        }
    }


}
