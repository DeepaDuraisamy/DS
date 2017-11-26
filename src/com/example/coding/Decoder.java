package com.example.coding;

import java.util.HashMap;
import java.util.Map;

public class Decoder {
    /*
     * Complete the function below.
     */
    static int[] frequency(String inputString) {
        int[] output=new int[26];
        char c=0;
        int numberOfOcc=0;
        int k=inputString.length()-1;
        int i=k;
        for(i=k;i>=0;i--){
				c = inputString.charAt(i);
				if(c == ')'){
					c=inputString.charAt(--i);
					numberOfOcc  = Integer.parseInt(String.valueOf(c));
					--i;
					c=inputString.charAt(--i);
				        if(c=='#'){
							if(numberOfOcc!=0){
					 		output[(Integer.parseInt(inputString.substring((i-2),i)))-1]=numberOfOcc+output[(Integer.parseInt(inputString.substring((i-2),i)))-1];
					       }else{
					    	 output[(Integer.parseInt(String.valueOf(c)))-1]=numberOfOcc+ output[(Integer.parseInt(String.valueOf(c)))-1];
						   }
							 i=i-2;
				        }else{
							 output[(Integer.parseInt(String.valueOf(c)))-1]=numberOfOcc+ output[(Integer.parseInt(String.valueOf(c)))-1];	
				        }
				}else if(c=='#'){
				        output[(Integer.parseInt(inputString.substring((i-2),i)))-1]=1+  output[(Integer.parseInt(inputString.substring((i-2),i)))-1];	
				        i=i-2;
				}else{
					 output[(Integer.parseInt(String.valueOf(c)))-1]=1+output[(Integer.parseInt(String.valueOf(c)))-1];	
				}
        }
        for(int l:output){
        	System.out.print(l+" ");
        }
        return output;
    }
    public static void main(String args[]){
    	String inputString="1226#24#";
    	//String inputString = "1(2)23(3)";
    	//String inputString = "2110#(2)";
    	//String inputString = "23#(2)24#25#26#23#(3)";
    /*	char c = 'a';
    	char c1= 'a'+1;*/
    	frequency(inputString);
    	//System.out.println(String.valueOf(c1));
		//System.out.println();
	}
}
