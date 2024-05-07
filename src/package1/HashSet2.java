package package1;
import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(7);
		num.add(1);
		num.add(4);
		num.add(8);
		num.add(10);
		System.out.println(num);
	    for(int i=0; i<=10; i++)
	    {
	    	if(num.contains(i))
	    	{
	    		System.out.println(i + "found in a set ");
	    	}
	    	else
	    	{
	    		
	    		System.out.println(i + " not found in a set ");
	    	}
	    	
	    	
	    }
		

	}

}
