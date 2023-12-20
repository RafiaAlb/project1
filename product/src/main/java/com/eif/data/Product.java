package com.eif.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product {
@Id
int id;
String name;
int Quantity;

public Product() {
	
}
	public Product(int id, String name, int quantity) {
	super();
	this.id = id;
	this.name = name;
	Quantity = quantity;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}



}
