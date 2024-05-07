package package1;

import java.util.Scanner;

public class Polindromnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int num;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int org_num = num;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(org_num==rev)
		{
			System.out.println("number is polyndrom");
			
		}
		else
		{
			System.out.println("number is not polyndrom");
		}
		
	}

}
