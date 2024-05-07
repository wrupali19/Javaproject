package package4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "rupali", strrev=" ";
        int strlength= str.length();
        for(int i=(strlength-1); i>=0 ; i--)
        {
        	strrev= strrev+(str.charAt(i));
        }
        System.out.println(strrev);
	}

}
