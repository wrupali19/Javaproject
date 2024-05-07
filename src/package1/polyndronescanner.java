package package1;
import java.util.Scanner;

public class polyndronescanner {

	public static void main(String[] args) {
		 String str, revstr="";
	        Scanner sc = new Scanner(System.in);
	         System.out.println("Enter any String");
	         str = sc.nextLine();
	         int strlength = str.length();
	         for(int i=strlength-1; i>=0; i--)
	         {
	             revstr =revstr + str.charAt(i);
	         }
	         if(revstr.equals(str))
	         {
	              System.out.println("String is polyndrone");
	         }
	         else
	         {
	             System.out.println("String is not polyndrone");
	         }

	}

}
