package com.eif.data;



public class Student {
String Name ;
//@Id //to make it primary key
int Id;
String city;
String country;
String major;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public Student(String name, int id, String city, String country, String major) {
	super();
	Name = name;
	Id = id;
	this.city = city;
	this.country = country;
	this.major = major;
}


}
