package com.spring.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.food.entity.AddFood;
import com.spring.food.repository.FoodRepo;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepo foodRepo;
	
	public void save (AddFood food) {
		foodRepo.save(food);
	}
	
	public List<AddFood> getAllFoods() {
		return foodRepo.findAll();
	}
	
	public AddFood getFoodById(int id) {
		return foodRepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		foodRepo.deleteById(id);
	}
}
