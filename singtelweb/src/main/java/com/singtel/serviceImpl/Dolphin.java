package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.ICanSwim;

public class Dolphin implements Animal, ICanSwim {

	CanSwimImpl printSwim;
	@Override
	public void swim() {
		printSwim.swim();
	}
}
