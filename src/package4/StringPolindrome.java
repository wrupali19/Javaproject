package package4;

public class StringPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "radar", strrev="";
        int strlength= str.length();
        for(int i=(strlength-1); i>=0 ; i--)
        {
        	strrev= strrev+(str.charAt(i));
        }
        if(strrev.equals(str))
        {
        	System.out.println("String is polindrome");
        }
        else
        {
        	System.out.println("String is not polindrome");
        }
	}
	

}
