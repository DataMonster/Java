package edu.java.chap1;

//rotate a matrix with n*n ints.
public class MarixRotate {
	
	public static void matrixPrint(int[][] matrix){
		for(int i =0; i < matrix.length;i++){
			for(int j = 0; j <matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] right(int[][] matrix){
		int[][] result = new int[matrix.length][matrix.length];
		
		return result;
	}
	
	public static int[][] left(int[][] matrix){
		int[][] result = new int[matrix.length][matrix.length];
		
		return result;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixPrint(matrix);
		matrixPrint(right(matrix));
		
		

	}

}