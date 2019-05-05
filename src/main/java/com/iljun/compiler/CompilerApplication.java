package com.iljun.compiler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CompilerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompilerApplication.class, args);
    }

}
