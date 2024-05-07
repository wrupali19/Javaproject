package package4;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str ="bhalshankar";
        char[] array= str.toCharArray();
        Arrays.sort(array);
        for(char s :array)
        {
        	System.out.print(s);
        }
	}

}
