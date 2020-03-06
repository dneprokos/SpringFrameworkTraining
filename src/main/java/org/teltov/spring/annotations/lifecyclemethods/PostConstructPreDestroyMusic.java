package org.teltov.spring.annotations.lifecyclemethods;

import org.springframework.stereotype.Component;
import org.teltov.spring.annotations.AnnotationsMusic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("lifeCycleMusic")
public class PostConstructPreDestroyMusic implements AnnotationsMusic {

    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

    @PostConstruct
    public void init() {
        System.out.println("Method initialization");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Method destroy");
    }

}
