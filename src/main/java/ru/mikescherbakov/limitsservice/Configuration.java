package ru.mikescherbakov.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limits-service")
@Getter
@Setter
public class Configuration {
    private int maximum;
    private int minimum;
}
