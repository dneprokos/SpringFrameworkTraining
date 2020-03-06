package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.dependency_injection.AdvancedMusicPlayer;

public class Scope {
    public static void prototype() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dependencyInjectionSetterListContext.xml"
        );

        AdvancedMusicPlayer musicPlayer1 = context.getBean("advancedMusicPlayer", AdvancedMusicPlayer.class);
        AdvancedMusicPlayer musicPlayer2 = context.getBean("advancedMusicPlayer", AdvancedMusicPlayer.class);
        musicPlayer2.setName("Second best music player");
        musicPlayer2.setVolume(90);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
