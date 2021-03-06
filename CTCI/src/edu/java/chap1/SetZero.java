package edu.java.chap1;

import java.util.LinkedList;

/*
 * Write an algorithm such that if an element in an M*N matrix is 0, its entire row and column are set to 0.
 * 
 */

public class SetZero {
	
	public static void matrixPrint(int[][] matrix){
		System.out.println();
		for(int i =0; i < matrix.length;i++){
			for(int j = 0; j <matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] set0(int[][] arr){
		int rowL = arr[0].length;
		int columnL = arr.length;
		int[][] result = new int[columnL][rowL];
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		outer:
		for(int i = 0; i<columnL; i++){
			for(int j = 0;j<rowL; j++ ){
				//System.out.println(i+" "+j);
				if(check(j,list)){
					result[i][j] = 0;
					
				}
				else if (arr[i][j] == 0){
					for(int k = 0; k<j+1;k++){
						result[i][k] = 0;
					}
					for(int k = 0;k<i+1;k++){
						result[k][j] = 0;
					}
					list.add(j);
					continue outer;
				}
				else{
					result[i][j] = arr[i][j];
				}
			}
		}
		
		return result;
	}
	
	public static boolean check(int i, LinkedList<Integer> list){
		for(int j = 0; j < list.size(); j++){
			if(i == list.get(j).intValue()){
				return true;
			}
		}
		return false;
	}
	
	public static int[][] setZero(int[][] arr){
		int[][] result = new int[arr.length][arr[0].length];
		//use two boolean[] to store the position, use O(N^2)
		return result;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,0},{2,3,0,1},{1,2,3,4},{2,3,4,5},{0,1,2,3}};
		matrixPrint(arr);
		matrixPrint(set0(arr));
	}

}
