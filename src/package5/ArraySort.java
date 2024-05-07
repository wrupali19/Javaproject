package package5;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] vehicle = {"Baleno", "Alto", "Swift", "Nexon"};
        Arrays.sort(vehicle, Collections.reverseOrder());
        for(int i=0; i<vehicle.length; i++)
        {
        	System.out.println(vehicle[i]);
        }
		
	}

}
