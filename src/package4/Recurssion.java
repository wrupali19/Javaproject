package package4;

public class Recurssion {

	 static int sum(int k)
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
        int a = sum(10);
        System.out.println(a);
	}

}
