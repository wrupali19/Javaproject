package package7;

public class newsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Baleno", "Alto", "Swift", "Nexon"};
        System.out.println("Array after sorting");
        int arraylength= cars.length;
        for(int i=0; i<arraylength; i++)
        {
            for(int j=i+1; j<arraylength; j++)
            {
                if(cars[i].compareTo(cars[j])>0)
                {
                 String temp = cars[i];
                    cars[i]=cars[j];
                    cars[j]=temp;
                }
            }
            System.out.println(cars[i]);
        }
        
        
    }
	}


