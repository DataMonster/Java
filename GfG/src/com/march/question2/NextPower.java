package com.march.question2;

/*
 * Write a function that, for a given no n, finds a number p which is 
 * greater than or equal to n and is a power of 2.

    IP 5
    OP 8     

    IP 17
    OP 32     

    IP 32
    OP 32     
There are plenty of solutions for this. Let us take the example of 17 to 
explain some of them.
 */

public class NextPower {

	
	public static void main(String[] args) {
		int x = 32;
		int len = Integer.toBinaryString(x).length();
		int result = (int)Math.pow(2, len);
		int compare = (int)Math.pow(2, len-1);
		if(x == compare){
		System.out.println(compare);}
		else{System.out.println(result);
		}
	}

}
