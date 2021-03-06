package edu.java.moderate;

/*
 * write a function to swap a number in place, that is, without temporary variables.
 */
public class SwapNumber {
	static int x;
	static int y;
	
	public static void swap(){
		x = x+y;
		y = x-y;
		x = x-y;
	}
	
	//if x and y both not equal to 0
	public static void swap2(){
		x = x*y;
		y = x/y;
		x = x/y;
	}
	
	//bitwise
	public static void swap3(){
		x = x^y;
		y = x^y;
		x = x^y;
	}
	
	public static void main(String[] args) {
		x = 25;
		y = 5;
		System.out.println("x: "+x+" y: "+y);
		swap();
		System.out.println("x: "+x+" y: "+y);
		swap2();
		System.out.println("x: "+x+" y: "+y);
		swap3();
		System.out.println("x: "+x+" y: "+y);
	}

}
