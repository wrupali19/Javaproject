package package7;

import java.util.Arrays;
import java.util.Collections;

public class SortArraywithoutusingsortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] numbers = {12,56,89,90,34};
        System.out.println("Array after sorting:");
       int arrlength =  numbers.length;
       for(int i=0; i<arrlength; i++)

       {
    	   for(int j=i+1; j<arrlength; j++)
    	   {
    		   if(numbers[i]>numbers[j])
    		   {
    			   int temp = numbers[i];
    			   numbers[i]=numbers[j];
    			   numbers[j]=temp;
    		   }
    	   }
    	   System.out.println(numbers[i]);
       }
       
      
      
	}

}
