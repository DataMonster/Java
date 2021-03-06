package edu.java.chap5;

/*
 * input: n = 10000000000, m = 10011, i = 2, j = 6
 * output:n = 10001001100
 * !! value left move: value<<steps
 * !! value right move: value>>steps
 */

public class NInsertM {

	public static int insert(int input, int m, int i, int j){
		if (input > 2147483647 || m > 2147483647) {
			System.out.println("input or insert number larger than 32 bits");
			return 0;
		}
		if (m > input ){
			System.out.println("input is smaller than insert number");
			return 0;
		}
		String m2 = Integer.toBinaryString(m);
		if (i>j||m2.length()!=(j-i+1)){
			System.out.println("i or j is not right, j-i shouble be equal to m's binary length");
			return 0;
		}
		
		int save = (int)Math.pow(2, i)-1;
		int last = input&save;
		System.out.println(Integer.toBinaryString(last));
		input = input>>(i+j-1);
		System.out.println(Integer.toBinaryString(input));
		input = input<<(j-i+1);
		System.out.println(Integer.toBinaryString(input));
		input = input|m;
		System.out.println(Integer.toBinaryString(input));
		input = input<<i;
		System.out.println(Integer.toBinaryString(input));
		input = input|last; 
		System.out.println(Integer.toBinaryString(input));
		return input;
	}
	
	public static void main(String[] args) {
		/*int x = 65536*4096*8-1;
		String st = Integer.toBinaryString(x);
		System.out.println(st);
		System.out.println(st.length());
		int x2 = Integer.valueOf(st, 2);
		System.out.println(x2);
		*/
		int input = Integer.valueOf("10000000000", 2);
		int m = Integer.valueOf("10011", 2);
		
		System.out.println(Integer.toBinaryString(insert(input,m,3,7)));
		
	}

}
