package package2;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "rupali";
         
       
         char[] s=str.toCharArray();
         Arrays.sort(s);
         for(char i: s)
         {
        	 System.out.println(i);
         }
	}

}
