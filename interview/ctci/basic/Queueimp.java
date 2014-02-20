package com.dreamx.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queueimp {
	
	public void queueexample(){
		Queue q1 = new LinkedList();
		q1.add("test1");
		q1.add(12);
		System.out.println(q1.peek());
		System.out.println(q1.peek());
		q1.remove();
		System.out.println(q1.peek());
	}
	
	public LinkedList<Node> bfsexample(Node root){
		//use bfs to get the Node whose no is larger than 3 but less than 5
		Queue<Node> queue = new LinkedList<Node>();
		LinkedList<Node> nodes = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node current = queue.remove();
			current.visited = true;
			if(current.left!=null){
				queue.add(current.left);
			}
			if (current.right!=null){
				queue.add(current.right);
			}
			if(current.no>=3&&current.no<=5){
				nodes.add(current);
				current.printNode();
			}
		}
		return nodes;
	}
	
	public Node setNode(Node root){
		//construct a simple tree structure
		Node h21 = new Node(2,"height2-1");
		Node h22 = new Node(2,"height2-2");
		root.left = h21;
		root.right = h22;
		Node h31 = new Node(3,"height3-1");
		Node h32 = new Node(3,"height3-2");
		Node h33 = new Node(0,"height3-3");
		h21.left = h31;
		h22.left = h32;
		h22.right = h33;
		return root;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueimp newqueue = new Queueimp();
		//newqueue.queueexample();
		Node root = new Node(1,"root");
		newqueue.setNode(root);
		LinkedList<Node> nodes = newqueue.bfsexample(root);
	}
}

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

