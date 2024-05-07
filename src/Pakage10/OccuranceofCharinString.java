package Pakage10;
import java.util.*;
public class OccuranceofCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str= "bhalshankar";
         int strlength = str.length();
         System.out.println("orignal string is:" +str);
         HashMap<Character, Integer> hmap = new HashMap<>();
         for(int i=(strlength-1); i>=0 ;i--)
         {
        	 if(hmap.containsKey(str.charAt(i)))
        	{
        		 int count = hmap.get(str.charAt(i));
        		 hmap.put(str.charAt(i), ++count);
        	 }
        	 else
        	 {
        		 hmap.put(str.charAt(i), 1);
        	 }
        		 
         }
         System.out.println(hmap);
         
	}

}
