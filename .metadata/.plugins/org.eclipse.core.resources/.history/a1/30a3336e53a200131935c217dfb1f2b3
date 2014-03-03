package edu.java.common3;

//this is an example of how to use non static inner class
//in the class path: two files are generated after compiling: Cow.class an Cow$CowLeg.class
public class Cow {
	private double weight;
	private static int weight2;

	public Cow() {

	}

	public Cow(double weight) {
		this.weight = weight;
	}

	// non-static inner class, cannot use static inside of non-static class
	private class CowLeg {
		private double length;
		private String color;

		public CowLeg() {

		}

		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public double getLength() {
			return this.length;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getColor() {
			return this.color;
		}

		public void info() {
			System.out.println("color is " + this.color);
			System.out.println("the weight of the cow is " + Cow.this.weight);
			//use OutClass.this.variable to call the out class variable.
		}
	}

	static class StaticInnerClass{
		private static int age;
		private int name;
		public void accessOuterProp(){
			System.out.println(weight2);
		}
	}
	
	public void test() {
		CowLeg cl = new CowLeg(1.1, "white");
		cl.info();
	}

	public static void main(String[] args) {
		Cow cow = new Cow(132.2);
		cow.test();
		System.out.println(Cow.StaticInnerClass.age);
		StaticInnerClass sc = new StaticInnerClass();
		System.out.println(sc.name);
		
	}
}
