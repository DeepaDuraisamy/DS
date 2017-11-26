package com.example.Threadss;

import java.util.Date;


public class DaemonThreadExample1 extends Thread{

	   public void run(){  
			
		  // Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing"+ "Time=="+ new Date().getTime());  
		      System.out.println("Daemon thread state"+Thread.currentThread().getState()+"Time=="+ new Date().getTime());  
		      for(int i=0;i<10000;i++){
			    //  System.out.println("Daemon thread "+i);  
		      }
		  }  
		  else{  
		      System.out.println("user(normal) thread executing" + "Time=="+ new Date().getTime()); 
		      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          }  
	   }  
	   public static void main(String[] args) throws InterruptedException{  
		 /* Creating two threads: by default they are 
		  * user threads (non-daemon threads)
		  */
		 DaemonThreadExample1 t1=new DaemonThreadExample1();
		 DaemonThreadExample1 t2=new DaemonThreadExample1();   
				 
		 //Making user thread t1 to Daemon
		 t1.setDaemon(true);
	        //starting both the threads 
	        t1.start(); 
	        t2.start();  
	        t1.setDaemon(false);
	     //   t1.setDaemon(false);
	        /*Thread.sleep(1000);
	        System.out.println("t2 state"+t2.getState()+"Time=="+ new Date().getTime()); 
	      
	        System.out.println("t1 state"+t1.getState()+"Time=="+ new Date().getTime()); 
	       // if(t2.getState().equals("TERMINATED")){
	       System.out.println("main thread state"+Thread.currentThread().getState()); */
	        //}
	   } 
	}