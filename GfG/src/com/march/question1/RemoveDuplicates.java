package edu.java;
/*
 * Q6. Given a string, recursively remove adjacent duplicate characters from string. The output string should not have any adjacent duplicates. See following examples.

Input:  azxxzy
Output: ay
First "azxxzy" is reduced to "azzy". The string "azzy" contains duplicates, 
so it is further reduced to "ay".

Input: geeksforgeeg
Output: gksfor
First "geeksforgeeg" is reduced to "gksforgg". The string "gksforgg" contains 
duplicates, so it is further reduced to "gksfor".

Input: caaabbbaacdddd
Output: Empty String

Input: acaaabbbacdddd
Output: acac

reference: http://www.geeksforgeeks.org/recursively-remove-adjacent-duplicates-given-string/
 */

public class RemoveDuplicates {
	
	public int[] check(String str){
		int[] pos = new int[2];
		for(int i = 0; i<str.length()-1;i++){
			if (str.charAt(i)==str.charAt(i+1)){
				char start = str.charAt(i);
				pos[0] = i;
				int j;
				for(j = i; j<str.length(); j++){
					if(str.charAt(j)!=start) break;
				}
				pos[1] = j;
				//System.out.println(i+" "+j);
				return pos;
			}
		}
		return null;
	}
	
	public void reduce(String str){
		if(check(str)!= null){
			int[] pos = this.check(str);
			String sub =str.substring(0, pos[0]).concat(str.substring(pos[1], str.length()));
			//System.out.println(sub);
			this.reduce(sub);
		}
		else{
			System.out.println("This is result:");
			if(str.equals("")){
				System.out.println("Empty String");
			}
			else{
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
	
//	for(int i=0;i<10;i++){
//		System.out.println("hahaha");
//		if(i==3) break;
//		System.out.println(i);
//	}
		String str1 = "azxxzy";
		String str2 = "geeksforgeeg";
		String str3 = "caaabbbaacdddd";
		String str4 = "acaaabbbacdddd";
		
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.reduce(str1);
		rd.reduce(str2);
		rd.reduce(str3);
		rd.reduce(str4);
		
	}

}
