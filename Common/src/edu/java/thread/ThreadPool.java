package edu.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	/**
	 * @param args
	 */
	
	public void schedule(){
		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();
		Thread t4 = new MyThread();
		pool.execute(t1);
		pool.execute(t2);
		
		pool.schedule(t3, 10, TimeUnit.SECONDS);
		pool.schedule(t4, 20, TimeUnit.SECONDS);
		pool.shutdown();
		
	}
	public static void main(String[] args) {
		// create a thread pool with set number
		ExecutorService pool = Executors.newFixedThreadPool(3);
		//ExecutorService pool = Executors.newSingleThreadExecutor();
		
		ExecutorService pool2 = Executors.newCachedThreadPool();
		//this pool2 will add more thread into pool(when no other thread running), the new thread do not need to wait.
		//pool2 will delete un runing thread(unrun for 60 secs)
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();

		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.shutdown();
		
	}

}

class MyThread extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}