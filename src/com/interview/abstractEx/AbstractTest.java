package com.interview.abstractEx;

final abstract class AbstractImpl3 {
	//private abstract void test1() ;
}
public class AbstractTest extends AbstractImpl3{
	
	public void test1(){
		System.out.println("test1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractTest test=new AbstractTest();
		test.test1();
	}
}

 

