package package1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int no = s.nextInt();
		int t1 = no;
		int lenth = 0;
		while(t1!=0)
		{
			lenth = lenth+1;
			t1 = t1/10;
			
		}// up to this we find out length of number
		int t2 = no;
		int arm=0;
		int rem;
		
		while(t2!=0)// reverse a number logic
		{
			int mul=1;
			rem = t2%10;
			for(int i=1; i<=lenth; i++)
			{
				mul = mul* rem;
			}
			arm=arm+mul;
			t2= t2/10;
			
		}
		if(arm==no)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}

}
