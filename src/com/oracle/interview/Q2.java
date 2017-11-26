package com.oracle.interview;

import java.awt.Button;


public class Q2 {
	public static void main(String args[]){
		
		System.out.println("test" == "test");
		System.out.println("test".equals("test"));
	//	System.out.println(" test" = " test ");
		System.out.println("test".equals(new Button("test")));
		someMethod();
	}
	public static void someMethod(){

		  Q1 localObject = new Q1();
	      method2(localObject);
		  System.out.println("local object"+localObject.getData());

		}

		public static void method2(Q1 localObject){
		  localObject.setData(10);
		}
}

