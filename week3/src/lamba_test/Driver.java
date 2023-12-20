package lamba_test;

public class Driver {

	class manager implements Person_Test {
		public void speak() {
			System.out.println("This is the manager speaking");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e = new employee();
Trainee t = new Trainee ();
manager m = new Driver().new manager();

e.speak();
t.speak();
m.speak();

//functional class
Person_Test Director = new Person_Test() {  // create anonymous class
	public void speak() {
		System.out.println("This is the director speaking");
	}
};
Director.speak();
//lambda expression
Person_Test Rafia =()->
{
	System.out.println("This is Rafia speaking");
System.out.println("Hello good morning");
	};
Rafia.speak();

	}
}
