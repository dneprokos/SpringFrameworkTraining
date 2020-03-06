package org.teltov.spring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsMusic;

@Component
public class RockQualifierPlayer {
    @Autowired
    @Qualifier("newRockMusic")
    private AnnotationsMusic music;

    public void playMusic() {
        System.out.println("On air: " + music.getSong());
    }
}
