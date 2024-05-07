package package1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Geeks", nstr="";
		char ch;
		System.out.print("Orignal string :");
		System.out.println("Geeks");
		
		for(int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i);//extract each character
			nstr = ch+nstr;//add each character in front of existing strings
		}
		System.out.print("Reverse string :");
		System.out.println(nstr);
		

	}

}
