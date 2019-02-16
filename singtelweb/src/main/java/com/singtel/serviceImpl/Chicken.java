package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.IMakeSound;

public class Chicken implements Animal, IMakeSound {

	@Override
	public void sound() {
		System.out.println("Cluck, cluck");
	}
}
