package com.example.helloworld;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

        public static void main(String[] args) {
                SpringApplication.run(HelloApplication.class, args);
        }

}

@RestController
class Hello {

    @RequestMapping("/")
    String index() {
        return "Hello world";
    }
}
