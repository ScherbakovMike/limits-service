package ru.mikescherbakov.limitsservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @GetMapping("/fault-tolerance-example")
    //configuring a fallback method
    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfigurations")
    public LimitConfiguration retrieveConfigurations() {
        throw new RuntimeException("Not Available");
    }

    //defining the fallback method
    public LimitConfiguration fallbackRetrieveConfigurations() {
    //returning the default configuration
        return new LimitConfiguration(999, 9);
    }
}