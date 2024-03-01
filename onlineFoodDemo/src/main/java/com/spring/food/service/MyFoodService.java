package com.spring.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.food.entity.MyFoods;
import com.spring.food.repository.MyFoodRepo;

@Service
public class MyFoodService {
	
	@Autowired
	private MyFoodRepo myFoodRepo;
	
	public void saveMyFood(MyFoods food) {
		myFoodRepo.save(food);
	}
	public List<MyFoods> getAllMyFoods(){
		return myFoodRepo.findAll();
	}
	
	public void deleteById(int id) {
		myFoodRepo.deleteById(id);
	}
}
