package com.singtel.serviceImpl;

import com.singtel.service.IEatFish;

public class Shark extends Fish implements IEatFish{

	public String color = "gray";
	public String size = "large";
	@Override
	public void eatOtherFish() {
		System.out.println("I eat Other Fish");
	}
}
