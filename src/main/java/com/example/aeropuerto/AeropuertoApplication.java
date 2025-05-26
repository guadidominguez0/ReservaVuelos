package com.example.aeropuerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AeropuertoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AeropuertoApplication.class, args);
    }

}
