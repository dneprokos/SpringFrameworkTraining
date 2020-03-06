package org.teltov.spring.inversion_of_control;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
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
