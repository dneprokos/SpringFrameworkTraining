package org.teltov.spring.javabased_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.teltov.spring.javabased_configuration")
@PropertySource("classpath:musicPlayer.properties")
public class SpringAutoConfiguration {

}
