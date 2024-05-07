package package6;
import java.util.*;
public class StringArraylistSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> car = new ArrayList<String>();
    car.add("Baleno");
    car.add("Nexon");
    car.add("Swift");
    car.add("Alto");
    System.out.println(car);
    Collections.sort(car, Collections.reverseOrder());
    Iterator<String> itr = car.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
	}

}
