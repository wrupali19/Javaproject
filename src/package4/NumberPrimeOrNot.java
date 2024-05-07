package package4;

import java.util.Scanner;

public class NumberPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int s = sc.nextInt();
        int count=0;
        for(int i=1; i<=s; i++)
        {
        	if(s%i==0)
        	{
        		count++;
        	}
        }
        	if(count==2)
        	{
        		System.out.println("Number is prime");
        	}
        	else
        	{
        		System.out.println("Number is not prime");
        	}
        
	}

}
