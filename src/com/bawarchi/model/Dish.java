package com.bawarchi.model;

public class Dish implements Comparable<Dish>{

	private int dishId;
	private String name;
	private double price;
	private double calories;
	
	
	public Dish(int dishId, String name, double price, double calories) {
		// TODO Auto-generated constructor stub
		this.dishId = dishId;
		this.name = name;
		this.price = price;
		this.calories = calories;
	}


	public int getDishId() {
		return dishId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}




	public double getCalories() {
		return calories;
	}




	public void setCalories(double calories) {
		this.calories = calories;
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.hashCode();
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.name+this.calories);
	}




	@Override
	public int compareTo(Dish o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.dishId).compareTo(o.dishId);
	}
	
	
	
}
