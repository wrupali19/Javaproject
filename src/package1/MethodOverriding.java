package package1;

class MethodOverriding1 
{
	public void draw()
	{
		System.out.println("this is draw method of parent class");
	}
	
}
public class MethodOverriding extends MethodOverriding1 {
	public void draw()
	{
		System.out.println("this is draw method of clild class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding1 obj1 = new MethodOverriding1();
		obj1.draw();
}
}

  


