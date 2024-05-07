package package1;

public class Findwordinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This sentance contains find me string";
		System.out.println(str);
		// find word in String
		String find = "find me";
		boolean val = str.contains(find);
		if(val)
			System.out.println("String found: "+find);
		else 
			System.out.println("string not found");
	}

}
