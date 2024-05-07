package package1;

import package1.InteritanceVehicle;

public class InheritanceCar extends InteritanceVehicle{
	public String otherbrand= "Baleno";
	
	
	public void honk()
	{
		System.out.println("tuut tuut!!! cars..........!");
	}
	
	
	public static void main(String[] args)
	{
		InteritanceVehicle cr = new InheritanceCar();
		//InheritanceCar vl = new InheritanceCar();
		//vl.honk();
	cr.honk();
		
		
		//System.out.println(cr.otherbrand);
		//System.out.println(cr.brand);
		//cr.honk();
		
	}

}
