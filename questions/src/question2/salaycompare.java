package question2;

import java.util.Comparator;

public class salaycompare implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		if(o1.Salary==o2.Salary) {
			return 0;
			
		}
		else if(o1.Salary>o2.Salary) {
			return 1;
			
		}else {
			return 1;
		}
	}
	
	
	

}
