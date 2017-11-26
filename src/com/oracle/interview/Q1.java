package com.oracle.interview;


public class Q1 {
	int data=0;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public static void main(String args[]){
		 int i=5/2;
         System.out.println("==newString=="+i);
		int[] aValue={1};
		Q1 q1=new Q1();
		q1.changeArray(aValue);
	   //  changeObject(q1);
		try{
			//System.out.println(aValue[aValue.length-1]);
			while(true){
				q1.hello();
			}
		}catch(Error error){
			System.out.println("---Error"+error.getMessage());
		}
	}
	
	void hello(){
		new Q1();
	}
	
	void changeArray(int[] aParam){
		aParam[aParam.length-1]++;
	}
	void changeObject(Q1 q1){
	    q1.data=5;
	}
}

