package week2;

public class Person {

	String Name;
	int Age;
	String Nationality;
	String DOB;
	
	public void Eat() {
		
		System.out.println(Name+" is eating right now ");
	}
	
	public void Sleep() {
		System.out.println(Name+" is sleeping right now ");
	}
	public void walk() {
		System.out.println(Name+" is walking right now ");
	}
	

	public Person(String name, int age, String nationality, String dOB) {
		super();
		Name = name;
		Age = age;
		Nationality = nationality;
		DOB = dOB;
	}
	
	
}
