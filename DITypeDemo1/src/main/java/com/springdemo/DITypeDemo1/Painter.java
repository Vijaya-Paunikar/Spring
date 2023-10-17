package com.springdemo.DITypeDemo1;

public class Painter implements Performer 
{
	public Shape shape;
	
	public Painter(Shape shape)
	{
		super();
		this.shape = shape;
	}


	@Override
	public void perform() 
	{
		// TODO Auto-generated method stub
		System.out.println("Painter is");
		shape.draw();
	}

}
