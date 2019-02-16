package com.singtel.web.singtelweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingtelController {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping("/animal/{type}")
	public List<String> findAnimals(@PathVariable String type){
		return animalService.findAnimal(type);
	}

	@GetMapping("/animals")
	public List<String> findAllAnimals(){
		return animalService.findAllAnimal();
	}
}
