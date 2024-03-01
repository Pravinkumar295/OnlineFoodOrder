package com.spring.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyFoods {
	
	@Id
	private int id;
	private String hotelName;
	private String foodName;
	private String price;
	public MyFoods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyFoods(int id, String hotelName, String foodName, String price) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.foodName = foodName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
