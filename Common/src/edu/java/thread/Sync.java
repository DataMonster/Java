package edu.java.thread;

public class Sync implements Runnable {
	private String name;
	private account acct;
	private double draw;
	
	public Sync(String n, account a, double d){
		this.name = n;
		this.acct = a;
		this.draw = d;
	}
	

	public static void main(String[] args) throws InterruptedException {
		account a1 = new account("1001",1000);
		Sync s = new Sync("1",a1,50);
		Thread no1 = new Thread(s, "t1");

		Thread no2 = new Thread(s, "t2");
		Sync s2 = new Sync("2",a1,50000);
		no1.start();
		no2.start();
		//no2.join();
		Thread no3 = new Thread(s2, "t3");
		no3.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(acct){
			if(acct.balance>=draw){
				System.out.println(Thread.currentThread().getName()+" yes "+this.draw);
			try{
				Thread.sleep(1);
			} catch(InterruptedException ex){
				ex.printStackTrace();
			}
			acct.balance -=draw;
				System.out.println(" left:"+acct.balance);
			} else {
				System.out.println("No");
			}
		}
	}

}

class account {
	public String accountNo;
	double balance;
	
	public account(String accoutNo, double balance){
		this.accountNo = accoutNo;
		this.balance = balance;
	}
	//ignore the accountNo and balance properties getter and setter
	public int hashCode() {
		return accountNo.hashCode();
	}
	public boolean equals(Object obj){
		if(obj !=null && obj.getClass() == account.class){
			account target = (account)obj;
			return target.accountNo.equals(accountNo);
		}
		return false;
	}
}