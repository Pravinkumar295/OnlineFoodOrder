package com.spring.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.food.service.MyFoodService;

@Service
public class MyFoodController {
	
	@Autowired
	MyFoodService myFoodService;
	
}
