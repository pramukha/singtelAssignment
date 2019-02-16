package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.ICanWalk;

public class Frog implements Animal, ICanWalk{

	@Override
	public void walk() {
		System.out.println("I can walk");
	}
}
