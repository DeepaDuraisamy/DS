package com.example.coding;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {
	
	public static double reverseNumber(int number){
		//int number = 24567;
       int temp = number;
       int numberOfDigits =0;
		List<Integer> listofNumbers=new ArrayList<Integer>();
		while(number!=0){
			listofNumbers.add(number % 10);
			number = number/10;
			numberOfDigits ++;
		}
		double sum=0;
		double index=1;
		for(int i:listofNumbers){
			 sum = sum+ i * Math.pow(10,numberOfDigits-index);
			 index++;
		}
		return sum;
	}
	public static void main(String args[]){
		System.out.println(reverseNumber(24567));
	}
}
