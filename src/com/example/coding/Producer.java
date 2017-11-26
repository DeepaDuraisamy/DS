package com.example.coding;

public class Producer implements Runnable{
    private DataStore dataStore;
	public Producer(DataStore dataStore){
		this.dataStore=dataStore;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("---Producer started running--");
		
		  for(int i=0;i<100;i++){
				synchronized(this.dataStore){
					try{
						System.out.println("---Producer inside synchronized method--");
						while(this.dataStore.isdataAvailable){
							System.out.println("---Producer when data not available--");
							dataStore.wait();
						}
						putMessageinStore(i);
						System.out.println("---Producer before notify--");
						dataStore.notify();
					}catch(Exception exp){
						System.out.println("---inside exception--");
		
					}
				}
		  }
		
	}
    public void putMessageinStore(int value){
		System.out.println("---Producer sets data--");
		dataStore.writeData(value);
    }
}
