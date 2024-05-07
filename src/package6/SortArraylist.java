package package6;
import java.util.*;
public class SortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> number= new ArrayList<Integer>();
      number.add(12);
      number.add(90);
      number.add(45);
      number.add(30);
      System.out.println(number);
      //Collections.sort(number);
     // for(Integer s :number)
      //{
    	// System.out.println(s);
      //}
      Object[] name = number.toArray();
      Object temp=0;
      for(int i=0; i<number.size(); i++)
      {
    	  for (int j=i+1; j<number.size(); j++)
    	  {
    		  
    			  if (((Integer) name[i]).compareTo((Integer) name[j]) > 0)
    			  {
    				  temp= name[i];
       			   name[i]=name[j];
       			   name[j]=temp;
    			  }
    	  }
    	  System.out.println(name[i]);
      }
      
	}

}
