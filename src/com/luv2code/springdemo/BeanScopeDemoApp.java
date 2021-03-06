package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are the same
        boolean result = (coach == alphaCoach);

        System.out.println("\n Pointing to the same object: " + result);

        System.out.println("\n Memory location for coach: " + coach);
        System.out.println("\n Memory location for alphaCoach: " + alphaCoach + "\n");

    }

}
