package package1;

public class MethodOverloading {

	 public int plusmethod(int a, int b)
     {
     	return(a+b);
     }
	 public double plusmethod(double a, double b, double c)
	 {
		return(a+b+c);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MethodOverloading obj = new MethodOverloading();
		 int addint =obj.plusmethod(3, 9);
		 System.out.println(addint);
		 
		
		double adddouble =obj.plusmethod(0.5, 12.5, 1.0);
		System.out.println(adddouble);
	}
	

}
