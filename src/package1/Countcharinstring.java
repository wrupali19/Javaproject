package package1;

public class Countcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string = "Hello Friends";
      int count=0;
      for(int i=0; i<string.length(); i++)
      {
    	  if(string.charAt(i)!=' ') {
    		  count++;
    	  }
      }
      System.out.println(count);
	}

}
