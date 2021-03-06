package com.example.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StocksApplication {

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(StocksApplication.class, args);
    }

}
