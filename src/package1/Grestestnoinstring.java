package package1;

public class Grestestnoinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10,45,23,90};
	       int max= arr[0];
	       for(int i =0; i<arr.length; i++)
	       {
	           if(arr[i]>max)
	           max=arr[i];
	       }

	       System.out.println(" Largest number in the arrays is: "+ max);
	}

}
