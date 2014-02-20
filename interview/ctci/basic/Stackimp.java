package com.dreamx.collection;

import java.util.*;

public class Stackimp {
	
	public static Stack<String> stackexample(){
		Stack<String> s1 = new Stack<String>();
		s1.add("test1");
		s1.add("test2");
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		return s1;
	}
	
	public void example2(){
		Stack s = new Stack();
		s.add("test1");
		s.add(1);
		System.out.println(s);
		s.add(1, 2);//stack can choose the element adding position
		System.out.println(s);
		s.push("test2");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}
	
	public HashMap<Integer, Node> dfsexample(Node root){
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Stack<Node> stack = new Stack<Node> ();
		stack.push(root);
		while(!stack.isEmpty()){
			Node current = stack.pop();
			current.printNode();
			current.visited = true;
			if(current.left != null){
				stack.push(current.left);
			}
			if (current.right!= null){
				stack.push(current.right);
			}	
		}
		return map;
	}

	public Node setNode(Node root){
		//construct a simple tree structure
		Node h21 = new Node(2,"height2-1");
		Node h22 = new Node(2,"height2-2");
		root.left = h21;
		root.right = h22;
		Node h31 = new Node(3,"height3-1");
		Node h32 = new Node(3,"height3-2");
		Node h33 = new Node(3,"height3-3");
		Node h41 = new Node(4,"height4-1");
		Node h51 = new Node(5,"height5-1");
		h21.left = h31;
		h22.left = h32;
		h22.right = h33;
		h31.left = h41;
		h41.left = h51;
		return root;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackimp newstack = new Stackimp();
		//Stack s2 = Stackimp.stackexample();
		//newstack.example2();
		Node root = new Node(1,"root");
		newstack.setNode(root);
		root.left.left.left.left.printNode();
		HashMap <Integer, Node> map = newstack.dfsexample(root);
	}

}
/*already defined in Queueimp.java
class Node{
	int no = 0;
	boolean visited = false;
	String data = null;
	public Node left = null;
	public Node right = null;
	
	public Node(int size, String data){
		this.no = size;
		this.data = data;
	}
	
	public void visit(){
		this.visited = true;
	}
	
	public void printNode(){
		System.out.println(this.visited + ", "+this.data);
	}

}
*/
