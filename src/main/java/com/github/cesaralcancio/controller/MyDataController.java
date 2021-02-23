package com.github.cesaralcancio.controller;

import com.github.cesaralcancio.utils.MyData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDataController {

    private final MyData myData;

    public MyDataController(MyData myData) {
        this.myData = myData;
    }

    @GetMapping
    public String myData() {
        return "Hello World " + myData.getValue();
    }
}
