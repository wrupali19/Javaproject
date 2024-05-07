package package6;

public class CountCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Hello Friends";
        int count=0;
        for(int i=1; i<str.length(); i++)
        {
        	if(str.charAt(i)!=' ')
        	{
        		count++;
        	}
        	
        }
        System.out.println(count);
	}

}
