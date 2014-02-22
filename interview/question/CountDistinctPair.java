/*
Count all distinct pairs with difference equal to k
Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

Examples:

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
{8, 12}, {12, 16} and {16, 20} 
*/
//http://www.geeksforgeeks.org/count-pairs-difference-equal-k/

public class MatrixCount {
	
	public void check (int i, int j, int m, int n, int nexti, int nextj){
		if(i==m-1){
			for(int index=0; index<n-nextj;index++){
				System.out.print(i);
				System.out.print(j+index);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
		if(j==n-1){
			for(int index=0; index<m-nexti;index++){
				System.out.print(i+index);
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
		
		this.check(i+1, j, m, n, nexti+1, nextj);
		this.check(i, j+1, m, n, nexti, nextj+1);
		
		/*if(i>=n-1 && j<m-1){
			System.out.print(i);
			System.out.print(j+" ");
			this.check(i, j+1, m, n);
			
			//System.out.println(0);
		}
		if(j>=m-1 && i<n-1){
			System.out.print(i);
			System.out.print(j+" ");
			this.check(i+1,j,m,n);
			
		}
		if(i<n-1 && j <m-1){
			System.out.print(i);
			System.out.print(j+" ");
			this.check(i+1,j,m,n);
			System.out.print(i);
			System.out.print(j+" ");
			this.check(i,j+1,m,n);
		}
		else {
			System.out.println(11);
		}*/
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 10;
		int n =5;
		/*double [][] matrix = new double [10][5];
		int i;
		int j;
		for(i=0;i<10;i++){
			for (j=0;j<5;j++){
				matrix[i][j] = 1;
				//System.out.println(matrix[i][j]);
			}
		}*/
		MatrixCount mc = new MatrixCount();
		mc.check(0, 0, 3, 2,1,1);

	}

}
