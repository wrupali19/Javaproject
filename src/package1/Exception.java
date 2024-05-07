package package1;
import java.io.*; 
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=20, b=10;
       int c;
       
       try
       {
    	   c=a/0;
    	   System.out.println(c);      
       }
       catch(ArithmeticException e)
       {
    	   System.out.println(" failed to divide:"); 
    	   System.out.println(e);
       }
       
       System.out.println("End of program");      
	}

}
