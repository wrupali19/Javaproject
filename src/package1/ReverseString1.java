package package1;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "ABCD";
        String rev= " ";
        int len = str.length();
        
        for(int i=len-1;i>=0;i--)
        {
        	rev = rev+
        			str.charAt(i);
        	
        }
        
        System.out.println("Reverse string is :" + rev);
        
        
	}

}
