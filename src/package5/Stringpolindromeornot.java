package package5;
import java.util.*;
public class Stringpolindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ant String");
       String s= sc.nextLine();
       int strlength= s.length();
       String strrev="";
       for(int i=(strlength-1); i>=0; i--)
       {
    	   strrev = strrev+ s.charAt(i);
       }
       if(strrev.equalsIgnoreCase(s))
       {
    	  System.out.println("String is polindrome");
       }
       else
       {
    	   System.out.println("String is  not polindrome");
       }
	}

}
