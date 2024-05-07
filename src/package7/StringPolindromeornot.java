package package7;
import java.util.*;
public class StringPolindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any String:");
         String str = sc.nextLine();
         String strrev="";
         int strlength = str.length();
         for(int i=(strlength-1); i>=0 ;i--)
         {
        	 strrev = strrev + str.charAt(i);
        	 
         }
         
         if(strrev.equalsIgnoreCase(str))
         {
        	 System.out.println("String is poindrome");
         }
         else
         {
        	 System.out.println("String is  not poindrome");
         }
         
         
         
	}

}
