package package1;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program using Concat()
       /*String s1= "Hello";
       String s2 = " World";
       String s = s1.concat(s2);
       System.out.println(s);*/
       
       //program using Stringbufferclass
       StringBuilder s1 = new StringBuilder("Hello");    //String 1  
       StringBuilder s2 = new StringBuilder(" World");    //String 2  
       StringBuilder s = s1.append(s2);   //String 3 to store the result  
           System.out.println(s);  //Displays result  
	}

}
