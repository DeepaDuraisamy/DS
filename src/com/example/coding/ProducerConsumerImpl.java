package com.example.coding;

public class ProducerConsumerImpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DataStore dataStore=new DataStore();
           Producer producer =new Producer(dataStore);
           Consumer consumer = new Consumer(dataStore);
           Thread thread1=new Thread(producer);
           Thread thread2=new Thread(consumer);
           thread1.start();
           thread2.start();
	}
}
