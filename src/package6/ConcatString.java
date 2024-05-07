package package6;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String str1 = "Rupali";
       // String str2 = "Bhalshankar";
       // System.out.println(str1.concat(str2));
        
        
        
        
       // By using StringBuffer class
        StringBuffer str1 =  new StringBuffer("Rupali");
        StringBuffer str2 =  new StringBuffer("Bhalshankar");
        System.out.println(str1.append(str2));
        
	

	}
}
