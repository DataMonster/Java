package edu.design;

public class SimpleFactory {
	public Output getOutput(){
		return new BetterPrinter();  //only need to change the printer in here
	}
	
	public static void main(String... args){
		SimpleFactory sf = new SimpleFactory();
		Computer c = new Computer(sf.getOutput());
		c.keyIn("java");
		c.keyIn("j2ee");
		c.print();
	}
}

class Computer{
	private Output out;
	public Computer(Output out){
		this.out = out;
	}
	
	public void keyIn(String msg){
		out.getData(msg);
	}
	
	public void print(){
		out.out();
	}
}

class BetterPrinter implements Output{
	private String[] printData = new String[MAX_CACHE_LINE *2];
	private int dataNum = 0;
	@Override
	public void out() {
		// TODO Auto-generated method stub
		while(dataNum > 0){
			System.out.println("better printer is working: "+printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	
	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if (dataNum > MAX_CACHE_LINE * 2){
			System.out.println("full, fail to add");
		}else{
			printData[dataNum++] = msg;
		}
	}
	
}

interface Output{
	int MAX_CACHE_LINE = 50;
	public void out();
	public void getData(String msg);
	
}