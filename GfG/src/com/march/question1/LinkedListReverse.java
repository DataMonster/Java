package com.march.question1;

import java.util.LinkedList;

/*
Q4. Given a linked list, reverse alternate nodes and append them to end of list. 
Extra allowed space is O(1) 
Examples:

Input List:  1->2->3->4->5->6
Output List: 1->3->5->6->4->2

Input List:  12->14->16->18->20
Output List: 12->16->20->18->14
 */
//print out is not correct
public class LinkedListReverse {
	
	public static void reve(LinkedList<String> list){
		String temp = "";
		for(int i =0;i<list.size()/2;i++){
			i++;
			temp = list.get(i);
			list.remove(i);
			list.add(temp);
			i--;
		}
		
		for(int i = 0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
	
	public static void main(String... args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		reve(list);
	}
}
