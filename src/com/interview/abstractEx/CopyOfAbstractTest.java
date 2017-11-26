package com.interview.abstractEx;

abstract class AbstractImpl2 {
	private abstract void test1() ;
}
public class CopyOfAbstractTest extends AbstractImpl2{
	
	public void test1(){
		System.out.println("test1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOfAbstractTest test=new CopyOfAbstractTest();
		test.test1();
	}

}

 

