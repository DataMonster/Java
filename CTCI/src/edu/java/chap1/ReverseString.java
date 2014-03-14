package edu.java.chap1;

import java.util.Arrays;
import java.util.Stack;

//Implement a function void reverse (str) which a null-terminated string
public class ReverseString {

	public static void reverse1(String str){
		char temp = ' ';
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<str.length()/2 ; i++){
			temp = str.charAt(i);
			//str.charAt(i) = str.charAt(str.length()-i);
			
		}
	}
	
	public static void main(String[] args) {
		char[] ch = {'a','b'};
		System.out.println(Arrays.toString(ch));
		Stack<Character> st = new Stack();
		st.push('a');
		st.push('b');
		System.out.println(st.toString());
		
	}

}
