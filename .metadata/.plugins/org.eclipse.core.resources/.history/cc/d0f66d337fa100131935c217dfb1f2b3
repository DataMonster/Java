package edu.java.common2;
//A singleton class can only be instanced once, and the constructor should be private
public class Singleton {
	
	//use a variable to store the only instance
	private static Singleton instance;
	
	private Singleton() {
		//provide a static method to return the only instance of Singleton class
		//This method has user-defined control, insure to only get one singleton object
		//TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		//if instance is null, create one
		//if instance has already created, pass
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}	

class TestSingleton{
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
