package org.teltov.spring.inversion_of_control;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Lose yourself";
    }
}
