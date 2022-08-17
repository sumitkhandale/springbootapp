package com.cybage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessController {
	
	@GetMapping("/fiturself")
	public String sayFitness(){
		return "Happiness is going to gym daily!!!";
	}
	
	@GetMapping("/back")
	
	public String sayTriceps(){
		return "The Gym is my drug and i need my fix!!!!";
	}
}
