package edu.java.thread;

import java.util.Scanner;

public class MultiCalc {
   private long startTime = 0L;
   private long endTime =0L;
   
   private long totalResult = 0L;
   
   private Boolean[] isCompleted = null;
  
   public static void main(String[] args) {
	  
	   (new MultiCalc()).startUp();
   }
   
   private boolean isSuccessed(){
	   for(int i=0;i<isCompleted.length;i++){
		   if (!isCompleted[i])
			   return false;
	   }
	   return true;
   }
   
   
   private void startUp(){
	   int threadNum;
	   long numbers = 100L;

	   System.out.println("请输入要开启的线程数");
	   Scanner input  = new Scanner(System.in);
	   threadNum = input.nextInt();
	   isCompleted = new Boolean[threadNum];
	   
	   System.out.println("开始计时....");
	   startTime = System.currentTimeMillis();
	   for(int i=1;i<=threadNum;i++){
		   isCompleted[i-1] =false;
		   Thread t = new Thread(new CalcThread(i,numbers,threadNum));
		   t.start();
	   }
	   synchronized (MultiCalc.this) {
		   try {
	
			   MultiCalc.this.wait();
		
		   } catch (InterruptedException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
		   }
	   }
	   
	   endTime = System.currentTimeMillis();
	   
	   System.out.println("计算结果为："+totalResult);
	   System.out.println("计时结束，总耗时为："+(endTime-startTime)+"ms");   
   }
   
   class CalcThread implements Runnable{
	    private long start;
	    private long end;
	    private long result;
	    private int threadIndex;
	    public CalcThread(int threadIndex,long numbers,int threadNum){
	    	long step = numbers/threadNum;
	    	this.threadIndex = threadIndex;
	    	start = (threadIndex-1)*step+1;
	    	if (threadIndex==threadNum){ //是否是最后一个线程
	    		end = numbers;
	    	}else{
	    		end = threadIndex*step;
	    	}
	    	
	    	//System.out.println(Thread.currentThread().getName()+
	    			//"---->"+start+"~"+end);
	    }
		@Override
		public void run() {
           for(long i=start;i<=end;i++){
        	   try {
				Thread.sleep(10);
			   } catch (InterruptedException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
			   }
        	   result+=i;
           }
           
           //System.out.println(result);
           synchronized (MultiCalc.this) {
        	   totalResult +=result;
        	   isCompleted[this.threadIndex-1] = true;
        	   if (isSuccessed()){
        		   MultiCalc.this.notify();
        	   }
		   }
           
           //System.out.println(totalResult);
           
           
		}
   }
   
}
