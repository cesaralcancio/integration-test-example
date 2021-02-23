package com.github.cesaralcancio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final MyData myData;

    public DataController(MyData myData) {
        this.myData = myData;
    }

    @GetMapping
    public String myData() {
        return "Hello World " + myData.getValue();
    }
}
