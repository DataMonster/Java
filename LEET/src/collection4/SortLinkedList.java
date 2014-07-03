package collection4;

public class SortLinkedList {
	public static ListNode sortList(ListNode head) {
		//find the length of the linkedlist
		//if len is 0 or 1, skip the sort
		//else, use merge sort
		if(head == null || head.next == null){
			return head;
		}
		int len = 1;
		ListNode second = head;
		while(second.next!=null){
			second = second.next;
			len++;
		}
		//System.out.println(len);
		ListNode middle = head;
		for(int i = 0;i<(len-1)/2;i++){
			middle = middle.next;
		}
		//System.out.println(middle.val);
		//mergeSort()
		return null;
	}
	
	public static void mergeSort(){
		
	}
	
	public static void main(String[] args){
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(7);
		n1.next.next.next = new ListNode(3);
		n1.next.next.next.next = new ListNode(5);
		sortList(n1);
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