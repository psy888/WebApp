package com.psy888;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\nid=" + id +
                ", \nname = " + musicPlayer.getName() +
                ", \nvolume = " + musicPlayer.getVolume() +
                ", \nmusicPlayer = " + musicPlayer.playMusic(MusicType.CLASSICAL) +
                '}';
    }
}
