package edu.java;

/*
 * start a new stack when the previous stack exceeds some threshold
 * implement a data structure setofstacks that mimics this.SetOfStacks should be composed of several stacks, and should 
 * create a new stack once the previous one exceeds capacity SetOfStacks push() and SetOfStacks pop() should behave 
 * identically to a single stack (that is, pop() should return the same values as it would if there were just a 
 * single stack)
 * 
 */
public class StackPlates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stack st = new stack();
		stack temp = new stack();
		temp.push(1);
		st.push(temp);
		
		Stacks s1 = new Stacks(st);
		s1.push(2);
		System.out.println(s1.pop());

	}
}

class Stacks{
    stack st;
    int pos;
    int capacity = 10;
    
    public Stacks(stack st){
    	this.st = st;
    	pos = 0;
    }
    
    Object pop(){
        if(st.top!=null){
        	  stack target = (stack)st.peek();
        	  Object item = target.pop();
        	  return item;
        }
        return null;
    }
    
    void push(Object item){
    	if(pos==capacity-1){
    		stack temp = new stack();
    		st.push(temp);
    		temp.push(item);
    	}
    	else{
    		((stack) st.peek()).push(item);
    		pos++;
    	}
    }
}
