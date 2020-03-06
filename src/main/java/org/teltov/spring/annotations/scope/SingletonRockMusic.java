package org.teltov.spring.annotations.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsMusic;

@Component
@Scope("singleton")
public class SingletonRockMusic implements AnnotationsMusic {
    private String song = "Bohemian Rhapsody";

    @Override
    public String getSong() {
        return song;
    }

    public void setSong() { this.song = song; }
}
