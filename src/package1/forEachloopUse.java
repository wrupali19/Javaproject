package package1;

import java.util.ArrayList;

public class forEachloopUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> country = new ArrayList<String>();
        country.add("Nagpur");
        country.add("Amerawati");
        country.add("Pune");
        country.add("Satara");
        System.out.println(country);
        for(String i : country)
        {
        	System.out.println(i);
        	if(i.equalsIgnoreCase("Satara"))
        		System.out.println(i.concat("tyjhgff"));
        	
        		
        	
        }
	}

}
