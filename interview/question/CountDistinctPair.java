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
//The method2 in that page is more efficient than this one

import java.util.ArrayList;
import java.util.List;
public class CountDistinctPair {

	public void count(int[] arr, int k){
		List <Integer> list = new ArrayList<Integer>();
		int[] arr2 = arr;
		for(int i:arr){
			for(int j:arr2){
				if(i>j){
					if(i-j==k){
						list.add(i);
						list.add(j);
					}
				}
			}
		}
		System.out.println("Output Num: "+list.size()/2);
		for(int z=0;z<list.size();z++){
			System.out.println("{"+list.get(z)+", "+list.get(++z)+"}");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDistinctPair cdp = new CountDistinctPair();
		int[] arr = {8, 12, 16, 4, 0, 20};
		int k = 4;
		cdp.count(arr, k);
		
	}

}
