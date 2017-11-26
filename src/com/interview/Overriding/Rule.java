package com.interview.Overriding;

public class Rule {
	
	int rulenumber;
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
