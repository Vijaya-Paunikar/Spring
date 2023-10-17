package com.springdemo.IOCExample;

public class Vodafone implements Sim
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("call is made through vodafone sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("You are using Vodafone data");
	}

}
