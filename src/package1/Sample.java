package package1;



public class Sample

{
	public int addition(int a, int b,int c)
	{
		int result=a+b+c;
		return result;
	}
	
	//creating a method with return type
	public int multiplication(int a,int b, int c)
	{
		int result=a*b*c;
		return result;
		
	}
	
	//creating method without return type
	public void addi()
	{
		int a = 10;
		int b = 30;
		int add1=a+b;
		System.out.println(add1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=40;
		int sum = a+b;
		System.out.println(sum);
		
		for(int i=1;i<10;i++)
		{
			System.out.println("rupali");
			System.out.println(i);
		}
		
		
		
		//creating object of class
		Sample mn = new Sample();
		int add=mn.addition(2, 2, 2);
		System.out.println(add);
		mn.addi();
		
	}

	}


