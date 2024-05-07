package package7;
import java.util.*;
public class CountCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any String");
       String str = sc.nextLine();
       int count = 0;
       for(int i=0; i<str.length(); i++)
       {
    	   if(str.charAt(i)!=' ')
    	   {
    		   count++;
    	   }
    	  
    	   
       }
       System.out.println(count);
       
       
	}

}
