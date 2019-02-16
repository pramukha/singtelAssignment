package com.singtel.serviceImpl;

import com.singtel.service.ICanSwim;
import com.singtel.service.IMakeSound;

public class Duck extends Bird implements ICanSwim, IMakeSound{

	@Override
	public void swim() {
		System.out.println("I am swimming");
	}
	@Override
	public void sound() {
		System.out.println("Quack, quack");
	}
	

}
