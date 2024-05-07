package package9;

public class ThrowKeyword {
  
	public static void put() throws Exception
	{
		int[] numbers = {23,56,78,10};
	     System.out.println("hello world");
	     System.out.println(numbers[10]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			put();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
