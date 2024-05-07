package package1;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Rupali";
         String toup = s.toUpperCase();//converting string into uppercase
         System.out.println(toup);
         String tolow = s.toLowerCase();//converting string into lowercase
         System.out.println(tolow);
         System.out.println(s.trim());//the String class trim() method eliminates white spaces before and after the String.
         System.out.println(s.startsWith("Rp"));//startwith()  index use
         System.out.println(s.endsWith("i"));//endwith index use
         System.out.println(s.charAt(0));//The String class charAt() method returns a character at specified index.
         System.out.println(s.length());// length of string
         int a=10;
         String s1= String.valueOf(a);//will give value of int, string,doublr......
         System.out.println(s1);
         String s2="Java is a programming language. Java is a platform. Java is an Island.";      
         String replaceString=s2.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
         System.out.println(replaceString);  
	}
}
