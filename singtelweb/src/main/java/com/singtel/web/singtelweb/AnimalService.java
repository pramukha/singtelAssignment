package com.singtel.web.singtelweb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.singtel.service.Animal;
import com.singtel.serviceImpl.Bird;
import com.singtel.serviceImpl.Butterfly;
import com.singtel.serviceImpl.Cat;
import com.singtel.serviceImpl.Chicken;
import com.singtel.serviceImpl.Clownfish;
import com.singtel.serviceImpl.Dog;
import com.singtel.serviceImpl.Dolphin;
import com.singtel.serviceImpl.Duck;
import com.singtel.serviceImpl.Fish;
import com.singtel.serviceImpl.Frog;
import com.singtel.serviceImpl.Parrot;
import com.singtel.serviceImpl.Rooster;
import com.singtel.serviceImpl.Shark;

@Service
public class AnimalService {
	
	
	Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
			new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
			new Cat() };

	List<Animal> animalsList = Arrays.asList(animals);
	
	
	public List<String> findAnimal(String type){
		
		switch(type) {
		case "fly":
		return animalsList.stream()
					.filter(x -> x instanceof com.singtel.service.ICanFly)
					.map(e->e.getClass().getSimpleName())
					.collect(Collectors.toList());
		case "walk":
			return animalsList.stream()
					.filter(x -> x instanceof com.singtel.service.ICanWalk)
					.map(e->e.getClass().getSimpleName())
					.collect(Collectors.toList());
		case "sing":
			return animalsList.stream()
					.filter(x -> x instanceof com.singtel.service.ICanSing)
					.map(e->e.getClass().getSimpleName())
					.collect(Collectors.toList());	
		case "swim":
			return animalsList.stream()
					.filter(x -> x instanceof com.singtel.service.ICanSwim)
					.map(e->e.getClass().getSimpleName())
					.collect(Collectors.toList());	
		default:
			return animalsList.stream()
					.map(e->e.getClass().getSimpleName())
					.collect(Collectors.toList());	
		}
	}
	
	public List<String> findAllAnimal(){
		return animalsList.stream()
				.map(e->e.getClass().getSimpleName())
				.collect(Collectors.toList());
	}

}
