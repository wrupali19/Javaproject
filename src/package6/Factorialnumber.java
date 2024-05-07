package package6;
import java.util.*;
public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int s = sc.nextInt();
        int fact=1;
        for(int i=1; i<=s; i++)
        {
        	fact = fact*i;
        }
        System.out.println(fact);
	}

}
