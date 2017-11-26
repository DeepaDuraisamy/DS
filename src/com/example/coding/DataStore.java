package com.example.coding;

public class DataStore {

	int data;
	boolean isdataAvailable;
 Class c;
	public boolean isIsdataAvailable() {
		return isdataAvailable;
	}

	public void setIsdataAvailable(boolean isdataAvailable) {
		this.isdataAvailable = isdataAvailable;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void clearData(){
		data=0;
		isdataAvailable=false;
	}
	public void writeData(int value){
		data=value;
		isdataAvailable=true;
	}
	public int readData(){
         return data;
	}
	
}
