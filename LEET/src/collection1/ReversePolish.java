package collection1;

import java.util.Stack;

/*
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class ReversePolish {

	public static int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<String>();
        for(int i = 0;i<tokens.length;i++){
        	if(tokens[i].equals ("+")||tokens[i].equals ("-")||tokens[i].equals ("*")||tokens[i].equals ("/")) {
        		int second = Integer.parseInt(st.pop());
        		int first = Integer.parseInt(st.pop());
        		if(tokens[i].equals ("+")) {
        			st.push((first+second)+"");
        		} else if(tokens[i].equals ("-")) {
        			st.push((first-second)+"");
        		} else if(tokens[i].equals ("*")) {
        			st.push((first*second)+"");
        		} else {
        			st.push((first/second)+"");
        		}
        	}
        	else {
        		st.push(tokens[i]);
        	}
        }
		return Integer.parseInt(st.pop());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "+";
		
		int a =1;
		int b =2;
		System.out.println(a/b);
		
		String[] arr = {"2", "1", "+", "3", "*"};
		System.out.println(evalRPN(arr));
	}

}
