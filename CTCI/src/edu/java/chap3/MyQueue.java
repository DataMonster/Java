package edu.java.chap3;

import java.util.Stack;

//Implement a MyQueue class which implements a queue using two stacks

public class MyQueue {
	
	Stack<Object> stack1;
	Stack<Object> stack2;
	
	public MyQueue(){
		stack1 = new Stack<Object>();
		stack2 = new Stack<Object>();
	}
	
	public void add(Object item){
		stack1.push(item);
	}
	
	public Object remove(int num){
		return null;
	}
	
	public Object get(int num){
		stack2.clear();
		int size = stack1.size();
		for(int i = 0; i < size; i++){
			//System.out.println(stack1.pop());
			stack2.push(stack1.pop());
		}
		
		if(num<size){
			Object temp = null;
			for(int i = 0; i<size; i++){
				if(i<=num){
				temp = stack2.pop();
				stack1.push(temp);
				}
				else{
					stack1.push(stack2.pop());
				}
			}
			return temp;
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.add(1);
		mq.add(2);
		System.out.println(mq.get(0));
		System.out.println(mq.get(1));
	}

}
