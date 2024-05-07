package package1;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> car = new HashSet<String>();
		car.add("Baleno");
		car.add("Swift");
		car.add("Baleno");
		car.add("XUV");
		car.add("Alto");
	     System.out.println(car.size());
		
		//Iterator<String> it =car.iterator();
		//while(it.hasNext())
		//{
			//String data = it.next();
			//System.out.println(data);
		//}
	     
	     for(String i : car)
	     {
	    	 if(i.contains("Baleno"))
	    	 {
	    		 System.out.println(i +"is exist");
	    	 }
	    	// System.out.println(i);
	    	//String c = i.toUpperCase();
	    	//
	    	// System.out.println(c);
	     }
		

	}

}
