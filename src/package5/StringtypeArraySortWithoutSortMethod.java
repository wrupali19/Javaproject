package package5;

import java.util.Arrays;

public class StringtypeArraySortWithoutSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] vehicle = {"Baleno", "Swift", "Alto", "Nexon"};
        
        int length = vehicle.length;
        for(int i=0; i<length; i++)
        {
        	for (int j=i+1; j<length;j++)
        	{
        		if(vehicle[i].compareTo(vehicle[j])>0)
        			
        		{     
        			 String  temp=vehicle[i];
        			 vehicle[i]=vehicle[j];
        			 vehicle[j]= temp;
        			 
        		}
        	}
        }
      //prints the sorted string array in ascending order 
        System.out.println(Arrays.toString(vehicle));  
	}

}
