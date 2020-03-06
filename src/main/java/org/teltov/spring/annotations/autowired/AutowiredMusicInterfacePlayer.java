package org.teltov.spring.annotations.autowired;

import org.teltov.spring.annotations.AnnotationsMusic;

//@Component("allMusicPlayer")
public class AutowiredMusicInterfacePlayer {
    private AnnotationsMusic music;

    //@Autowired
    public AutowiredMusicInterfacePlayer(AnnotationsMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("On air: " + music.getSong());
    }
}
