package ru.mikescherbakov.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConstructorBinding
@ConfigurationProperties(prefix = "limits-service")
public class Configuration {
    private int maximum;
    private int minimum;
}
