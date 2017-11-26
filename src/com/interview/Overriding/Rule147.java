package com.interview.Overriding;

public class Rule147 extends Rule{

	void printmessages(){
		System.out.println("printmessages");
	}
   public void printErrormessages(String[] messages){
		System.out.println("method print in rule");
	}
	
	void printErrormessages(String messages){
		System.out.println("method print in rule");
	}
	 
}
