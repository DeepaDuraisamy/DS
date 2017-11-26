package com.example.coding;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable{
	private DataStore dataStore;
	public Consumer(DataStore dataStore){
		this.dataStore=dataStore;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("---Consumer started running--");
		List<Integer> integerList=new ArrayList();
		  for(int i=0;i<100;i++){
				synchronized(this.dataStore){
					try{
						System.out.println("---Consumer inside synchronized method--");
		 				while(!this.dataStore.isdataAvailable){
							System.out.println("---Consumer when data not available--");
							dataStore.wait();
						}
						integerList.add(readMessageinStore());
						dataStore.clearData();
						System.out.println("---Consumer before notify--");
						dataStore.notify();
					}catch(Exception exp){
						System.out.println("---Consumer exception--");
		
					}
				}
		  }
		  System.out.println("--List-"+integerList);
	}
    public int readMessageinStore(){
    	return this.dataStore.getData();
    }
}
