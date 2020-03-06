package org.teltov.spring.annotations;

public class AnnotationsMusicPlayer {
    private AnnotationsMusic music;
    private String name;
    private int volume;

    public AnnotationsMusicPlayer(AnnotationsMusic music) {
        this.music = music;
    }

    public void setMusic(AnnotationsMusic music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("On air: " + music.getSong());
    }
}
