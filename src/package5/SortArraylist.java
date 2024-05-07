package package5;
import java.util.*;
public class SortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> vehicle = new ArrayList<String>();
        vehicle.add("Baleno");
        vehicle.add("Swift");
        vehicle.add("Alto");
        vehicle.add("Nexon");
        vehicle.add("I-twenty");
        Collections.sort(vehicle, Collections.reverseOrder());
        for(String i:vehicle)
        {
        	System.out.println(i);
        }
        
        
	}

}
