package org.teltov.spring.annotations.component;

import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsMusic;

@Component
public class AnnotationsClassicalMusic implements AnnotationsMusic {

    private AnnotationsClassicalMusic() {}

    public static AnnotationsClassicalMusic getClassicalMusic() {
        return new AnnotationsClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Four Seasons";
    }

    public void doInit() {
        System.out.println("Classical Music: This method is running before bean creation");
    }

    public void doDestroy() {
        System.out.println("Classical Music: This method is running right before destruction");
    }
}
