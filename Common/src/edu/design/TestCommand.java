package edu.design;
/*
* sometimes when a method will accomplish a function but this method will treat different input differently
 * 
 */

public class TestCommand {
	//this is the command test
	public static void main(String... args){
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		pa.process(target,  new PrintCommand());
		System.out.println("-----------------------");
		pa.process(target, new AddCommand());
	}
}

interface Commands{
	void process(int[] target);
}

class ProcessArray{
	public void process(int[] target, Commands cmd){
		cmd.process(target);
	}
}

class PrintCommand implements Commands{
	public void process(int[] target){
		for (int tmp:target){
			System.out.println("target array " + tmp);
		}
	}
}

class AddCommand implements Commands{
	public void process(int[] target){
		int sum = 0;
		for(int tmp:target){
			sum += tmp;
		}
		System.out.println("target add is " + sum);
	}
}
