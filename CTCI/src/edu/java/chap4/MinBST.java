package edu.java.chap4;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * Given a sorted (increasing order) array, write a algorithm to create a binary search tree with
 *  minimal height.
 */

public class MinBST {

	public static node find(int[] arr, int start, int end){
		if(end<start) return null;
		
		int pos = (start+end)/2;
		node n = new node(arr[pos]);
		n.left = find(arr,start,pos-1);
		n.right = find(arr,pos+1,end);
		return n;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr1= Arrays.copyOfRange(arr, 0, 4);
		System.out.println(arr1[3]);
		
		node n = find(arr,0,arr.length-1);
		System.out.println(n.data);
		System.out.println(n.left.data);
		System.out.println(n.right.data);
	}

}

class node{
	int data;
	node left;
	node right;
	
	node(int data){
		this.data = data;
	}
}
