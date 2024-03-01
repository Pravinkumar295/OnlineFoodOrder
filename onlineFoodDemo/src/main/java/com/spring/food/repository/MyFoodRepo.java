package com.spring.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.food.entity.MyFoods;

public interface MyFoodRepo extends JpaRepository<MyFoods, Integer>{
	
}
