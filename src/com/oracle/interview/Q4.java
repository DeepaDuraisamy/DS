package com.oracle.interview;

import java.awt.Button;


public class Q4 {
	public static void main(String args[]){
		char a[]={'h','e','l','l','o'};
		System.out.println(new String(a).replace('l', 'i').substring(2));
		Q4 q4=new Q4();
		System.out.println(q4.alter(new String(a).replace('l', 'i')));
		System.out.println(a);
	}
	private String alter(String str) {
		// TODO Auto-generated method stub
		return str.replace('l', 'o');
	}
	  
}

