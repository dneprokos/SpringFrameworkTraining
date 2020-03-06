package org.teltov.spring.inversion_of_control;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }
}
