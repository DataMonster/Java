package com.march.question2;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Write a GetNth() function that takes a linked list and an integer 
index and returns the data value stored in the node at that index position.
 */

public class GetNode {

	public static Object GetNth(LinkedList<Object> list, int index){
		Iterator<Object> it = list.iterator();
		for(int i = 0; i<index-1;i++){
			it.next();
		}
		return it.next();
	}
	
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		for(int i =1; i<=10;i++){
			list.add(i);
		}
		System.out.println(GetNth(list,5));
	}

}
