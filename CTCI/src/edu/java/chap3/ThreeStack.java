//Describe how you could use a single array to implement three stacks.
package edu.java.chap3;

public class ThreeStack {
	
	public static void change(int[] arr){
		arr[0]=1;
	}

	public static void method1(){
		int[] arr = new int[20];
		//int[] ar1 = Arrays.copyOfRange(arr, 0, arr.length/3);
		//System.out.println(ar1.length);
		//int[] ar2 = Arrays.copyOfRange(arr,arr.length/3,arr.length/3+arr.length/3);
		//int[] ar3 = Arrays.copyOfRange(arr,arr.length/3+arr.length/3,arr.length);
		//System.out.println(ar3.length);
		
		stack st1 = new stack(arr,0,arr.length/3-1);
		stack st2 = new stack(arr,arr.length/3,2*arr.length/3-1);
		stack st3 = new stack(arr,2*arr.length/3,arr.length);
		st1.push(1);
		st2.push(3);
		st3.push(4);
		
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		method1();
		
		
		/*System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);
		stack st = new stack(arr);
		System.out.println(st.arr[0]);
		st.set();
		System.out.println(st.arr[0]);
		System.out.println(arr[0]);
		*/
	}

}

class stack{
	public int[] arr;
	public int pos;
	public int start;
	public int end;
	public stack(int[] arr,int start,int end){
		this.arr = arr;
		this.pos = start;
		this.start = start;
		this.end = end;
	}
	//test the reference of arr is passed into the class
	public void set(){
		this.arr[0] = 2;
	}
	public void push(int x){
		if(pos<=end){
			this.arr[this.pos] = x;
			this.pos++;
		}
		else{
			System.out.println("this stack is full, try others");
		}
	}
	public int pop(){
		if(pos>start){
		int result = this.arr[this.pos-1];
		this.pos--;
		return result;
		} else {
			System.out.println("this stack is empty");
			return 0;
		}
	}
}
