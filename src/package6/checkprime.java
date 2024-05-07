package package6;
import java.util.*;
public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
       int s =  sc.nextInt();
      int  count=0;
       for(int i=1; i<=s; i++)
       {
    	   if(s%i==0)
    	   {
    		   count++;
    	   }
       }
       if(count==2)
       {
    	   System.out.println("number is prime");
       }
       else
       {
    	   System.out.println("number is  not prime");
       }
        
	}

}
