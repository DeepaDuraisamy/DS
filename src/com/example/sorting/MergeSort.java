package com.example.sorting;

public class MergeSort {

	
    public int[] sort(int[] array,int left,int right){
		   System.out.println("left"+left);
		   System.out.println("right"+right);
	   int middle=(left+right)/2;
	   System.out.println("middle"+middle);
	  /* System.out.println("middle"+(middle+1)); 
	   
	     sort(array,(middle+1),right);*/
     /*  for(int i=left;i<=right;i++){
	       System.out.println(array[i]);
	}*/


	   if((right-left)>1){
	     sort(array,left,middle);
	      /* System.out.println("After Left sort");

	       for(int i=left;i<=right;i++){
		       System.out.println(array[i]);
		  }*/

	   	 sort(array,(middle+1),right);
	       /*System.out.println("After right sort");

	       for(int i=left;i<=right;i++){
		       System.out.println(array[i]);
		  }*/

	    compare(array,left,middle,right);
	      /* System.out.println("After compare");

	    for(int i=left;i<=right;i++){
		       System.out.println(array[i]);
		  }*/
	   }else{
	     swap(array,left,right);
	      /* System.out.println("After swap");
	       for(int i=left;i<=right;i++){
		       System.out.println(array[i]);
		  }*/
       }
       return array;
	}

	private int[] compare(int[] array, int left, int middle,int right) {
		// TODO Auto-generated method stub
		// TODO remove more variables
		int newArray[]=new int[array.length];
		int pointer1=left;
		int pointer2=middle+1;
		int count=right-left;
		int incrementor=0;
		int newArrayindex=left;
		//for(int i=left;i<right;i++){
		while(incrementor<count){
			if(array[pointer1]>array[pointer2]){
			  newArray[newArrayindex++]=array[pointer2]; 
			  if(pointer2==right){
				     for(int i=pointer1;i<=middle;i++){
					//	System.out.println("---array[i]-"+array[i]);
						  newArray[newArrayindex++]=array[i];
					  }
				 /* newArrayindex = copyArray(array, middle, newArray, pointer1,
						newArrayindex);
				  */
					/*for(int i=left;i<=right;i++){
						System.out.println("==newArrayindex=="+newArray[i]);
					}
*/
				  break;
			  }
			    pointer2++;
			}else{
				  newArray[newArrayindex++]=array[pointer1];
				  if(pointer1==middle){
					  for(int i=pointer2;i<=right;i++){
						  newArray[newArrayindex++]=array[i];
					  }
					  break;
				  }
				    pointer1++;
			}
			
			  incrementor++;
		}
		for(int i=left;i<=right;i++){
			array[i]=newArray[i];
		}
		return array;
	}

	/*private int copyArray(int[] array, int middle, int[] newArray,
			int pointer1, int newArrayindex) {
		for(int i=pointer1;i<=middle;i++){
			System.out.println("---array[i]-"+array[i]);
			  newArray[newArrayindex++]=array[i];
		  }
		return newArrayindex;
	}*/
    
    public int[] swap(int[] array,int left,int right){
    	if(array[left]>array[right]){
    	  int temp=array[left];
    	  array[left]=array[right];
    	  array[right]=temp;
    	}
    	return array;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mergerSort=new MergeSort();
        //int[] array={1,5,9,2,3,6,10,7};
		int[] array={11,10,9,8,7,55,6,5,12,4,3,2,1};
       int[] array1=mergerSort.sort(array,0,(array.length-1));
       for(int i=0;i<array1.length;i++){
		       System.out.println(array[i]);

		}
	}

}
