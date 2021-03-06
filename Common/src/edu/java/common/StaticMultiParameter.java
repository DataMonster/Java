package edu.java.common;

public class StaticMultiParameter {
	//This example can use as how to get multiple return values!!
	//a,b as input can also be output
	//swap can work because java is a value-pass mechanism
	//no matter whether it is static, this can also work
	int index1;
	int index2;
	
	public static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap method, a is "+a+", b is "+b);
	}
	
	public void swap2(StaticMultiParameter smp){
		//this instance can be another class, carry the important parameters
		
		int tmp2 = smp.index1;
		smp.index1 = smp.index2;
		smp.index2 = tmp2;
		smp=null;
		//set it to "carryclass = null" after using it.
		//since value-copy of java, the main mathod's smp is copied to swap2 method, and both of them point to index1 and index2 in heap memory.
		//so, swp in main stack memory and swp in swap2 stack memory both point to index1 and index2 in heap memory.
		//even if we set swp in swap2 stack memory to null, the swp in main memory still exist and still points to index1 and index2
		//but index1 and index2's value have swaped.
		System.out.println("swap2 method, index1 is "+ index1 +", index2 is " + index2);
	}
	
	//multi input parameter, unknow number
	//public static void test(int a, String... others)
	//public static void test(int a, String[] books) can do the same thing, but further one is more elegant.
	public void swap3(int i, String... s){
		String s1 = s[0];
		String s2 = s[1];
		String stmp = s1;
		s1 = s2;
		s2 = stmp;
		System.out.println("swap method, i is " + i + ", s1 is " + s1 + ", s2 is " + s2);
	}
	
	public static void main(String... args){
		int a = 6;
		int b = 9;
		swap(a, b);
		
		StaticMultiParameter smp = new StaticMultiParameter();
		smp.index1 = 3;
		smp.index2 = 5;
		smp.swap2(smp);
		smp.swap3(1, "aaa", "bbb","ccc");
		
		System.out.println("after swap,a is "+a+", b is "+b);
	}
	
}
