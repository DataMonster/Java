package com.march.question1;

//Q1. you have a array A{a,b,c,d,e,f...z, aa,ab...az, ba,bb...bz,...,aaa..a,aaa...b,
//...,aaa...z}, give a input number num, output A[num-1].

public class PrintRecursive {
	public static void modPrint(int number, int mode, String[] base){
		int temp = number/mode;
		int restidual = number-temp*mode;
		if (temp>=1){
			if(restidual == 0&&temp >1){
				modPrint(temp-1, mode, base);
			}
			else if(restidual >0){
				modPrint(temp, mode,base);
			}
		}
		int mod = (number-temp*mode)%mode;
		//String[] base = {"d","a","b","c"};
		System.out.print(base[mod]);
	}

	public static void main(String[] args) {
		String[] base = {"z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y"};
		//modPrint(8,4);
		//System.out.println(3%7);
		//System.out.println(7%11);
		for(int i = 1; i<135; i++){
			modPrint(i,26,base);
			System.out.println();
		}
		
		//input: 10003, ouput: bdwsy
		modPrint(1000323,26,base);
		
		int x = -1;  
	       System.out.println(x>>>29);  
	       System.out.println(x>>>30);  
	       System.out.println(x>>>31);
		
	}
}
