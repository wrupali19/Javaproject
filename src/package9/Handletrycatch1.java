package package9;

public class Handletrycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] numbers = {23,56,78,10};
		     System.out.println("hello world");
		     System.out.println(numbers[10]);
		}
		catch(Exception exp)
		{
			System.out.println("Something went wrong");
			System.out.println(exp.getMessage());
			//System.out.println(exp.getStackTrace());
     
	}

}
}
