package com.oracle.interview;

import java.awt.Button;
import java.util.Arrays;
public class Q6 {
	int x=120;
	public static void main(String args[]){
		Q6 q1=new Q6();
		changeArray(q1);
		System.out.println(q1.x);
	}
	static Q6  changeArray(Q6 obj){
           obj=null;
           return obj;
       }
	  
}

/*main 
q1 ==   [] 120.changeArray()

changeArray()
obj     --> null;   */
