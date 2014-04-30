package edu.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class blockqueue {

	public static void demo1() throws InterruptedException{
		BlockingQueue bq = new ArrayBlockingQueue(20);
		for(int i = 0;i<30;i++){
			bq.put(i);
			System.out.println("add element: "+i);
		}
		System.out.println("end!");
		return;
	}
	
	//this piece of code is used for blocking stack:
	public static void demo2() throws InterruptedException{
		final BlockingDeque bd =  new LinkedBlockingDeque(20);
		for(int i = 0;i<30;i++){
			bd.put(i);
			System.out.println("add element: "+i);
		}
		System.out.println("end!");
		return;
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		demo2();
	}

}
