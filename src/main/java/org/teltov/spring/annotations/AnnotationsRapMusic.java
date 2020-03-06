package org.teltov.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class AnnotationsRapMusic implements AnnotationsMusic {
    @Override
    public String getSong() {
        return "Lose yourself";
    }
}
