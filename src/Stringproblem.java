import java.io.IOException;
import java.util.Scanner;


public class Stringproblem {
	 public static String orignial(String input1)
	    {
		       
		          char[] charArr=new char[input1.length()];
		         
		         String newString= convertString(input1,charArr,1);
		        // System.out.println("==newString=="+newString);
		          return newString;
	    }
	    
	 
	 
	    public static String convertString(String original,char[] newString,int numberOfReads){
	          String returned=null;
	           char lastchar= original.charAt(original.length()-numberOfReads);
		       /*  System.out.println("==lastchar=="+lastchar);
		         System.out.println("==numberOfReads=="+numberOfReads);
		         System.out.println("==newString=="+newString);
*/
	             int inputIndex=((numberOfReads-1)/2);
		       //  System.out.println("==inputIndex=="+inputIndex);

	            if(numberOfReads == 1){
	                newString[numberOfReads-1]=lastchar;
	            }else{
	                 for(int i=(numberOfReads-1);i!=inputIndex;i--){
	    		         //System.out.println("==i=="+i);

	                      newString[i]= newString[i-1];
	                 }
	                 newString[inputIndex]=lastchar;
	            }
	            if(numberOfReads!=original.length()){
	            convertString(original,newString, ++numberOfReads);
		        // System.out.println("==newString =="+new String(newString)+"=== numberOfReads =="+numberOfReads);
	            }else{
			         //System.out.println("==newString =="+new String(newString)+"=== numberOfReads =="+numberOfReads);
	                return new String(newString);
	            }
	        return new String(newString);
	    }

	    public static void main(String[] args) throws IOException{
	       /* Scanner in = new Scanner(System.in);
	        String output;
	        String ip1 = in.nextLine().trim();
	        output = orignial(ip1);*/
	    	//String output = orignial("cbdae");
	    	String output = orignial("ghertuijn");
	        System.out.println(String.valueOf(output));
	    }

}
