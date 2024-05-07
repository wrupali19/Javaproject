package package5;

public class InttypeArraySortwithoutSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] number = {12,78,90,34,56,9,-45};
         System.out.println("Array After sorting");
         int length = number.length;
         for(int i=0; i<length; i++)
         {
        	for(int j=i+1 ; j<length; j++) 
        	{
        		if(number[i]>number[j])
        		{
        			int temp = number[i];
        			number[i]= number[j];
        			number[j]=temp;
        		}
        	}
        	System.out.println(number[i]);
         }
	}

}
