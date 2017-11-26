package com.example.coding.array;

public class ArrayDuplicate {
	int arr[]={3,4,5,3,4,7};
	int newArr[]={3,4,5,3,4,7};
	public  void findDuplicate(){
		for(int a=0;a<newArr.length;a++){
			for(int b=(a+1);b<arr.length;b++){
				if(arr[a]==arr[b]){
					System.out.println("---found duplicate---"+arr[a]);
					/*for(int i=b;i<(newArr.length-1);i++){
							newArr[i]=newArr[i+1];
					}*/
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDuplicate array1=new ArrayDuplicate();
		array1.findDuplicate();
	}
}
