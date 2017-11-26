package com.interview.Supercons;

public class Rule1 {
	
	final private  String rulenumber;
	public Rule1(String num){
		rulenumber=num;
		System.out.println("rule1 ");
	}
	
	void printmessages(){
		System.out.println("method print in rule");
	}
	void printErrormessages(String messages){
		System.out.println("method print in rule");
	}
	
	final void printwarningmessages(String messages){
		System.out.println("method print in rule");
	}
}
