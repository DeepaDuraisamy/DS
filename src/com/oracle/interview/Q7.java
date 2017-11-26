package com.oracle.interview;

import java.awt.Button;
import java.util.Arrays;
public class Q7 {
	int x=120;
	public static void main(String args[]){
		/*Q7 q1=new Q7();
		changeArray(q1);
		System.out.println(q1.x);*/
		
		short y=6;
		long x=7;
		test(y);
		test(x);
	}
	public static void test(Long n){System.out.println("Long");}
	public static void test(Short n){System.out.println("Short");}
	public static void test(int n){System.out.println("int");}
}

/*main 
q1 ==   [] 120.changeArray()

changeArray()
obj     --> null;   */
