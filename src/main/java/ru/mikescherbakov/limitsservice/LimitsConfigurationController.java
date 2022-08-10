package ru.mikescherbakov.limitsservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mikescherbakov.limitsservice.bean.LimitConfiguration;

@RestController
@RequiredArgsConstructor
public class LimitsConfigurationController {
    private final Configuration config;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(
                config.getMaximum(),
                config.getMinimum()
        );
    }
}