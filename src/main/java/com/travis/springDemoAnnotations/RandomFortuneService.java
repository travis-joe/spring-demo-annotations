package com.travis.springDemoAnnotations;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "bye bye";
    }
}
