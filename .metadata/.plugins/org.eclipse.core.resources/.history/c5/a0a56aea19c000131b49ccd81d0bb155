
public class ReverseInteger {

	public static int  reverse(int x) {
		if(x>=0){
        char[] temp = Integer.toString(x).toCharArray();
        int i = 0;
        int j = temp.length-1;
        for(i=0;i<temp.length/2;i++){
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            j--;
        }
        return Integer.valueOf(String.valueOf(temp));
    } else {
    	x=0-x;
        char[] temp = Integer.toString(x).toCharArray();
        int i = 0;
        int j = temp.length-1;
        for(i=0;i<temp.length/2;i++){
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            j--;
        }
        return 0-Integer.valueOf(String.valueOf(temp)); 
    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toString(-12).toCharArray()[0]);
		char[] arr =null;
		String s = "-12";
		//String.valueOf(data)
		System.out.println(reverse(-123));
		
	}

}
