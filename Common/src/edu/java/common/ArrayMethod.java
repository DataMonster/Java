package edu.java.common;

import java.util.Arrays;

public class ArrayMethod {
	
	public void arrayMethodView(int[] arr){
		/*
		 * this is a method for Arrays common methods
		 * int binarySearch(type[] a, type key)
		 * binarySearch(type[] a)
		 * type[] copyOf(a, b)
		 * type[] copyOfRange
		 * boolean equals
		 * void fill(type[] a, type val)
		 * void fill(type[] a, int fromIndex, int toIndex, type val)
		 * void sort(type[] a)
		 * void sort(type[] a, int fromIndex, int toIndex)
		 * String toString(type[] a)
		 * static void arraycopy
		 */
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
		System.out.println();	
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		
		int x;
		x = Arrays.binarySearch(arr,2);
		
		System.out.println("To search 2, which is not in the array, will be nagetive: "+x);
		
		x = Arrays.binarySearch(arr, 8);
		System.out.println("To search 8, which is not in the array, will be positive: "+x);

	}
	
	public static void main(String[] args){
		int[] arr = {11, 4, 13, 5, 8, 10};
		ArrayMethod amv = new ArrayMethod();
		amv.arrayMethodView(arr);
		
		System.out.println(Arrays.binarySearch(arr, 5));
		
	}

}
