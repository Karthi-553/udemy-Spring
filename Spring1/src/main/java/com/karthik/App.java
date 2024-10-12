package com.karthik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//object is created at this step
         Alien obj1 = (Alien)context.getBean("alien");
         System.out.println(obj1.getAge());
         obj1.code();
//        Alien obj2 = (Alien)context.getBean("alien");
//        System.out.println(obj1.age);
//        obj2.code();
//        System.out.println( "Hello World!" );
    }
}
