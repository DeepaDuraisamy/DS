package com.example.coding;

public class NearestInteger {
	//private int[] intArray={1,2,3,5,8};
    private int[] intArray = {1,2,4,5,8,9};
	int result=13;
	private int[] resultArray=new int[2];
	public int[] findNearestNumber(){
		/*for(int index=0;index<(intArray.length-1);index++){
			 for(int number=(index+1);number<intArray.length;number++){
				  int sum=intArray[index]+intArray[number];
				  if(sum==result){
					  resultArray[0]=intArray[index];
					  resultArray[1]=intArray[number];
					  break;
				  }
			 }
			 break;
		}*/
	    //private int[] intArray = {1,2,4,5,8,9};

		for(int index=1;index<(intArray.length-1);index++){
			 for(int number=0;(number+index)<(intArray.length);number++){
				 System.out.println("a[" +number+"]"+"== a[" +(number+index)+"]");
				 System.out.println();
				 int sum=intArray[number]+intArray[number+index];
				  if(sum==result){
					  resultArray[0]=intArray[number];
					  resultArray[1]=intArray[number+index];
					  break;
				  }
			 }
			  System.out.println("===============================================");

			// break;
		}
		System.out.println("resultArray==== " +resultArray[0]);
		System.out.println("resultArray==== " +resultArray[1]);
		return resultArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NearestInteger nearestInteger = new NearestInteger();
		nearestInteger.findNearestNumber();
	}

	
}
