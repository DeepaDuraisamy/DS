package com.example.Threadss;

public class ThreadsEX extends Thread{
	int x=100;
	static int z=300;
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//throw new Exception();
		}
		System.out.println("Thread==1 "+Thread.currentThread().getName()+"status"+Thread.interrupted());

		try{
		x=x+10;
		int y=400+x;
		z=z+y;
		System.out.println("Thread=="+Thread.currentThread().getName());
		System.out.println("Thread=="+x);
		System.out.println("Thread=="+y);
		System.out.println("Thread=="+z);
		System.out.println("Thread== 2 "+Thread.currentThread().getName()+"status"+Thread.interrupted());

		}catch(Exception exp){
			System.out.println("inside Exception");
		}
		
		/*try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}*/
		System.out.println("After Exception");
	}

	public static void main(String args[]) throws InterruptedException{
	//	for(int i=0;i<8;i++){
			ThreadsEX example=new ThreadsEX();
			example.setName("exmaple");
			example.start();
			System.out.println("Thread== started "+Thread.currentThread().getName());
			example.interrupt();
			System.out.println("Thread== started "+Thread.currentThread().getName()+"status"+		example.isInterrupted()
);

			System.out.println("Thread== started "+Thread.currentThread().getName()+"status"+Thread.interrupted());
			Thread.sleep(2000);
			System.out.println("Thread== started "+Thread.currentThread().getName()+"status"+		example.isInterrupted()
					);
		//}
	}

}
