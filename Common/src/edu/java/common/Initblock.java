package edu.java.common;

public class Initblock {
	int c;
	{
		int a = 6;
		int b = 9;
		System.out.println(a);
	}
	
	static{
		int c = 10;
		System.out.println(c);
	}
	
	public void test(){
		//System.out.println(this.a);
	}
	
	/**
	 * this is the example of the initial block and static bloc of a class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Initblock ib = new Initblock();
		//when new a instance of Initblock, the static block will be calculated first and then the nonstatic block will be calculated.
		//constructor will follow the block
		
		System.out.println(ib.c);
		//the initial block will not change the parameter c of the class.
		
		//more sophisticated +case will be follows:
		new Leaf();
		new Leaf();
	}

}

class Root{
	static{
		System.out.println("Roots's static block");	
	}
	{
		System.out.println("Root's normal block");
	}
	public Root(){
		System.out.println("Root's constuctor");
	}
}

class Mid extends Root{
	static{
		System.out.println("Mid's static block");
	}
	{
		System.out.println("Mid's normal block");
	}
	public Mid(){
		System.out.println("Mid's constructor");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid's second constructor");
	}
}

class Leaf extends Mid{
	static{
		System.out.println("Leaf's static block");
	}
	{
		System.out.println("Leaf's normal block");
	}
	public Leaf(){
		super("second");
		System.out.println("Leaf's constructor");
	}
}