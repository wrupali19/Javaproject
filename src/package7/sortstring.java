package package7;
import java.util.*;
public class sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any String:");
       String orignalstring = sc.nextLine();
       String sortedString= "";
       char[] tempstring = orignalstring.toCharArray();
       int length = orignalstring.length();
       for(int i=0; i<length; i++)
       {
    	   for(int j=i+1; j<length; j++)
    	   {
    		   if(tempstring[i]<tempstring[j])
    		   {
    			   char temp =tempstring[i];
    			   tempstring[i]= tempstring[j];
    			   tempstring[j] = temp;
    		   }
    	   }
       }
       
       sortedString= new String(tempstring);
       System.out.println("Orignal string is:"+ orignalstring);
       System.out.println("sortedString string is:"+ sortedString);
	}

}
