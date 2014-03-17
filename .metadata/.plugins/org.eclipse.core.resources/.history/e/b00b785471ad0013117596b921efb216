package edu.java.chap2;

import java.util.Iterator;
import java.util.LinkedList;

/* 
 * really similar to : detect if a linked list has a loop.
 * input: a->b->c->d->e->c
 * output: c
 * 
 */

public class CircleList {
	
	public static boolean check(LinkedList<Integer> list){
		Iterator it1 = list.listIterator();
		Iterator it2 = list.listIterator();
		it2.next();
		
		while(it1!=it2){
			if(!it2.hasNext()){
				return false;
			}
			it2.next();
			if(!it2.hasNext()){
				return false;
			}
			it1.next();
			it2.next();
		}
		return true ;
	}
	
	public static void main(String[] args) {
		char a;
		char b;
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		System.out.println(check(list));
	}

}
