package package9;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number=7;
        String str="";
        switch(number)
        {
        case 1: str="monday";
        	System.out.println("This is Monday");
        	 break;
        case 2: str="Tuesday";
            System.out.println("This is Tuesday");
              break;
        case 3: str="Wednesday";
        	System.out.println("This is Wednesday");
             break;
        case 4: str="Thursday";
        	System.out.println("This is Thursday");
            break;
        case 5: str="Friday";
        	System.out.println("This is Friday");
        	 break;
        case 6: str="Saturday";
        	System.out.println("This is Saturday");
          break;
        case 8: str="sunday";
        	System.out.println("This is Sunday");
        	 break;
        default: System.out.println("day is not found in a list");
        }
        System.out.println(str);
	}

}
