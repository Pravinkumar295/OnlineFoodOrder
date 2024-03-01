package com.spring.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.food.entity.AddFood;

public interface FoodRepo extends JpaRepository<AddFood, Integer> {

}
