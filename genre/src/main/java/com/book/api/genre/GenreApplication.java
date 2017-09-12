package com.book.api.genre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient    // TODO: uncomment when deploying
public class GenreApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreApplication.class, args);
    }
}
