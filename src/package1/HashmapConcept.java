package package1;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashmapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer, String> hm = new HashMap<Integer, String>();
       hm.put(1, "English");
       hm.put(2, "Math");
       hm.put(3, "Science");
       hm.put(4, "EDC");
       System.out.println(hm);
       
       for(Entry m : hm.entrySet())
       {
    	   System.out.println(m.getKey() +" "+ m.getValue());
       }
       
       System.out.println(hm);
       hm.remove(2);
       System.out.println(hm);
       
       HashMap<Integer, Employee> emp =  new HashMap<Integer, Employee>();
       Employee e1 = new Employee(1, "Rupali", "IT");
       Employee e2 = new Employee(2, "Dipali", "CM");
       Employee e3 = new Employee(3, "Amrpali", "EXTC");
       
       emp.put(1, e1);
       emp.put(2, e2);
       emp.put(3, e3);
       
       for(Entry<Integer, Employee> m :emp.entrySet())
       {
    	  int key =  m.getKey();
    	  System.out.println(key + "  "+ "info:");
    	  Employee e =m.getValue();
    	  System.out.println(e.age +" " + e.name +" " +e.dept);
       }
       
	}

}
