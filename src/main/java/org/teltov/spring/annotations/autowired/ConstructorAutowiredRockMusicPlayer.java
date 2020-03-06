package org.teltov.spring.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsRockMusic;

@Component("rockPlayer")
public class ConstructorAutowiredRockMusicPlayer {
    private AnnotationsRockMusic music;

    @Autowired
    public ConstructorAutowiredRockMusicPlayer(AnnotationsRockMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("On air: " + music.getSong());
    }
}
