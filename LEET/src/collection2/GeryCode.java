package collection2;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * The gray code is a binary numeral system where two successive values differ in only one bit.

 Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

 For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

 00 - 0
 01 - 1
 11 - 3
 10 - 2
 Note:
 For a given n, a gray code sequence is not uniquely defined.

 For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

 For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 */

public class GeryCode {

	//O(n^2) time complexity
	public ArrayList<Integer> gray(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		for (int i = 0; i < n; i++) {
			int inc = 1 << i;
			for (int j = arr.size() - 1; j >= 0; j--) {
				arr.add(arr.get(j) + inc);
			}
		}
		return arr;
	}

	//O(n^3)...
	public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		n = (int) Math.pow(2, n);
		int[] arr = new int[n];
		int count = 0;
		list.add(0);
		arr[0] = -1;
		int current = 0;
		// System.out.println("@"+list.size());
		while (count < n) {
			for (int i = 0; i < arr.length; i++) {
				// System.out.println(checkBit(current,arr[i])+""+(arr[i]!=-1));
				if (checkBit(current, i) && arr[i] != -1) {
					list.add(i);
					arr[i] = -1;
					break;
				}
			}
			// System.out.println("!"+current+" "+count+" "+list.size());
			count++;
			if (count < n)
				current = list.get(count);
		}
		return list;
	}

	public boolean checkBit(int i, int j) {
		int re = i ^ j;
		String s = Integer.toBinaryString(re);
		int sum = 0;
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == '1') {
				sum++;
			}
		}
		if (sum == 1) {
			return true;
		}
		return false;
	}

	public static boolean checkGray(int[] arr) {
		// should check the length of arr, int n is the bits, 2^n -1 is the
		// length
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		if (result == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 2, 3, 7, 6, 4, 5, 1 };
		System.out.println(checkGray(arr));

		// System.out.println(checkBit(0, 1));
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(Integer.toBinaryString(1 << 1));
		System.out.print((1 << 0) + " " + (2 >> 1));

		/*
		 * ArrayList ll = grayCode(3); Iterator it =ll.iterator();
		 * while(it.hasNext()){ System.out.println(it.next()); }
		 */

	}

}
