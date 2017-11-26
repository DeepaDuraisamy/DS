package com.example.coding;

public class RegularExpEX {
	
	    public static final String EXAMPLE_TEST = "This is my small example "
	            + "string which I'm going to " + "use for pattern matching.";

	    public static void main(String[] args) {
	        /*System.out.println(EXAMPLE_TEST.matches("\\w.*"));
	        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
	        System.out.println(splitString.length);// should be 14
	        for(String string : splitString) {
	            System.out.println(string);
	        }
	        // replace all whitespace with tabs
	        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));*/
	        
	        String inputString="1226#24#";
	    	String inputString1 = "1(2)23(3)";
	    	String[] splitString2 = (inputString.split("[123456789]*[10-26]#"));
	    	for(String string : splitString2) {
	            System.out.println(string);
	        }
	    }
	}

