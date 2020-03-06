package org.teltov.spring.annotations;

import org.springframework.stereotype.Component;

@Component("newRockMusic")
public class AnnotationsRockMusic implements AnnotationsMusic {
    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
