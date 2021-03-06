package edu.java.chap1;

//rotate a matrix with n*n ints.
public class MarixRotate {
	
	public static void matrixPrint(int[][] matrix){
		System.out.println();
		for(int i =0; i < matrix.length;i++){
			for(int j = 0; j <matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] rightrotate(int[][] matrix){
		return up(T(matrix));
	}
	
	public static int[][] leftrotate(int[][] matrix){
		return left(T(matrix));
	}
	
	public static int[][] T(int[][] matrix){
		int[][] result = new int[matrix.length][matrix.length];
		
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j <matrix.length; j++){
				if(i==j){
					result[i][j] = matrix[i][j];
				}
				else{
				result[i][j] = matrix[j][i];
				}
			}
		}
		
		return result;
	}
	
	public static int[][] left(int[][] matrix){
		int[][] result = new int[matrix.length][matrix.length];
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j <matrix.length; j++){
				result[i][j] = matrix[i][matrix.length-1-j];
			}
		}
		return result;
	}
	public static int[][] up(int[][] matrix){
		int[][] result = new int[matrix.length][matrix.length];
		for(int i = 0; i<matrix.length; i++){
				result[i] = matrix[matrix.length-1-i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		matrixPrint(rightrotate(matrix));
		matrixPrint(leftrotate(matrix));


	}

}
