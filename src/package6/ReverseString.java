package package6;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        String revstr = "";
        int strlength = s.length();
        for(int i=(strlength-1); i>=0; i--)
        {
        	revstr= revstr +s.charAt(i);
        }
        System.out.println(revstr);
        if(revstr.equalsIgnoreCase(s))
        {
        	System.out.println("String is polindrone");
        }
        else
        {
        	System.out.println("String is  not polindrone");
        }
	}

}
