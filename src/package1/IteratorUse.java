package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> animal = new ArrayList<String>();
     animal.add("Tiger");
     animal.add("Monkey");
     animal.add("Snake");
     animal.add("Lion");
     animal.add("Zebra");
     //System.out.println(animal);
     Iterator<String> itr =animal.iterator();
    while(itr.hasNext())
    {
    	String value = itr.next();
    	System.out.println(value);
    	
    	if(value.equals("Lion"))
    	{
    		itr.remove();
    	}
    }
    
    System.out.println("   ");
    for(String i : animal)
    {
    	System.out.println(i);
    }
	}

}
