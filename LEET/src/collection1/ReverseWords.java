package collection1;

/*
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */
public class ReverseWords {

public static String reverseWords2(String s) {
        char[] arr = s.toCharArray();
        char[] arr2 = new char[arr.length];
        for(int i = 0;i<arr.length;i++){
        	arr2[i] = arr[arr.length-1-i];
        }
        return new String(arr2);
    }

public static String reverseWords(String s) {	
	String[] arr = s.split(" ");
	String[] arr2 = new String[arr.length];
	int j = 0;
	for(int i = 0;i<arr.length;i++){
		if(!arr[i].equals("")){
			arr2[j] = arr[i];
			j++;
		}
	}
	System.out.println(j);
	StringBuffer sb = new StringBuffer();
    
    for(int i = 0;i<j/2;i++){
    	String temp = arr2[i];
    	arr2[i] = arr2[j-1-i];
    	arr2[j-1-i] = temp;
    	if(i>0){
    		sb.append(" ");
    		sb.append(arr2[i]);
    	} else {
    		sb.append(arr2[i]);
    	}
    }
    for(int i = j/2;i<j;i++){
    	if(i>0){
    	sb.append(" ");
    	sb.append(arr2[i]);
    	}
    	else{
    		sb.append(arr2[i]);
    	}
    }
    
    return sb.toString();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a    s    d";
		String s1 = "   ";
		System.out.println(s1.trim());
		System.out.println(s.length());
		System.out.println(s.split(" ").length);
		System.out.println(reverseWords(s));
	}

}
