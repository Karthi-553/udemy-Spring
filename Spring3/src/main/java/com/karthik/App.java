package com.karthik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = context.getBean("alien",Alien.class);

//        creating desktop bean without id
        Desktop des = context.getBean(Desktop.class);
    }
}
