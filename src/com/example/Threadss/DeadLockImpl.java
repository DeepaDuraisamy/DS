package com.example.Threadss;

public class DeadLockImpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue queue=new Queue();
		Thread1 threadObject1=new Thread1();
		Thread2 threadObject2=new Thread2();
		threadObject1.setThread2(threadObject2);
		threadObject2.setThread1(threadObject1);
		Thread thred1=new Thread(threadObject1);
		Thread thred2=new Thread(threadObject2);
		thred1.setName("DEEPA");
		thred1.setName("VASANTH");

		thred1.start();
		thred2.start();
	}
}
class Thread1 implements Runnable{
	//Queue queue;
	Thread2 thread2;
	public Thread2 getThread2() {
		return thread2;
	}
	public void setThread2(Thread2 thread2) {
		this.thread2 = thread2;
	}
	/*public Thread1(Thread2 thread2){
		//this.queue=queue;
		this.thread2=thread2;
	}*/
	public void run() {
		// TODO Auto-generated method stub
        System.out.println("THread 1 is running");

		// thread1 will complete only after acquiring thread2's lock 
         // where thread 2 will complete only afteracquiring thread1's lock.
        
        synchronized (this) {
            System.out.println("obtained lock on thread1 object");
            try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            synchronized(thread2){
                System.out.println("obtained lock on queue object");
            }
		}
        	
        
	}
}

class Thread2 implements Runnable{
//	Queue queue;
	Thread1 thread1;
	public Thread1 getThread1() {
		return thread1;
	}
	public void setThread1(Thread1 thread1) {
		this.thread1 = thread1;
	}
	/*public Thread2(Thread1 thread1){
		//this.queue=queue;
		this.thread1=thread1;
	}*/
	@Override
	public void run() {
        System.out.println("THrea21 is running");
        //wait for thread1 to unlock the object lock
        synchronized (this) {
            System.out.println("Thread 2 obtained lock on current  object");
            try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            synchronized(this.thread1){
                System.out.println("Thread2 obtained lock on thread1 object");
            }
		}
        
	}
}
/*class Queue{
	boolean isCompleted=false;
	int data=0;
}*/