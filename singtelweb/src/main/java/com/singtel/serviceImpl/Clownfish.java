package com.singtel.serviceImpl;

import com.singtel.service.IMakeJokes;

public class Clownfish extends Fish implements IMakeJokes{

	public String color = "orange";
	public String size = "small";
	@Override
	public void joke() {
		System.out.println("I make Jokes");
	}

}
