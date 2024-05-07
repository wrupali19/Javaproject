package package2;

public class Addseriesofnum {

	public static int sum(int k)
	{
		if(k>0) {
		return k +sum(k-1);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int seriesofsum=  sum(20);
      System.out.println(seriesofsum);
	}

}
