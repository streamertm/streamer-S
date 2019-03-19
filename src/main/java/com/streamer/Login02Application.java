package com.streamer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.streamer.mapper")
@SpringBootApplication
public class Login02Application {

    public static void main(String[] args) {
        SpringApplication.run(Login02Application.class, args);
    }

}
