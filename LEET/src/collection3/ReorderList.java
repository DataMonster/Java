package collection3;

import java.util.Queue;

/*
 * Given a singly linked list L: L0��L1������Ln-1��Ln,
 reorder it to: L0��Ln��L1��Ln-1��L2��Ln-2����

 You must do this in-place without altering the nodes' values.

 For example,
 Given {1,2,3,4}, reorder it to {1,4,2,3}.

 */
public class ReorderList {

	public static int getlength(ListNode n) {
		int result = 0;
		while (n != null) {
			result++;
			n=n.next;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(1);
		ListNode n4 = null;
		n1.next = n2;
		n2.next = n3;
		n3.next=n4;
		System.out.println(getlength(n1));
		System.out.println(getlength(n2));
		System.out.println(getlength(n4));
		
		
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}