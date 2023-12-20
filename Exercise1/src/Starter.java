
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// starting point 
		
		student s;
		s=new student();
		String[]subs = {"Math","Eco","Science",};
		s.setId(5);
		s.setAvg((float)65.34);
		s.setGrade(1);
		s.setName("Rafia");
		s.setSubjects(subs);
		
		System.out.println("the id is : "+s.getId());
		System.out.println("the name is : "+s.getName());
		System.out.println("the grade is : "+s.getGrade());
		System.out.println("the average is : "+ s.getAvg());
		
		for(int i =0;i<3;i++)
		{
			System.out.println("the "+i+" subject is : "+s.getSubjects()[i]);
		}
		
	}

}
