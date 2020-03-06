package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.dependency_injection.AdvancedMusicPlayer;
import org.teltov.spring.inversion_of_control.MusicPlayer;

public class DependencyInjection {
    public static void runConstructorExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dependencyInjectionConstructorContext.xml"
        );

        //Music player will be created from context with injection Music that also will be created from context
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }

    public static void runSetterExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dependencyInjectionSetterContext.xml"
        );

        //This time music will be created from setter
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }

    public static void runSetterListExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dependencyInjectionSetterListContext.xml"
        );

        //This time music will be created from setter
        AdvancedMusicPlayer musicPlayer = context.getBean("advancedMusicPlayer", AdvancedMusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }


}
