package collection4;

public class SortLinkedList {
	public static ListNode sortList(ListNode head) {
		// find the length of the linkedlist
		// if len is 0 or 1, skip the sort
		// else, use merge sort
		if (head == null || head.next == null) {
			return head;
		}
		int len = 1;
		ListNode second = head;
		while (second.next != null) {
			second = second.next;
			len++;
		}
		// System.out.println(len);
		/*ListNode middle = head;
		for (int i = 0; i < (len - 1) / 2; i++) {
			middle = middle.next;
		}*/
		// System.out.println(middle.val);
		mergeSort(head, 0, len-1);
		
		/*
		while(head.next!=null){
			System.out.println(head.val);
			head=head.next;
		}*/
		return null;
	}

	public static void mergeSort(ListNode node, int low, int high) {
		if (low < high) {
			int middle = (low + high - 1) / 2;
			// System.out.println("!"+middle);
			// mergeSort();
			mergeSort(node, low, middle);
			mergeSort(node, middle + 1, high);
			merge(node, low, middle, high);
			 System.out.println("mergesort "+low+" "+middle+" "+high);
		}
	}

	public static void merge(ListNode node, int low, int middle, int high) {
		System.out.println("inside merge"+node.val+"~"+low+"~"+middle+"~"+high);
		ListNode temp1 = node;
		ListNode temp2 = node;
		ListNode pre1 = null;
		ListNode pre2 = null;
		for (int i = 0; i < low; i++) {
			pre1 = temp1;
			temp1 = temp1.next;
		}

		ListNode node2 = pre1;
		for (int i = 0; i < middle + 1; i++) {
			pre2 = temp2;
			temp2 = temp2.next;
		}

		System.out.println("tempvalue"+temp1.val+"-"+temp2.val);
		System.out.println("PREVALUE"+pre1+"-"+pre2.val);
		
		int count1 = middle - low;
		int count2 = high - middle-1;
		System.out.println("countvalue"+count1+"-"+count2);
		
		while (count1 >= 0 && count2 >= 0) {
			System.out.println("while1");
			if (temp1.val <= temp2.val) {
				if(node2 ==null){
					node2 = temp1;	
				}else{
				node2.next = temp1;
				node2 = node2.next;
				}
				temp1 = temp1.next;
				count1--;
			} else {
				if(node2 == null){
					node2=temp2;
				}else{
				node2.next = temp2;
				node2 = node2.next;
				}
				temp2 = temp2.next;
				count2--;
			}
		}
		while (count1 >= 0) {
			System.out.println("while2");
			node2.next = temp1;
			node2 = node2.next;
			temp1 = temp1.next;
			count1--;
		}
		while (count2 >= 0) {
			System.out.println("while3");
			node2.next = temp2;
			node2 = node2.next;
			temp2 = temp2.next;
			count2--;
		}
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(5);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(3);
		n1.next.next.next = new ListNode(2);
		n1.next.next.next.next = new ListNode(1);
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
