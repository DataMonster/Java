package edu.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * collection has useful methods for List:
 * static void reverse
 * static void shuffle
 * static void sort
 * static void sort
 * static void swap
 * static void rotate
 * 
 */
public class CList {
	public static void main(String... args){
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(1);
		System.out.println(nums);
		
		Collections.reverse(nums);
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.shuffle(nums);//random out put
		System.out.println(nums);
		
		/*
		 * static int binarySearch
		 * static Object max
		 * static Object max
		 * static Object min
		 * static Object min
		 * statuc void fill
		 * static int frequency
		 * static int indexOfSubList
		 * static int lastIndexOfSubList
		 * static boolean replaceAll
		 * 
		 * 
		 * more important: synchronized...
		 * thread safe!
		 */
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
		
		
		//create an unchangeable class
		//emptyxxx(), singletonxxx(), unmodifiablexxx()
		List unmodifiableList = Collections.emptyList();
		Set unmodifiableSet = Collections.singleton("aa");
		Map scores = new HashMap();
		scores.put("1", 1);
		scores.put("2", 2);
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//can not add more elements into unmodifiablexxx
		
	}
}
