package com.march.question3;

import java.util.HashMap;

/*
 * Majority Element: A majority element in an array A[] of size n is an element
 that appears more than n/2 times (and hence there is at most one such element).

Write a function which takes an array and emits the majority element (if it exists), 
otherwise prints NONE as follows:
       I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4 

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE
 */

public class MajorityElement {
	
	public static Object Choose(Object[] arr){
		HashMap<Object,Integer> hm = new HashMap<Object,Integer>();
		for(Object i:arr){
			if(hm.containsKey(i)){
				hm.put(i, hm.get(i)+1);
			}
			else{
				hm.put(i, 1);
			}
		}
		int result = 0;
		Object max = null;
		for(Object i:hm.keySet()){
			if(hm.get(i)>result){
				max = i;
				result = hm.get(i);
			}
		}
		if(result>arr.length/2){
			return max;
		}
		else{
			return "None";
		}
		
	}

	public static void main(String[] args) {
		Object[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		System.out.println(Choose(arr));
		Object[] arr2 = {3, 3, 4, 2, 4, 4, 2, 4};
		System.out.println(Choose(arr2));
	}

}
