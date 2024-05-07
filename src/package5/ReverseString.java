package package5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter any String");
	       String s= sc.nextLine();
	       int strlength= s.length();
	       String strrev="";
	       for(int i=(strlength-1); i>=0; i--)
	       {
	    	   strrev = strrev+ s.charAt(i);
	       }
	       System.out.println(strrev);
	}

}
