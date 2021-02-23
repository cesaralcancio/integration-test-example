package com.github.cesaralcancio.integration.testes;

import com.github.cesaralcancio.utils.MyData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("integration")
public class ValidateConnectionsWithContainers {

    @Autowired
    private MyData mydata;

    @Test
    public void validate() {
        System.out.println("Running integration tests and connecting to the containers started...");
        System.out.println("Also checking the my.data.value in the properties file. As it is integration tests scope, it is different from the one into the src/main...");
        System.out.println("To check more how failsafe works: https://maven.apache.org/surefire/maven-failsafe-plugin/examples/junit-platform.html");
        System.out.println(mydata.getValue());
    }
}
