package package1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count=0;
		System.out.println("Enter any number");
		Scanner r = new Scanner(System.in);
		num = r.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}

	}
}


