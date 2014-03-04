package edu.java.common4;

//there is always some way to 'force' the system to do garbage collection
//'force' means to inform the system to collect this object
//1. use static method: System.gc()
//2. use Runtime gc instance method: Runtime.getRuntime().gc()
//3. finalize method is not necessarily called by GC, use Runtime.getRuntime().runFinalization();

//run this program by 'java -verbose:gc ForceGC'

public class ForceGC {
	private double height;
	public static void main(String... args){
		for(int i =0; i<4; i++){
			new ForceGC();
			//the following two lines are the same
			//System.gc()
			Runtime.getRuntime().gc();
		}
	}
	public void finalize(){
		System.out.println("cleaning ...");
	}
}
