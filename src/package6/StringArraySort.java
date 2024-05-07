package package6;

import java.util.Arrays;
import java.util.Collections;

public class StringArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] car = {"Baleno", "Nexon", "Alto", "Swift"};
       Arrays.sort(car, Collections.reverseOrder());
       for(String s :car)
       {
    	   System.out.println(s);
       }
	}

}
