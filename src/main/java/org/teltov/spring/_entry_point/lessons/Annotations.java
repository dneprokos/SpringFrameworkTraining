package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.annotations.autowired.ConstructorAutowiredRockMusicPlayer;
import org.teltov.spring.annotations.autowired.FieldAutowiredRockMusicPlayer;
import org.teltov.spring.annotations.autowired.SetterAutowiredRockMusicPlayer;
import org.teltov.spring.annotations.AnnotationsMusic;
import org.teltov.spring.annotations.AnnotationsMusicPlayer;
import org.teltov.spring.annotations.AnnotationsRapMusic;
import org.teltov.spring.annotations.lifecyclemethods.PostConstructPreDestroyMusic;
import org.teltov.spring.annotations.qualifier.RockQualifierPlayer;
import org.teltov.spring.annotations.scope.PrototypeRockMusic;
import org.teltov.spring.annotations.scope.SingletonRockMusic;
import org.teltov.spring.annotations.value.ValueMusicPlayer;

public class Annotations {
    public static void runComponentExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        //No bean defined in xml context xml file. It just creates bean reading Component annotation
        //You should only define where to scan in context.xml file
        AnnotationsMusic music = context.getBean("newRockMusic", AnnotationsMusic.class);
        AnnotationsMusicPlayer musicPlayer = new AnnotationsMusicPlayer(music);
        musicPlayer.playMusic();

        //This time bean id was not defined. It just converts class name to bean identifier
        AnnotationsMusic music2 = context.getBean("annotationsRapMusic", AnnotationsRapMusic.class);
        AnnotationsMusicPlayer musicPlayer2 = new AnnotationsMusicPlayer(music2);
        musicPlayer2.playMusic();

        context.close();
    }

    public static void runRockMusicConstructorAutowiredExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        //Exception will be thrown in case when Expected Bean has not been found
        ConstructorAutowiredRockMusicPlayer musicPlayer = context.getBean("rockPlayer", ConstructorAutowiredRockMusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }

    public static void runRockMusicSetterAutowiredExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        //Exception will be thrown in case when Expected Bean has not been found
        SetterAutowiredRockMusicPlayer musicPlayer = context.getBean("rockPlayerSetter", SetterAutowiredRockMusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }

    public static void runRockMusicFieldAutowiredExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        //It will create a bean even from private field
        FieldAutowiredRockMusicPlayer musicPlayer = context.getBean("rockPlayerField", FieldAutowiredRockMusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }

    public static void runRockQualifierExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        //It will create a bean even from private field
        RockQualifierPlayer musicPlayer = context.getBean("rockQualifierPlayer", RockQualifierPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }

    public static void runMusicPlayerWithValueAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        ValueMusicPlayer musicPlayer = context.getBean("valueMusicPlayer", ValueMusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }

    public static void runSingletonScopeAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        SingletonRockMusic rockMusic1 = context.getBean("singletonRockMusic", SingletonRockMusic.class);
        SingletonRockMusic rockMusic2 = context.getBean("singletonRockMusic", SingletonRockMusic.class);

        System.out.println(rockMusic1 == rockMusic2);

        context.close();
    }

    public static void runPrototypeScopeAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        PrototypeRockMusic rockMusic1 = context.getBean("prototypeRockMusic", PrototypeRockMusic.class);
        PrototypeRockMusic rockMusic2 = context.getBean("prototypeRockMusic", PrototypeRockMusic.class);

        System.out.println(rockMusic1 == rockMusic2);

        context.close();
    }

    public static void runMusicWithLifeCycleAnnotations() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "annotationsContext.xml"
        );

        PostConstructPreDestroyMusic rockMusic = context.getBean("lifeCycleMusic", PostConstructPreDestroyMusic.class);

        context.close();
    }


}
