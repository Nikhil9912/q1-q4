package question2;

import java.util.ArrayList;
import java.util.Collections;

public class main {
	
	public static void main(String[] args) {
		ArrayList<employee> employeelist = new ArrayList<employee>();
		employee e1 = new employee("mabya",20.0,12000.0);
		employeelist.add(e1);
		employee e2 = new employee("siddhi",23.0,45000.0);
		employeelist.add(e2);
		employee e3 = new employee("himanshi",24.0,32000.0);
		employeelist.add(e3);
		
		
		for(employee e : employeelist) {
			System.out.println(e.Name);
		}
		Collections.sort(employeelist);
		System.out.println("______after sorting_______");
		
		
	
	for(employee e : employeelist) {
		System.out.println(e.Name);
	}
	}
}
