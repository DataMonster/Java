package edu.java.chap11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

/*
 * Write a method to sort an array of strings so that all the anagrams are next
 * to each other.
 */

public class SortStrings {
	
	public static String[] sort(String[] arr){
		TreeMap<Integer,LinkedList<String>> tm = new TreeMap<Integer,LinkedList<String>>();
		for(int i = 0;i<arr.length;i++){
			int len = arr[i].length();
			//System.out.println("!"+arr[i]);
			if(tm.containsKey(len)){
				LinkedList<String> temp = tm.get(len);
				int size = temp.size();
				for(int j=0;j<temp.size();j++ ){
					if(checkAnagrams(temp.get(j),arr[i])){
						temp.add(j,arr[i]);
						break;
					}
				}
				if(size==temp.size()){
					temp.add(arr[i]);
				}
				tm.put(len,temp);
			} else {
				LinkedList<String> temp = new LinkedList<String> ();
				temp.add(arr[i]);
				tm.put(len,temp);
			}	
		}
		String[] result = new String[arr.length];
		Iterator<Integer> it = tm.keySet().iterator();
		//System.out.println("!"+tm.size()+" "+tm.keySet().size());
		int i =0;
		while(it.hasNext()){
			LinkedList<String> tt = tm.get(it.next());
			Iterator<String> it2 = tt.iterator();
			System.out.println("!"+tt.size());
			while(it2.hasNext()){
				result[i] = it2.next();
				System.out.println("?"+result[i]);
				i++;
			}
		}
		return result;
		
	}
	
	public static boolean checkAnagrams(String a, String b){
		//boolean temp = false;
		boolean result = true;
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character,Integer>();
		for(int i = 0;i<a.length();i++){
			char t = a.charAt(i);
			if(hm.containsKey(t)){
				hm.put(t, hm.get(t)+1);
			} else {
				hm.put(t,1);
			}
		}
		
		for(int j = 0;j<b.length();j++){
			char t = b.charAt(j);
			if(hm2.containsKey(t)){
				hm2.put(t, hm2.get(t)+1);
			} else {
				hm2.put(t,1);
			}
		}
		
		if(hm.keySet().size()!=hm2.keySet().size()){
			return false;
		}
		
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()){
			char t = (char) it.next();
			if(hm2.containsKey(t)&&hm2.get(t)==hm.get(t)){
				result = result & true;
			} else {
				return false;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		String[] arr  = {"abe","a","ab","acb","cab","cba","bac","est","-ab","abc","abd","acd","abcd","abcde"};
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("========");
		
		arr = sort(arr);
		
		//Arrays.sort(arr);
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		/*
		LinkedList<String> temp = new LinkedList<String>();
		temp.add("1");
		temp.add("2");
		temp.add("3");
		temp.add(1, "0");
		System.out.println(temp.get(1));
		
		checkAnagrams("aab","asd");
		*/
	}

}
