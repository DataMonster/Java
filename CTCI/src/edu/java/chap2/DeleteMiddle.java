package edu.java.chap2;

/*
 * implement an algorithm to delete a node in the middle of a singly linked list, given only 
 * access to that node.
 * example:
 * input: the node c from the linked list a->b->c->d->e
 * result: nothing is returned, but the new linked list like a->b->d->e
 * 
 */

public class DeleteMiddle {

	public static boolean delete(Node node){
		if(node == null||node.next == null){
			return false;
		}
		
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		return true;
		
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		node.appendToTail(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);
		
		
	}

}
