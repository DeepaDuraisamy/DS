package com.example.coding;

import java.util.ArrayList;
import java.util.List;

public class FavNumber {
	 /*
     * Complete the function below.
     */
    static void countNumbers(int[][] arr) {
         /*arr=new int[][]{ 
             {1,20},
             {9,19}
         };*/
        int rows=arr.length;
        int start =0;
        int end=0;
        int count =0;
        for(int i=0;i<rows;i++){
            start = arr[i][0];
            end =  arr[i][1];
            for(int j=start;j<=end;j++){
                if(isFavNumber(j)){
                    count++;
                 }
            }
             System.out.println(count);
            count=0;
        }
    }

    private  static boolean isFavNumber(int number){
        int divider=1;
        int count=1;
        List<Integer> intList=new ArrayList<Integer>();
      //  Map<Integer,Integer> intMap=new HashMap<Integer,Integer>();
        while(divider!=0){
            //intMap.put(number%10,count++)
          
            if(intList.contains(number%10)){
                return false;
            }
            intList.add(number%10);
           divider=number/10;
           number=divider;
         }
      return true;
        
    }
    
    public static void main(String args[]){
    	int arr[][]=new int[][]{ 
                {1,20},
                {9,19}
            };
		countNumbers(arr);
	}
}

