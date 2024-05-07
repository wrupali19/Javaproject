package mypracticeprograming;

import java.util.Scanner;

public class newprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Enter any number");
        int num = sc.nextInt();
        
        if(num%1==0 && num%2!=0)
        {
        	System.out.println("numver is prime");
        }
        else
        {
        	System.out.println("numver is  not prime");
        }
        
	}

}
