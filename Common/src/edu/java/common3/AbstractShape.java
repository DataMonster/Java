package edu.java.common3;

public class AbstractShape extends Shape{

	@Override 
	//all instance methods can not be static.
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}

abstract class Shape{
	{
		System.out.println("executive shape");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	public abstract void test();
	public Shape(){}
	public Shape(String color){
		System.out.println("executive shape constructor");
		this.color = color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}

class Circle extends AbstractShape{
	//no need to override the methods from super class
	
}