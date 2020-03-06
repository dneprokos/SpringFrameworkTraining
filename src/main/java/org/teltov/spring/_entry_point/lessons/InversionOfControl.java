package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.inversion_of_control.Music;
import org.teltov.spring.inversion_of_control.MusicPlayer;

public class InversionOfControl {
    public static void run() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "inversionOfControlContext.xml"
        );

        //You can change bean class in inversionOfControlContext.xml
        //As an example you may set RockMusic instead of classical
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }
}
