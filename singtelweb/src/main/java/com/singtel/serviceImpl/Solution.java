package com.singtel.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.singtel.service.Animal;
import com.singtel.service.ICanFly;
import com.singtel.service.ICanSing;
import com.singtel.service.ICanSwim;
import com.singtel.service.ICanWalk;

public class Solution {

	public static void main(String[] args) {
//		Bird bird = new Bird();
//		bird.walk();
//		bird.fly();
//		bird.sing();

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		List<Animal> animalsList = Arrays.asList(animals);
	
//		a. how many of these animals can fly?
		System.out.println(animalsList.stream()
				.filter(x -> x instanceof com.singtel.service.ICanFly)
				.map(e->e.getClass().getSimpleName())
				.collect(Collectors.toList())+ " are flying");


//		b. how many of these animals can walk?
		System.out.println(animalsList.stream()
				.filter(x -> x instanceof com.singtel.service.ICanWalk)
				.map(e->e.getClass().getSimpleName())
				.collect(Collectors.toList()) + " are walking");
		
//		c. how many of these animals can sing?
		System.out.println(animalsList.stream()
				.filter(x -> x instanceof com.singtel.service.ICanSing)
				.map(e->e.getClass().getSimpleName())
				.collect(Collectors.toList()) + " are singing");
		
//		d. how many of these animals can swim?
		System.out.println(animalsList.stream()
				.filter(x -> x instanceof com.singtel.service.ICanSwim)
				.map(e->e.getClass().getSimpleName())
				.collect(Collectors.toList()).toString() + " are swiming");
		
	
	}

}
