package mypracticeprograming;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
        if(num % 2==0)
        {
        	System.out.println("number is even");
        }
        else
        {
        	System.out.println("number is odd");
        }
        
	}

}
