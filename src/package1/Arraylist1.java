package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="radar", strrev="";
    int strlength = str.length();
    System.out.println(strlength);
    for(int i=(strlength-1); i>=0; i--)
    {
    	strrev = strrev +str.charAt(i);
    	System.out.println(strrev);
    }
    if(str.equals(strrev))
    {
    	System.out.println("String is polindrome");
    }
    else
    {
    	System.out.println("String is not polindrome");
    }
    
    
    
	}

}
