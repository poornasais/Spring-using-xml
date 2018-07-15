package com.spring;

import com.spring.Aliens;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext appcontext= new ClassPathXmlApplicationContext("Bean.xml");

//        Aliens obj = (Aliens) appcontext.getBean("aliens");
            Aliens obj = appcontext.getBean(Aliens.class);

        obj.code();
        System.out.println();

    }
}
