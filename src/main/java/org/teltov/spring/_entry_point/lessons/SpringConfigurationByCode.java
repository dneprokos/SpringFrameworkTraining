package org.teltov.spring._entry_point.lessons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.teltov.spring.javabased_configuration.ConfigurationMusicPlayer;
import org.teltov.spring.javabased_configuration.NoAnnotationRapMusic;
import org.teltov.spring.javabased_configuration.SpringAutoConfiguration;
import org.teltov.spring.javabased_configuration.SpringManualConfiguration;

public class SpringConfigurationByCode {
    public static void springCodeAutoConfigurationExample() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringAutoConfiguration.class);

        ConfigurationMusicPlayer musicPlayer =
                context.getBean("configurationMusicPlayer", ConfigurationMusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusic();

        context.close();
    }

    //Just example. Better to use Component and Autowired
    public static void springCodeManualConfigurationExample() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringManualConfiguration.class);

        NoAnnotationRapMusic rapMusic = context.getBean("noAnnotationRapMusic", NoAnnotationRapMusic.class);
        System.out.println(rapMusic.getSong());
    }
}
