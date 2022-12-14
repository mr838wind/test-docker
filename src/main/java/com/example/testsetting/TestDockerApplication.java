package com.example.testsetting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@Slf4j
//public class TestDockerApplication {
public class TestDockerApplication extends SpringBootServletInitializer { //[war packaging]

    public static void main(String[] args) {
        SpringApplication.run(TestDockerApplication.class, args);
    }

}
