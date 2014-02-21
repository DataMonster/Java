/**
 * Given two string representations of binary numbers, return a string
 * representation of their sum. For example:
 *
 *  "101"
 * + "11"    => badd("101", "11") -> "1000"
 * ------
 * "1000"
 *
 *   "11"
 * + "10"    => badd("11", "10") -> "101"
 * ------
 *  "101"
 *
 *   "01"
 * + "10"    => badd("01", "10") -> "011"
 * ------       (leading '0' is optional)
 *  "011"
 * 
 */
import java.util.Stack; 
public class computeString{
public String badd(String x, String y) {
    Stack<Integer> stack1 = new Stack<Integer> ();
    Stack<Integer> stack2 = new Stack<Integer> ();
    Stack<Integer> stack3 = new Stack<Integer> ();
    String z = "";
    
    for(int i=0; i <x.length(); i++){
    	int xint = Character.getNumericValue(x.charAt(i));
        stack1.push(xint);
    }
    for(int j=0; j <y.length(); j++){
    	int yint = Character.getNumericValue(y.charAt(j));
        stack2.push(yint);
    }
    //two stack for x, y;
    int x1 =0;
    int x2 =0;
    int remain = 0;
    if (x.length()<y.length()){
    while(!stack1.empty()){
        x1 = stack1.pop();
        x2 =stack2.pop();
        if (remain ==0){
        if(x1 == 0 && x2 ==0){
            stack3.push(0);
        }
        else if (x1 ==0&& x2==1 ){
            stack3.push(1);
        }
        else if(x1 ==1 && x2 == 0){
            stack3.push(1);
        }
        else{
            stack3.push(0);
            remain = 1;
        }
        }
        else{
            if(x1 == 0 && x2 ==0){
            stack3.push(1);
            remain = 0;
        }
        else if (x1 ==0&& x2==1 ){
            stack3.push(0);
            remain = 1;
        }
        else if(x1 ==1 && x2 == 0){
            stack3.push(0);
            remain = 1;
        }
        else{
            stack3.push(1);
            remain = 1;
        }
        }
    }
    while(!stack2.empty()){
    	stack3.push(stack2.pop());
    }
    }
    
    else{
    while(!stack2.empty()){
        x1 = stack1.pop();
        x2 =stack2.pop();
        if (remain ==0){
        if(x1 == 0 && x2 ==0){
            stack3.push(0);
        }
        else if (x1 ==0&& x2==1 ){
            stack3.push(1);
        }
        else if(x1 ==1 && x2 == 0){
            stack3.push(1);
        }
        else{
            stack3.push(0);
            remain = 1;
        }
        }
        else{
            if(x1 == 0 && x2 ==0){
            stack3.push(1);
            remain = 0;
        }
        else if (x1 ==0&& x2==1 ){
            stack3.push(0);
            remain = 1;
        }
        else if(x1 ==1 && x2 == 0){
            stack3.push(0);
            remain = 1;
        }
        else{
            stack3.push(1);
            remain = 1;
        }    
    }
    }
    while(!stack1.empty()){
    	stack3.push(stack1.pop());
    }
    }
    
    if(remain == 1){
    	stack3.push(remain);
    }
    else{stack3.push(0);}
    
    while (!stack3.empty()){
    	z = z+stack3.pop();
    }  
    return z;
 }
 	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 test11 = new Test11();
		String a = "101";
		String b = "111";
		String c = null;
		
		c = test11.badd(a, b);
		System.out.println(c);

	}

}
