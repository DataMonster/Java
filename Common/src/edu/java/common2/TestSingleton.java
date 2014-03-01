package edu.java.common2;

public class TestSingleton{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create singleton object can only through getinstance method
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//compile error: Singleton s3 = new Singleton();
		System.out.println(s1 == s2);
	}

}
