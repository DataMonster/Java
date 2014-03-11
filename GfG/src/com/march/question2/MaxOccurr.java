package com.march.question2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Write an efficient C function to return maximum occurring character in the input string
 e.g., if input string is ¡°test string¡± then function should return ¡®t¡¯.

 */

public class MaxOccurr {

	public static void main(String[] args) {
		String ex = "this is string hahahaha";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i =0;i<ex.length();i++){
			if(hm.get(ex.charAt(i))!=null){
				hm.put(ex.charAt(i),hm.get(ex.charAt(i))+1);
			}
			else{
				hm.put(ex.charAt(i),1);
			}
		}
		Iterator<Character> it = hm.keySet().iterator();
		int max = 0;
		char[] result = new char[26];
		while(it.hasNext()){
			if(hm.get(it.next())
		}
		
		
		
	}

}
