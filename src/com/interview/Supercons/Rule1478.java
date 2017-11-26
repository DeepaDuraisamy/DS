package com.interview.Supercons;

public class Rule1478 extends Rule1{

	public Rule1478(String num) {
		super(num);
		System.out.println("after executingrule 1478");

		// TODO Auto-generated constructor stub
	}
	/*public Rule1478(String num) {
		super(num);
		// TODO Auto-generated constructor stub
	}*/
	void printmessages(){
		System.out.println("printmessages");
	}
   public void printErrormessages(String[] messages){
		System.out.println("method print in rule");
	}
	
	void printErrormessages(String messages){
		System.out.println("method print in rule");
	}
	
	public static void main(String[] args){
		Rule1478 rule=new Rule1478("x");
	}
	
}
