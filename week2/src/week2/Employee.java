package week2;

public class Employee extends Person {
int ID;
double Salary;
double Working_hours;
	public Employee(String name, int age, String nationality, String dOB, int id, double salary,double working_hours) {
		super(name, age, nationality, dOB);
		
		ID=id;
		Salary=salary;
		Working_hours=working_hours;
		
	}
	public void salary() {
		System.out.println(Name+" has a salary of : "+Salary);
	}
	
	public void wh() {
		System.out.println(Name+" has to work for  : "+Working_hours);
	}
	public void id() {
		System.out.println(Name+" with ID number  : "+ID+" is working for "+Working_hours+" hours.");
	}
	

}
