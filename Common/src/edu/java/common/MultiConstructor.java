package edu.java.common;

import static java.lang.System.out;

public class MultiConstructor extends cons{
	public String name;
	public String color;
	public int number;
	
	public MultiConstructor(){
		
	}
	
	public MultiConstructor(String name, String color){
		this.name = name;
		this.color = color;
		
	}
	
	public MultiConstructor(String name, String color, int number){
		this(name,color);//easy way, use the constructor already designed
		this.number = number;
	}
	
	public void info(){
		super.info();
		out.println("this is mc");
	}
	
	public static void main(String... args){
		MultiConstructor mc = new MultiConstructor();
		mc.info();
		
	}
	
}

//extends will not get the superclass's constructors.
class cons extends Con1{
	public double weight;
	public cons(){
		
	}
	public cons(double weight){
		this.weight = weight;
		out.println("weight is " + this.weight);
	}
	
	public void info(){
		super.info();
		out.println("this is info "+this.weight);
	}
}

class Con1{
	public Con1(){
		
	}
	
	public void info(){
		out.println("this is con1!");
	}
}
