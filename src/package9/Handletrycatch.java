package package9;

public class Handletrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
        System.out.println("my name is rupali");
        int i=10/0;
        System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block");	
			System.out.println("Message is: "+e.getMessage());
			System.out.println("Cause is: "+e.getCause());
			
		}
		finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		 
		
     
	}

}
