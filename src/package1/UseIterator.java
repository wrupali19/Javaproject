package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class UseIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> cities = new ArrayList<>();
       cities.add("Nagpur");
       cities.add("Pune");
       cities.add("Latur");
       cities.add("Amrawati");
       cities.add("Yawatmal");
       System.out.println(cities);
       
       Iterator<String> citiesIterator = cities.iterator();
      String result= citiesIterator.next();
      
       citiesIterator.remove();
     // boolean b=citiesIterator.hasNext();
      //citiesIterator.remove();
     
       
	}

}
