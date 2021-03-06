package com.java;

public class test2 {

	public static Node mergeLists(Node head1, Node head2) {
		Node head = new Node(0, null);
		Node current = head;

		while (head1 != null && head2 != null) {
			if (head1.value <= head2.value) {
				current.next = head1;
				head1 = head1.next;
			} else {
				current.next = head2;
				head2 = head2.next;
			}
			current = current.next;
		}
			if (head1 != null) {
				current.next = head1;
			} else if (head2 != null) {
				current.next = head2;
			}
			return head.next;
	}

	public static void main(String[] args) {
		
		
		
		Node n4 = new Node(4, null);
		Node n3 = new Node(3,n4);
		Node n2 = new Node(2,n3);
		Node n1 = new Node(1,n2);
		
		Node x4 = new Node(7, null);
		Node x3 = new Node(5,x4);
		Node x2 = new Node(3,x3);
		Node x1 = new Node(1,x2);
		
		Node xx = mergeLists(n1,x1);
		for(int i =0;i<7;i++){
			xx=xx.next;
			System.out.println(xx.value);
		}
	}

}

class Node {
	public int value;
	public Node next;

	public Node() {
		value = 0;
		next = null;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}
