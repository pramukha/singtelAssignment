package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.IMakeSound;

public class Cat implements Animal, IMakeSound{

	@Override
	public void sound() {
		System.out.println("Meow");
	}

}
