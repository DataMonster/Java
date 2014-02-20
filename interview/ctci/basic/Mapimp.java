package com.dreamx.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mapimp {

	public void treemapex(){
		//THE KEY OF TREEMAP is sorted!
		Map<String, String> map = new TreeMap<String, String> ();
		map.put("a","a");
		map.put("w","b");
		map.put("s","c");
		map.put("c","b");
		map.put("wds","d");
		map.put("aaa","f");
		
		Iterator it = map.values().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("The values are not sorted while keys are sorted.");
		System.out.println(map.keySet().toString());
		System.out.println(map.values().toString());
		Iterator it2 = map.keySet().iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
	
	public void hashmapex(){
		//THE KEY OF TREEMAP is sorted!
		HashMap<String, String> map = new HashMap<String, String> ();
		map.put("a","a");
		map.put("w","n");
		map.put("s","b");
		map.put("c","c");
		map.put("wds","b");
		map.put("aaa","d");
		
		Iterator it = map.values().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("The values and keys are not sorted.");
		System.out.println(map.keySet().toString());
		System.out.println(map.values().toString());
		Iterator it2 = map.keySet().iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapimp imp = new Mapimp();
		imp.treemapex();
		imp.hashmapex();
	}

}
