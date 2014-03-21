package edu.java;

import java.util.Iterator;
import java.util.Stack;

/* Write a program to sort a stack in ascending order You should not make any assump- tions about how the stack is 
implemented The following are the only functions that should be used to write this program: push | pop | peek | isEmpty
 */

public class SortStack {
	
	public static Stack<Integer> t = new Stack<Integer> ();
	
	public static void sorted(Stack<Integer> s, int num){
		int result = s.pop();
		for(int i = 0; i<num;i++){
			int temp = s.pop();
			if(temp < result){
				int tran = result;
				result = temp;
				temp = tran;
				t.push(temp);
			} else{
				t.push(temp);
			}
		}
		/*
		Iterator it = t.iterator();
		
		System.out.println("!"+t.size());
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		*/
		s.push(result);
		int size = t.size();
		for(int i = 0; i<size;i++){
			s.push(t.pop());
		}
		t.clear();
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer> ();
		s.push(1);
		s.push(4);
		s.push(3);
		s.push(7);
		s.push(6);
		s.push(2);
		
		for(int i = 5;i>0;i--){
		sorted(s,5);
		}
		
		Iterator it = s.iterator();
		System.out.println("\n"+s.size());
		while(it.hasNext()){
			System.out.print("?"+it.next());
		}
	}

}
