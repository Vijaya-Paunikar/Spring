package com.springdemo.DITypeDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("beans.xml");
      
        Performer sp1=(Performer)springContainer.getBean("vij");
        sp1.perform();
    }
}
