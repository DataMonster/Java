package edu.java.chap11;

public class Sorting {

	public static void mergesort(int[] arr, int start, int end){
		if(start < end){
			mergesort(arr, start, (start+end)/2);
			mergesort(arr,(start+end)/2+1,end);
			merge(arr, start, end);
		}
	}
	
	public static void merge(int[] arr, int start, int end){
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			temp[i] = arr[i];
		}
		
		int i = start;
		int j = (end+start)/2+1;
		int k = start;
		while(i<(end+start)/2+1&&j<end+1){
			if(temp[i]<=temp[j]){
				arr[k]=temp[i];
				i++;	
			}
			else{
				arr[k] = temp[j];
				j++;
			}
			k++;
		}

		for(int n= 0; n<=(end+start)/2-i;n++){
			arr[k+n] = temp[i+n];
		}
	}
		
	
	
	public static void main(String[] args) {
		// this contains three main sorting algorithm: mergesort, quicksort and binarysot.
		//start with the input array
		int[] arr1 = {3,2,1,5,6,7,9,0,12,42,8}; //arr1 has no duplicate numbers
		//int[] arr2 = {3,2,1,5,6,2,3,6,6,13,4};
		mergesort(arr1,0,10);
		System.out.println(arr1[0]);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}

	}

}
