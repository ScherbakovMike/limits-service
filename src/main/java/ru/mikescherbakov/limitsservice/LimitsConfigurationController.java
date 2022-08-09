package ru.mikescherbakov.limitsservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsConfigurationController
{
    private final Configuration config;

    @GetMapping("/limits")
    public Configuration retrieveLimitsFromConfigurations()
    {
        return config;
    }
}