package com.oracle.interview;

import java.awt.Button;
import java.util.Arrays;
public class Q5 {
	public static void main(String args[]){
		String a[] = {"Delhi","B'lore","Mysore"};
		String b[]={"Delhi","B'lore","Mysore"};
		System.out.print(a.equals(b));
		System.out.print(a==b);
		System.out.print(Arrays.equals(a,b));
		//System.out.print(a.compareTo(b));
	}
	private String alter(String str) {
		// TODO Auto-generated method stub
		return str.replace('l', 'o');
	}
	  
}

