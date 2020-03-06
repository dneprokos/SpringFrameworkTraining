package org.teltov.spring.javabased_configuration;

import org.springframework.stereotype.Component;

@Component
public class ConfigurationRapMusic implements IMusic {
    @Override
    public String getSong() {
        return "Lose yourself";
    }
}
