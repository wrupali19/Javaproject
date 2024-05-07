package package9;
import java.util.*;
public class ArraylistForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> cars = new ArrayList<String>();
       cars.add("Baleno");
        cars.add("alto");
        cars.add("Nexon");
        cars.add("Swift");
        cars.add("I20");
        cars.add("I10");
        System.out.println(cars);
        
        //use of iterator
       // Iterator<String> itr = cars.iterator();
       // while(itr.hasNext())
       // {
        	//System.out.println(itr.next());
       // }
        
        //use of loop
        for(int i=0; i<cars.size(); i++)
        {
        	if(cars.contains("Nexon"))
        	{
        		System.out.println(cars.get(i).toUpperCase());
        	}
        	else
        	{
        		System.out.println(cars.get(i).toLowerCase());
        	}
        }
       
        
        }
        
        		
	}


