package collection3;

import java.math.BigInteger;

public class POW {

	public static double pow(double x, int n) {
		return Math.pow(x,n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(1,100));
		System.out.println(Math.pow(1.00001,12345));
	}

}
