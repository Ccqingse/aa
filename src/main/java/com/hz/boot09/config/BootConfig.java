package com.hz.boot09.config;

import com.hz.boot09.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootConfig {

    /*@Value("${uname}")*/
    public String uname;


    @Bean
    public User newUser(){
        User user = new User();

        System.out.println("uname==="+uname);
        user.setUserName(uname);
        return user;
    }

}
