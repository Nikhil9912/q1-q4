package question2;

public class employee implements Comparable<employee>{
	Double age;
	Double Salary;
	String Name;
	
	public employee(String Name,Double i,Double Salary) {
		this.Name=Name;
		this.age=i;
		this.Salary=Salary;
		
	
		
		
	}
	@Override
	public int compareTo(employee o) {
		// TODO Auto-generated method stub
		return Name.compareTo(o.Name);
	}
	
}
