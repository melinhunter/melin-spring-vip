package com.melin;

import com.melin.service.UserService;
import com.spring.MelinApplicationContext;

public class Test {
    public static void main(String[] args) {

        //create singleton bean
        MelinApplicationContext applicationContext = new MelinApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }
}
