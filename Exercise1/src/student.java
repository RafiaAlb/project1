
public class student {

	//some state and behavior
	
	int Id ;
	int Grade;
	float avg;
	String name;
String [] subjects;


//Parameterized constructor
public student(int id, int grade, float avg, String name, String[] subjects) {
	super();
	Id = id;
	Grade = grade;
	this.avg = avg;
	this.name = name;
	this.subjects = subjects;
}

//empty (Default) constructor

public student() {
	
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getGrade() {
	return Grade;
}
public void setGrade(int grade) {
	Grade = grade;
}
public float getAvg() {
	return avg;
}
public void setAvg(float avg) {
	this.avg = avg;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String[] getSubjects() {
	return subjects;
}
public void setSubjects(String[] subjects) {
	this.subjects = subjects;
}


}
