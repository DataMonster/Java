package edu.java.chap9;

import java.util.Iterator;
import java.util.Random;
import java.util.HashSet;

/*
 * A child is running up with n steps, and can hop either 1 step, 2 steps, or 3 steps
 * at a time, implement a method to count how many possible ways the child can run up 
 * the stairs.
 */

@SuppressWarnings("unused")
public class StairCase {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static HashSet count(int n){
		//StringBuffer sb = new StringBuffer();
		//getRoute(0,10,1,sb);
		//System.out.println(sb.toString());
		
		HashSet hs = new HashSet();
		int count = 0;
		while(count<n){
			StringBuffer sb = new StringBuffer();
			getRoute(0,5,1,sb);
			hs.add(sb.toString());
			count++;
		}
		return hs;
	}
	
	public static void getRoute(int start, int end, int pace, StringBuffer sb){
		if(start+pace>=end){
			int temp = end-start;
			sb.append(temp);
			return;
		}
		else{
			sb.append(pace);
			Random rd = new Random();
			int newpace = Math.abs(rd.nextInt())%3+1;
			getRoute(start+pace,end,newpace,sb);
		}
	}
	
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Random rd = new Random();
		
		HashSet hs = count(1000000);
		System.out.println(hs.size());
		//Iterator it = hs.iterator();
		//while(it.hasNext()){
		//	System.out.println(it.next());
		//}
		//System.out.println(Math.abs(rd.nextInt())%3+1);
	}

}
