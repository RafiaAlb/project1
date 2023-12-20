package week3;

public class Car {
int make , Hp ,Mileage;
@Override
public String toString() {
	return "Car [make=" + make + ", Hp=" + Hp + ", Mileage=" + Mileage + ", model=" + model + ", company=" + company
			+ "]";
}
public int getMake() {
	return make;
}
public void setMake(int make) {
	this.make = make;
}
public int getHp() {
	return Hp;
}
public void setHp(int hp) {
	Hp = hp;
}
public int getMileage() {
	return Mileage;
}
public void setMileage(int mileage) {
	Mileage = mileage;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
String model , company;

}
