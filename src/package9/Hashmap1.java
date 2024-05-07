package package9;
import java.util.*;
public class Hashmap1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(01, "Rupali");
        hmap.put(02, "Dipali");
        hmap.put(03, "Minal");
        hmap.put(04, "Raji");
        hmap.put(05, "Riya");
        System.out.println(hmap);
       if(hmap.containsValue("Minal"))
       {
    	   hmap.put(06, "Dia");
    	   System.out.println(hmap);
       }
        
	}

}
