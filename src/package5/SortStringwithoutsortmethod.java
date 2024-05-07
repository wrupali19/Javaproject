package package5;

public class SortStringwithoutsortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String orignalString ="my name is rupali";
       String sortedString ="";
       
       //converting string into character array
       char tempstring[]= orignalString.toCharArray();
       int length = tempstring.length;
       for(int i=0; i<length; i++)
       {
    	   for(int j=i+1; j<length; j++)
    	   {
    		   if(tempstring[i]>tempstring[j])
    		   {
    		   char temp = tempstring[i];
    		   tempstring[i]=tempstring[j];
    		   tempstring[j]=temp;
    	   }
       }
       
	}
	//stroring sorted character array back to string
	sortedString = new String(tempstring);
	System.out.println("orignal String is:"+ orignalString );
	System.out.println("sorted String is:"+ sortedString );
	

}
}
