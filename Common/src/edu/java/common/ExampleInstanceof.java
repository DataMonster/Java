package edu.java.common;

public class ExampleInstanceof {
	
	/**
	 * @param args
	 * the subclass of a superclass can change the class of the instance
	 * example:
	 * Object obj = new Integer(5);
	 * String str = (String)obj;
	 * while this would not cause a compile error but when the program actually running there will be a runtime error.
	 * To make the program robust, use a instance of to check before actually change the class of the instance.
	 * if (object instanceof String){
			String str = (String)obj
		}
	 * the instanceof can avoid ClassCastException
	 *
	 */
	
	public void testEncups(){
		
	}
	
	public static void main(String[] args) {
		Object obj = new String();
		
		if (obj instanceof String){
			String str = (String)obj;
		}
		// TODO Auto-generated method stub
		
	}

}
