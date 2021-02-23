package com.github.cesaralcancio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyData {

    @Value("${my.data.value}")
    private String value;

    public String getValue() {
        return value;
    }
}
