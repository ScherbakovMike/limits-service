package ru.mikescherbakov.limitsservice.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LimitConfiguration {
    private final int maximum;
    private final int minimum;
}
