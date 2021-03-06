package edu.java.chap1;

import java.util.Arrays;

/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure?
 */

/*
 * Need to mention the difference of ASCII and UNICODE. 
 * Method one and two can be suitable for UNICODE.
 * The four methods all fit the characters are ASCII encoding.
 * reference: http://www.ruanyifeng.com/blog/2007/10/ascii_unicode_and_utf-8.html
 */
public class UniqueChar {
	
	//Time complex: O(N^2); Space complex: O(1)
	public static boolean unique1(String str){
		//if(str.length()>256) return false;
		
		for(int i = 0; i<str.length()-1;i++){
			for(int j = i+1; j<str.length();j++){
				//System.out.println(str.charAt(i));
				if (str.charAt(i)==str.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
	
	//Time complex: O(N); Space complex: O(N)
	public static boolean unique2(String str){
		//if(str.length()>256) return false;
		char[] ch = new char[str.length()];
		for(int i = 0; i<str.length();i++){
			ch[i] = str.charAt(i);
		}
		Arrays.sort(ch);
		for(int i = 0; i<str.length()-1;i++){
			if(ch[i]==ch[i+1]){
				return false;
			}
		}
		return true;
	}
	
	//Time complex: O(N)  Space complex: O(1)
	public static boolean unique3(String str){
		if(str.length()>256) return false;
		
		boolean[] dec = new boolean[256];
				//System.out.println(dec[0]);
		int pos;
		int add = 0;
		for (int i = 0; i<str.length(); i++){
			pos = str.charAt(i);
			if(dec[pos]==false){
				dec[pos] = true;
				add++;
			}
		}
		if(add<str.length()){
			return false;
		}
		return true;
	}
	
	//Time complex:O(N)   Space complex:O(1) 
	public static boolean unique4(String str){
		if(str.length()>256) return false;
		
		int check = 0;
		for(int i =0; i<str.length();i++){
			int val = str.charAt(i) - 'a';
			if((check& (1<<val))>0){
				return false;
			}
			check = check | (1<<val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "sdfghza";
		System.out.println(unique1(str));
		System.out.println(unique2(str));
		System.out.println(unique3(str));
		System.out.println(unique4(str));
	}

}
