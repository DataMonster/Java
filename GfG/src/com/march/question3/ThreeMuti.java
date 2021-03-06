package com.march.question3;

/*
 * Write an Efficient Method to Check if a Number is Multiple of 3
The very first solution that comes to our mind is the one that we learned in school.
 If sum of digits in a number is multiple of 3 then number is multiple of 3 e.g., 
 for 612 sum of digits is 9 so it��s a multiple of 3. But this solution is not efficient. 
 You have to get all decimal digits one by one, add them and then check if sum is 
 multiple of 3.

There is a pattern in binary representation of the number that can be used to find if 
number is a multiple of 3. If difference between count of odd set bits (Bits set at odd 
positions) and even set bits is multiple of 3 then is the number.

Example: 23 (00..10111)
1) Get count of all set bits at odd positions (For 23 it��s 3).
2) Get count of all set bits at even positions (For 23 it��s 1).
3) If difference of above two counts is a multiple of 3 then number is also a multiple of 3.

(For 23 it��s 2 so 23 is not a multiple of 3)

Take some more examples like 21, 15, etc��
 */
public class ThreeMuti {
	
	public int Check(int x){
		String str = Integer.toBinaryString(x);
		int even = 0;
		int odd = 0;
		for(int i=0; i<str.length();i++){
			
			odd = odd + Integer.parseInt(str.substring(i, i+1));
			if(i<str.length()-1){
			i++;
			even = even + Integer.parseInt(str.substring(i, i+1));
			}
		}
		//System.out.println(even+" "+odd);
		int result = Math.abs(even-odd);
		return result;
	}
	
	public void CheckAll(int x){
		if(x==3||x==0){
			System.out.println("Input can be divided by 3");
		}
		else if (x > 3){
			CheckAll(this.Check(x));
		}
		else {
			System.out.println("Input can not be divided by 3");
		}
	}

	public static void main(String[] args) {
		int x1 = 6;
		int x2 = 23;
		int x3 = 15;
		
		System.out.println(Integer.toBinaryString(x1));
		ThreeMuti tm = new ThreeMuti();
		//System.out.println(tm.Check(x1));
		for(int i =0;i<100;i++){
			System.out.println(i);
			tm.CheckAll(i);
		}
		
	}

}
