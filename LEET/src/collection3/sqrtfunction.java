package collection3;

public class sqrtfunction {

	public static int sqrt7 (int x){
		x+=127<<23;
		x>>=1;
		return x;
	}
	
	//http://www.codeproject.com/Articles/69941/Best-Square-Root-Method-Algorithm-Function-Precisi
	//babylonian method
	public static double sqrt8 (double x){
		double n = x/2.0;
		double lstX = 0.0;
		while(n!=lstX){
			lstX = n;
			n=(n+x/n)/2.0;
			
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt8(16.0));
	}

}
