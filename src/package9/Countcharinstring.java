package package9;

public class Countcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        String str= "Rupali Bhalshankar";
        for(int i=0; i<str.length(); i++)
        {
        	if(str.charAt(i)!=' ')
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
