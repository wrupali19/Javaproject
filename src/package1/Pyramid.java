package package1;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1 ; i<=5 ; i++ )
       {
    	   for(int s=1 ; s<=5-i ; s++)
    	   {
    		   System.out.println(" ");
    	   }
    	   for(int j=1 ; j<=i*2-1 ; j++)
    	   {
    		   System.out.println("*");
    	   }
    	   System.out.println();
       }
	}

}
