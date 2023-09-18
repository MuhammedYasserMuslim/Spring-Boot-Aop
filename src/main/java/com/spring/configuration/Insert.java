package com.spring.configuration;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class Insert {



    @Before("execution( public * com.spring.services.DevolperServices.findAll())")
    public void getTime(){
        Date date = new Date();
        System.out.println("Connected ..........!");
        System.out.println(System.currentTimeMillis());
    }
}
