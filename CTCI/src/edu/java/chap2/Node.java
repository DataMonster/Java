package edu.java.chap2;

public class Node {

	public Node next = null;
	int data;
	public Object data2;
	
	public Node(int item){
		data = item;
	}
	
	public Node(Object item){
		data2 = item;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, int d){
		Node n = head;
		
		if(n.data == d){
			return head.next;
		}
		
		while(n.next !=null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n =n.next;
		}
		return head;
	}
}
