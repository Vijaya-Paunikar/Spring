package com.springdemo.IOCExample1;

public class Car implements Engine
{

	@Override
	public void start() 
	{
		// TODO Auto-generated method stub
		System.out.println("Car started.");
	}

	@Override
	public void accelerate() 
	{
		// TODO Auto-generated method stub
		System.out.println("Car started running.");
	}

	@Override
	public void brake() 
	{
		// TODO Auto-generated method stub
		System.out.println("Break is applied.");
	}

	@Override
	public void stop() 
	{
		// TODO Auto-generated method stub
		System.out.println("Car stopped.");
	}
}
