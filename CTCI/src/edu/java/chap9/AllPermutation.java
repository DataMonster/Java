package edu.java.chap9;

import java.util.LinkedList;

public class AllPermutation {

	public static void getPer(char[] arr, int position, LinkedList<String> list){
		if(position == -1 ||position>arr.length-1){
			list.add("");
			return;
		}
		String pos = arr[position]+"";
		getPer(arr,position-1,list);
		LinkedList<String> temp = new LinkedList<String>();
		temp.addAll(list);
		for(int i = 0; i <temp.size();i++){
			insert(temp.get(i),pos,list);
			//String push = temp.get(i).concat(that);
			//list.add(push);
		}
		return;
		
	}
	
	public static void insert(String target,String that, LinkedList<String> list){
		for(int i = 0;i<target.length()+1;i++){
			String result = target.substring(0,i).concat(that).concat(target.substring(i,target.length()));
			list.add(result);
			//System.out.println(result);
		}
	}
	public static void main(String[] args) {
		char[] temp = {'a','b','c'};
		//String target = "abc";
		LinkedList<String> list = new LinkedList<String>();
		getPer(temp,(temp.length)-1,list);
		//insert(target,"d",list);
		System.out.println(list.size());
		for(int i = 0; i <list.size();i++){
			System.out.println(list.get(i));
		}
	}

}