package Practice1;

import java.util.Arrays;

public class ArraySortwithoutsortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	
String[] cars = {"Baleno", "Swift","Nexon", "Alto"};
int length = cars.length;
for(int i=0; i<length; i++)
{
	for(int j=i+1; j<length;j++)
	{
		if(cars[i].compareTo(cars[j])>0)
		{
		String temp = cars[i];
		cars[i] = cars[j];
		cars[j]= temp;
		}
	}
	}
System.out.println(Arrays.toString(cars));
}
}
