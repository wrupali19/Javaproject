package package4;

public class CountCharINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Hello friend i am rupali";
        int strlength = str.length();
        System.out.println(strlength);
        int count=0;
        for(int i=0; i<strlength; i++)
        {
        	if(str.charAt(i)!= ' ') 
        	{
        		count++;
        	}
        	
        }
        System.out.println(count);
	}

}
