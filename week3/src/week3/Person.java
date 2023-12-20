package week3;

public class Person implements Animal {

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("Person eats cooked food");
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("Person moves around");
	}

	@Override
	public void Hunt() {
		// TODO Auto-generated method stub
		System.out.println("Person doesn't need to hunt");
	}

	@Override
	public void Makesound() {
		// TODO Auto-generated method stub
		System.out.println("Person speaks in a language");
	}

}
