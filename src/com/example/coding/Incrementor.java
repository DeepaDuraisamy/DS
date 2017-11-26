package com.example.coding;

public class Incrementor implements Runnable{
	
	private int value;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
	      System.out.println("Before increment "+Thread.currentThread().getName()+" "+value);
		  value++;
		  System.out.println("After incrment  "+Thread.currentThread().getName()+" "+value);
		}
		  System.out.println("value MAX by ==== "+Thread.currentThread().getName()+" "+value);
	}
	

}
