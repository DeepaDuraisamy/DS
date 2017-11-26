package com.interview.CollectionEx;

import java.util.Iterator;
import java.util.TreeSet;

import com.oracle.interview.Q1;

public class TreeSetEx {

	static void  method1(){
		
		TreeSet t=new TreeSet();
		
		t.add("20");
		t.add(10);
		t.add("30");
		Iterator itr=t.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+"  ");
		}
		
	}
	public static void main(String args[]){
		
		method1();
	}
}
