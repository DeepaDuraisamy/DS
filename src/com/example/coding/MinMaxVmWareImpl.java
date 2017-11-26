package com.example.coding;

public class MinMaxVmWareImpl {
	public static void main(String[] args) {
		Incrementor incrementor=new Incrementor();
		Thread thread1=new Thread(incrementor);
		Thread thread2=new Thread(incrementor);
		thread1.setName("First");
		thread2.setName("Second");
		thread1.start();
		thread2.start();
		
	}
}
