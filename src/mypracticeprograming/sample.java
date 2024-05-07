package mypracticeprograming;

public class sample {
	
	public static int sum(int k)
	{
		if(k>0)
		{
			return k+sum(k-1);
			
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("my name is  Rupali");
       char myvar1 = 65, myvar2 = 66, myvar3 = 67;
       System.out.println(myvar1);
       System.out.println(myvar2);
       System.out.println(myvar3);
       int result = sum(10);
       System.out.println(result);
       
  
	}

}
