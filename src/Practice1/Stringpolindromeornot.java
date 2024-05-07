package Practice1;
import java.util.*;
public class Stringpolindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any String");
         String str =  sc.nextLine();
         int strlength = str.length();
         String revstr="";
         for(int i=(strlength-1); i>=0; i--) {
        	 revstr= revstr +str.charAt(i);
         }
         
         if(revstr.equalsIgnoreCase(str))
         {
        	System.out.println("String is polindrome");
         }
         else
         {
        	 System.out.println("String is not polindrome");
         }
         
       
	}

}
