package org.teltov.spring.dependency_injection;

import org.teltov.spring.inversion_of_control.Music;

import java.util.ArrayList;
import java.util.List;

public class AdvancedMusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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

    public void playMusic() {
        System.out.println(name + " is playing with volume: " + volume);
        for (Music music: this.musicList) {
            System.out.println("On air: " + music.getSong());
        }
    }
}
