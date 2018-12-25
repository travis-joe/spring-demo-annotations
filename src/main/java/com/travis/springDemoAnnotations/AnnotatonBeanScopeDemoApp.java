package com.travis.springDemoAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatonBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == alphaCoach);

        System.out.println(result);

        context.close();
    }
}
