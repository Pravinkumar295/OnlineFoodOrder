package com.spring.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "add-food")
public class AddFood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int food_id;
	
	private String foodName;
	
	private String HotelName;
	
	private String price;

	public AddFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddFood(int food_id, String foodName, String hotelName, String price) {
		super();
		this.food_id = food_id;
		this.foodName = foodName;
		HotelName = hotelName;
		this.price = price;
	}

	public int getFood_id() {
		return food_id;
	}

	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
