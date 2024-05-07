package mypracticeprograming;

import java.util.Scanner;
public class Factorialnumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Enter any number");
          Scanner sc = new Scanner(System.in);
         int num=  sc.nextInt();
         
         int fact=1;
         for(int i=1; i<=num ; i++)
         {
        	 fact = fact*i;
         }
         System.out.println(fact);
          
	}
}


