package package9;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer, String> hmap = new HashMap<Integer, String>();
       hmap.put(01, "Rupali");
       hmap.put(02, "Dipali");
       hmap.put(03, "Raji");
       hmap.put(04, "Rakesh");
       hmap.put(05, "Riya");
      // System.out.println(hmap);
       
       System.out.println("Is the key '10' present? " + 
    		   hmap.containsKey(10));
       
       for(Map.Entry<Integer, String> e : hmap.entrySet())
       {
    	   if(e.getValue()=="Rakesh")
    	   {
    		   System.out.println(e.getValue());
    	   }
    	   else
    	   {
    	  System.out.println("Key is:" + e.getKey() + " "+ "And"  +" " +"value is:" +" "+e.getValue());
       }
    	   
       
	}

}
}
	
	
