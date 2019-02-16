package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.ICanFly;

public class Butterfly implements Animal, ICanFly{

	@Override
	public void fly() {
		System.out.println("I can fly");
	}
}
