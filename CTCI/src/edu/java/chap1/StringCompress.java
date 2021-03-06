package edu.java.chap1;

/*
 * simple string compress 
 * input: aaabbbccc
 * output:a3b3c3
 * if output is longer than input, then return input instead.
 */
public class StringCompress {
	
	public static void Stringbuffer(){
		StringBuffer sb = new StringBuffer();
		sb.append(1);
		System.out.println(sb.toString());
	}

	//time complex: O(n), space complex: O(n)
	public static void compress1(String str){
		if(str.length() == 0) {
			System.out.println("please enter a string longer than 0 length");
			return;
		}
		
		char pos = str.charAt(0);
		int num = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length();i++){
			if(str.charAt(i) == pos){
				num++;
			}
			else{
				sb.append(pos);
				sb.append(num);
				pos = str.charAt(i);
				num = 1;
			}
		}
		
		sb.append(pos);
		sb.append(num);
		String result = sb.toString();
		if(result.length()>str.length()){
			System.out.println(str);
		}else{
			System.out.println(result);
		}	
	}
	
	public static void main(String[] args) {
		String str = "aaabbbcccddd";
		//String str2 = "abcdefg";
		compress1(str);
	}

}
