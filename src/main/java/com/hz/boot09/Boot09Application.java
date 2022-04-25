package com.hz.boot09;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hz.boot09.dao")
public class Boot09Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot09Application.class, args);
        System.out.println("启动成功");
    }

}
