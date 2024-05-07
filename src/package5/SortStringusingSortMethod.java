package package5;
import java.util.*;
public class SortStringusingSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any String");
      String s = sc.nextLine();
     char[] str=s.toCharArray();
     Arrays.sort(str);
     for(int i=0; i<str.length;i++)
     {
    	 System.out.print(str[i]);
     }
      
	}

}
