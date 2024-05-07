package Practice1;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] cars = {"Baleno", "Swift", "Alto","Nexon"};
       int length = cars.length;
       Arrays.sort(cars, Collections.reverseOrder());
       for(int i=0; i<length; i++)
       {
    	   System.out.println(cars[i]);
       }
	}

}
