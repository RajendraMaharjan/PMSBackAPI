package com.miu.pmtbackendapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class PMBackendApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PMBackendApiApplication.class, args);
    }

}
