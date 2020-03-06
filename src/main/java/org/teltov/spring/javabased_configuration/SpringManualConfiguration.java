package org.teltov.spring.javabased_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringManualConfiguration {
    @Bean
    public NoAnnotationRapMusic noAnnotationRapMusic() {
        return new NoAnnotationRapMusic();
    }
}
