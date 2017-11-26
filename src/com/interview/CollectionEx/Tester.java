package com.interview.CollectionEx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

interface Car{
	
}

class BMW implements Car{
	
}
class hundai implements Car{
	
}
public class Tester {
	public static void main(String args[]){
		    List a = new ArrayList<Car>();
			a.add(new BMW());
			a.add(new hundai());
			a.add(new Integer(9));
			
			System.out.print(a.size());
		}
}
