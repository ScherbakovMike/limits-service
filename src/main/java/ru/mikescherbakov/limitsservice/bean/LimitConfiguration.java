package ru.mikescherbakov.limitsservice.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter @Setter
public class LimitConfiguration {
    private final int maximum;
    private final int minimum;
}
