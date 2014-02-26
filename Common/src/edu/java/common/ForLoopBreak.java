package edu.java.common;

public class ForLoopBreak {
	public static void main(String[] args){
		outer:
		for(int i =0; i<10;i++){
			for(int j =0; j<10; j++){
				System.out.println("this is j = "+j);
				if(j==2) break outer;
			}
		}
		System.out.println("end");
		
		//continue works like 'pass'
		for (int i=0;i<4;i++){
			{
				System.out.println(i);
				if(i==2){
					continue;//end this loop, begin the next loop
				}
				System.out.println(i);
			}
		}

		for (int i = 0; i < 3; i++) {
			outer2: for (int j = 0; j < 10; j++) {
				if (j == 2)
					continue outer2;
				System.out.println("this is j = " + j);

			}
		System.out.println("end");
		}
		
		
		//use return, direct end the whole method, no matter how many loops it is in.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 2)
					return;
				System.out.println("this is j = " + j);

			}
			System.out.println("end");
		}
	}

}
