package com.login03.login03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.login03.login03.mapper")
public class Login03Application {

    public static void main(String[] args) {
        SpringApplication.run(Login03Application.class, args);
    }

}
