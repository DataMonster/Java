package edu.java.common2;

public class WrapperClass {

	public WrapperClass() {
		// TODO Auto-generated constructor stub
	}

	public void create(){
		boolean bl = true;
		Boolean blObj = new Boolean(bl);
		int i = 6;
		Integer iObj = new Integer(i);
		boolean b = blObj.booleanValue();
		int i2 = iObj.intValue();
	}
	
	public void autoboxing(){
		Integer i = 5;
		Object bool = "true";
		//equals Object bool = true;
		int i2 = i;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
