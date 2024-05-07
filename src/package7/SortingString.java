package package7;
import java.util.*;
public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any String:");
     String str = sc.nextLine();
    char[] newstr =  str.toCharArray();
    Arrays.sort(newstr);
    for(int i=0; i<str.length(); i++)
    {
    	System.out.print(newstr[i]);
    }
	}

}
