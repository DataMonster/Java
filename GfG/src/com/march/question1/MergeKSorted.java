package com.march.question1;

import java.util.Arrays;

/*
 * Q2. Given k sorted arrays of size n each, merge them and print the sorted output.

Example:

Input:
k = 3, n =  4
arr[][] = { {1, 3, 5, 7},
            {2, 4, 6, 8},
            {0, 9, 10, 11}} ;

Output: 0 1 2 3 4 5 6 7 8 9 10 11 

reference:  http://www.geeksforgeeks.org/merge-k-sorted-arrays/

 */

public class MergeKSorted {
	public static void merge(int[][] arr, int k, int n){
		//append to one array
		int[] append = new int[k*n];
		int pos =0;
		for(int i =0; i<k;i++){
			for(int j= 0; j<n;j++){
				append[pos++] = arr[i][j];
			}
		}
		Arrays.sort(append);
		for (int i=0;i<n*k;i++){
			System.out.print(append[i]+" ");
		}
	}
	
	public static void main(String... args){
		int[][] arr = { {1, 3, 5, 7},
	            {2, 4, 6, 8},
	            {0, 9, 10, 11}} ;
		merge(arr,3,4);
	}

}
