package com.spring.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.food.entity.AddFood;
import com.spring.food.entity.MyFoods;
import com.spring.food.service.FoodService;
import com.spring.food.service.MyFoodService;

@Controller
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@Autowired
	MyFoodService myFoodService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home")
	public String homes() {
		return "home";
	}

	/*
	 * @GetMapping("/foodList") public String foodList() { return "foodList"; }
	 */
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@GetMapping("/addFoods")
	public String addFoods() {
		return "addFoods";
	}
	
	@PostMapping("/save")
	public String save(AddFood a) {
		foodService.save(a);
		return "redirect:/available-foods";
	}
	
	@GetMapping("/available-foods")
	public ModelAndView getAllFoods() {
		List<AddFood> list = foodService.getAllFoods();
		
		return new ModelAndView("foodList","food",list);
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id")int id) {
		AddFood f = foodService.getFoodById(id);
		MyFoods mf = new MyFoods(f.getFood_id(),f.getHotelName(),f.getFoodName(),f.getPrice());
		myFoodService.saveMyFood(mf);
		return "redirect:/my-foods";
	}
	
	@GetMapping("/my-foods")
	public String getMyFoods(Model model) {
		
		List<MyFoods> list = myFoodService.getAllMyFoods();
		model.addAttribute("food", list);
		return "my-foods";
	}
	
	@RequestMapping("/editFood/{id}")
	public String editMyFood(@PathVariable("id")int id, Model model) {
		AddFood f = foodService.getFoodById(id);
		model.addAttribute("food", f);
		return "foodEdit";
	}
	
	@RequestMapping("/deleteFood/{id}")
	public String deleteMyFood(@PathVariable("id")int id ,Model model) {
		foodService.deleteById(id);
		return "redirect:/available-foods";
	}
	@RequestMapping("/deleteFoods/{id}")
	public String deleteMyFoods(@PathVariable("id")int id ,Model model) {
		myFoodService.deleteById(id);
		return "redirect:/my-foods";
	}
}
