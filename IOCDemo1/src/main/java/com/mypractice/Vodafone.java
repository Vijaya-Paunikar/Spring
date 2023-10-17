package com.mypractice;

public class Vodafone implements Sim
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("call is made through airtel sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("You are using Airtel data");
	}

}
