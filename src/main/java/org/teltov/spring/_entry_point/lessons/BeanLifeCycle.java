package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.inversion_of_control.ClassicalMusic;

public class BeanLifeCycle {
    public static void singletonInitAndDestruction() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lifeCycleContext.xml"
        );

        ClassicalMusic classicalMusicSingleton = context.getBean("classicMusicBean", ClassicalMusic.class);
        classicalMusicSingleton.getSong();
        context.close();
    }

    public static void prototypeCallsOnlyInit() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lifeCycleContext.xml"
        );

        //For beans with scope prototype destroy method will not be called
        ClassicalMusic classicalMusicPrototype = context.getBean("classicMusicPrototypeBean", ClassicalMusic.class);
        classicalMusicPrototype.getSong();

        context.close();
    }

    public static void factoryMethodCall() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lifeCycleContext.xml"
        );

        //Factory method Spring understands it's Singleton.
        ClassicalMusic classicalMusicFactoryMethod = context.getBean("factoryMethodClassicalMusicBean", ClassicalMusic.class);
        classicalMusicFactoryMethod.getSong();

        context.close();
    }
}
