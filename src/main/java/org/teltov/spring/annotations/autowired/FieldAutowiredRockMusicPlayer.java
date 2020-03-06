package org.teltov.spring.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsRockMusic;

@Component("rockPlayerField")
public class FieldAutowiredRockMusicPlayer {

    @Autowired
    private AnnotationsRockMusic music;

    public void playMusic() {
        System.out.println("On air: " + music.getSong());
    }
}
