package week3;

public class Cow implements Animal {

	//static name within the class
	//final static cannot be changed
	@Override
	public void Eat() {
		
	System.out.println("Cow eats grass");
		}

	@Override
	public void Move() {
		
			// TODO Auto-generated method stub
			System.out.println("Cow walk slowly");
		
	}

	@Override
	public void Hunt() {
	
			// TODO Auto-generated method stub
			System.out.println("Cow does not hunt");
	
	}

	@Override
	public void Makesound() {
	
			// TODO Auto-generated method stub
			System.out.println("Cow makes the moo sound");
		
	}



}
