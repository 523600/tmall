package com.jsx.tmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallApplication.class, args);
    }

}
