package com.springdemo.IOCExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Engine eng=(Engine) context.getBean("bike");
        eng.start();
        eng.accelerate();
        eng.brake();
        eng.stop();		
    }
}
