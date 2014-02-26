package edu.java.common;

public class BitMani {

	/**
	 * @param args
	 * This class is a demonstration of bit manipulation.
	 */
	
	//return i with different radix
	public int returnWithRadix(int i, int radix){
		return Integer.valueOf(Integer.toString(i,radix)).intValue();
	}
	
	public void bitBasic(int i, int j, int radix){
		System.out.println(i&j);
		System.out.println(this.returnWithRadix(i&j,radix));
		System.out.println(i|j);
		System.out.println(this.returnWithRadix(i|j,radix));
		System.out.println(~i);
		System.out.println(this.returnWithRadix(~i,radix));
		System.out.println(i^j);
		System.out.println(this.returnWithRadix(i^j,radix));
		System.out.println(i<<1);
		System.out.println(this.returnWithRadix(i<<1,radix));
		System.out.println(i>>1);
		System.out.println(this.returnWithRadix(i>>1,radix));
		System.out.println(i>>>1);
		System.out.println(this.returnWithRadix(i>>>1,radix));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 13;
		int j = 21;
		BitMani bm = new BitMani();
		System.out.println(bm.returnWithRadix(i,2));// 13->1101 in radix 2
		System.out.println(bm.returnWithRadix(j,2));// 21->10101
		
		bm.bitBasic(i, j, 2);
		
		
	}

}
