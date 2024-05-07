package package6;

public class sortArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] number = {39,10, 45,12};
       System.out.println("Array element after sorting");
       for(int i=0; i<number.length; i++)
       {
    	   for(int j=i+1; j<number.length; j++)
    	   {
    		   int temp=0;
    		   if(number[i]>number[j])
    		   {
    			   temp= number[i];
    			   number[i]=number[j];
    			   number[j]=temp;
    		   }
    	   }
    	   System.out.println(number[i]);
       }
	}

}
