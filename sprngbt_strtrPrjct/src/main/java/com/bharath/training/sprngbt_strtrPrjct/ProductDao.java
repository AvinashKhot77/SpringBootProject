package com.bharath.training.sprngbt_strtrPrjct;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	private int id;
	private String Name;
	
	public ProductDao(int id, String name) {
		super();
		System.out.println("productdao created");
		this.id = id;
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "ProductDao [id=" + id + ", Name=" + Name + "]";
	}
	
	

}
