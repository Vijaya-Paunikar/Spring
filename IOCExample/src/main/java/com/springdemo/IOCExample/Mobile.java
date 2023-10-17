package com.springdemo.IOCExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String args[])
	{
	  // Vodafone obj=new Vodafone();
	  // obj.calling();
	  // obj.data();
	  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	  Sim sim=(Sim) context.getBean("vodafone");
	  sim.calling();
	  sim.data();
	}
}
