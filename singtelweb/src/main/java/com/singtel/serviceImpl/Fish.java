package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.ICanSwim;

public class Fish implements Animal,ICanSwim{

	CanSwimImpl print;
	@Override
	public void swim() {
		print.swim();
		
	}
}
