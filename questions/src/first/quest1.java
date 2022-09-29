package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class quest1 {
	public static void main(String[] args)
	{
		ArrayList<Float> list = new ArrayList<Float>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter floating point number");
			float num = sc.nextFloat();
			list.add(num);
			
		}
		Iterator<Float> itr = list.iterator();
float sum =0f;
while(itr.hasNext()) {
	sum +=itr.next();
}
System.out.println("Sum of digit in list is : "+sum);

	}

}
