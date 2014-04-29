package edu.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mycall {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Callable c1 = new MyCallable("A");
		Callable c2 = new MyCallable("B");
		
		Future f1 = pool.submit(c1);
		Future f2 = pool.submit(c2);
		
		System.out.println(f1.get().toString());
		System.out.println(f2.get().toString());
		
		pool.shutdown();
	}

}

class MyCallable implements Callable {
	private String old;
	
	MyCallable(String old) {
		this.old = old;
	}
	
	public Object call() throws Exception{
		return old + "return content";
	}
}
