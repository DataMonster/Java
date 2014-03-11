package com.march.question2;

import java.util.Iterator;
import java.util.Stack;

//Write a program to reverse digits of a number

public class ReverseDigit {

	
	public static void main(String[] args) {
		int input = 100;
		String s = String.valueOf(input);
		Stack sk = new Stack();
		for(int i =0;i<s.length();i++){
			sk.push(s.charAt(i));
		}
		Iterator it = sk.iterator();
		while(!sk.empty()){
			System.out.print(sk.pop());
		}
	}

}
