package ques1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class test3 {

	    public static LinkedList<String> letter(LinkedList<Integer> phoneNumber) {
	    	//if phone Number is null, return null;
	    	if(phoneNumber == null ||phoneNumber.size() == 0){
	    		return null;
	    	}
	    	//if there is '0' in phoneNumber, remove it
	    	for(int i = 0;i<phoneNumber.size();i++){
	    		if(phoneNumber.get(i)==0){
	    			phoneNumber.remove(i);
	    		}
	    	}
	    	
	    	Hashtable<Integer,String>  hs = new Hashtable <Integer, String> ();
	    	hs.put(1,"ABC");
	        hs.put(2,"DEF");
	        hs.put(3,"GHI");
	        hs.put(4,"JKL");
	        hs.put(5,"MNO");
	        hs.put(6,"PQR");
	        hs.put(7,"STU");
	        hs.put(8,"VWX");
	        hs.put(9,"YZ");
	        
	        LinkedList<String> result = new LinkedList<String>();
	        LinkedList<String> each = new LinkedList<String>();
	        result.add("");

	        for(int i=0;i<phoneNumber.size();i++){
	            for(String str: result){
	                String letters = hs.get(phoneNumber.get(i));
	                for(int j=0;j<letters.length();j++)
	                    each.add(str+letters.charAt(j));
	            }
	            result = each;
	            each = new LinkedList<String>();
	        }      
	        
	        for(String s:result){
	        System.out.println(s);
	        }
	        System.out.println(result.size());
	        return result;
	    }
    
	public static void main(String[] args) {
		String s = "212";
		LinkedList l = new LinkedList();
		//l.add(2);
		l.add(0);
		//l.add(2);
		System.out.println(letter(l));
	}

}
