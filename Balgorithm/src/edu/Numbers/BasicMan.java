package edu.Numbers;

import java.math.BigInteger;

public class BasicMan {

	/**
	 * this class review the basic number manipulation for real numbers.
	 * 
	 */
	
	public static void addition(){
		//try big integer
		int max = -1;
		String maxstr = Integer.toString(max)+"00000";
		BigInteger bi = new BigInteger(maxstr);
		System.out.println(bi.multiply(new BigInteger(maxstr)));
		System.out.println(bi);
		
	}
	
	//input should be i,j,j
	public static int multi(int i,int j,int result){
		if(i==1){
			return result;
		}
		if(i==0||j==0){
			return 0;
		}
		if(i%2==1){
			return multi(i/2,j*2,result+2*j);
		} else {
			return multi(i/2,j*2,result+j);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		System.out.println(multi(11,13,13));
	}

}
