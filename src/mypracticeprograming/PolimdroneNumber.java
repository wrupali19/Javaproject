package mypracticeprograming;

import java.util.Scanner;
public class PolimdroneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org_num= num;
        int rev=0;
        while(num!=0)
        {
        	rev= rev*10 + num%10;
        	num = num/10;
        }
        if(org_num==rev)
        {
        	System.out.println("Number is polindrone");
        }
        else
        {
        	System.out.println("Number is not polimdrone");
        }
        
        
      
        
	}

}
