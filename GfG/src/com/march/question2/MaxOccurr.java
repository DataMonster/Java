package com.march.question2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/*
 * Write an efficient C function to return maximum occurring character in the input string
 e.g., if input string is ��test string�� then function should return ��t��.

 */

public class MaxOccurr {

	public static void main(String[] args) {
		String ex = "ttthis is sttring hahahaha";
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
		LinkedList<Character> list = new LinkedList<Character>();
		while(it.hasNext()){
			char next = it.next();
			if(hm.get(next)>max){
				list.clear();
				list.add(next);
				max = hm.get(next);
			}
			else if(hm.get(next)==max){
				list.add(next);
			}
		}
		Iterator it2 = list.listIterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println(hm.toString());
	}

}
