package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.ICanFly;
import com.singtel.service.ICanSing;

public class Bird implements  Animal, ICanFly, ICanSing{

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
	}

}
