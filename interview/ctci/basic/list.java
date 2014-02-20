/*
 * this file has all useful implenmentations of list abstract class
*/

//ArrayList
package com.dreamx.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
	public void exampleList(){
		ArrayList<String> list1 =new ArrayList <String> ();
		ArrayList<String> sublist = new ArrayList<String> ();
		list1.add("test1");
		sublist.add("test2");
		list1.addAll(sublist);
		
		System.out.println("The super list: " + list1);
		System.out.println("The sub list: " + sublist);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Whether the super list contains test1: " + list1.contains("test1"));
		System.out.println("Whether the super list contains sublist: " + list1.containsAll(sublist));
		System.out.println("Whether the super list equals sublist: " + list1.equals(sublist));
		System.out.println("Hash code for super and sub list: "+ list1.hashCode() +" "+ sublist.hashCode());
		sublist.clear();
		System.out.println("Clear all elements in sublist: "+sublist.isEmpty());
		
		Iterator<String> it1 = list1.iterator();
		System.out.println("The first element in iterator: " + it1.next());
		
		ArrayList<String> sublist2 = new ArrayList<String> ();
		sublist2.add("test3");
		list1.addAll(sublist2);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("After add another sublist, the new list1 is " + list1 + " size: "+ list1.size());
		list1.remove("test2");
		list1.removeAll(sublist2);
		System.out.println("Remove sublist and sublist2: " + list1.toString());
		
		//System.out.println(list1.toArray());
		
	}
	
	public void advancedExample(){
		//ArrayList has three main constructors shown:
		//ArrayList(), ArrayList(Collection<? extends E> c), ArrayList(int Capacity)
		long heapSize = Runtime.getRuntime().freeMemory();
		System.out.println("Size : "+ heapSize);
		
		ArrayList<String> list1 = new ArrayList<String> ();
		//ArrayList<String> list2 = new ArrayList<String> ();
		list1.add("test");
		
		//ensureCapacity(int) method does influence the freeMemory remain.
		System.out.println("Size before take larger memory space: "+ heapSize);
		
		list1.ensureCapacity(100000);
		heapSize = Runtime.getRuntime().freeMemory();
		System.out.println("Size after take larger memory space: "+ heapSize);
		
		//trimToSize() can reduce the space and set the arraylist to the actual size, but cannot really influence the memory space
		list1.trimToSize();
		heapSize = Runtime.getRuntime().freeMemory();
		System.out.println("Size after trim memory space: "+ heapSize);
	}
	
	public void ArrayListToArray(){
		ArrayList<String> list1 = new ArrayList<String> ();
		list1.add("1");
		list1.add("second");
		String array[] = new String[list1.size()];
		list1.toArray(array);
		for(String s:array)
		System.out.println(s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List newList = new List();
		newList.exampleList();
		newList.advancedExample();
		newList.ArrayListToArray();
		
	}

}

//LinkedList



