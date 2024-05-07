package package7;
import java.util.*;
public class SortStringwithoutsortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any String:");
         String orignalstring =sc.nextLine();
         String sortedstring = "";
        char[] tempstring = orignalstring.toCharArray();
         int strlength = orignalstring.length();
         for(int i=0; i<strlength; i++)
         {
        	 for(int j=i+1; j<strlength; j++)
        	 {
        		 if(tempstring[i]>tempstring[j])
        		 {
        		 char temp = tempstring[i];
        		 tempstring[i] = tempstring[j];
        		 tempstring[j] = temp;
        		 }
        	 }
         }
         
         sortedstring = new String(tempstring);
         System.out.println("Orignal String is:" +orignalstring);
         System.out.println("sortedstring String is:" + sortedstring);
         
	}

}
