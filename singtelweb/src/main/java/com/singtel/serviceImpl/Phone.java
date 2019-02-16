package com.singtel.serviceImpl;

import com.singtel.service.IMakeSound;

public class Phone implements IMakeSound{

	@Override
	public void sound() {
		System.out.println("Treeng treeng");
	}

}
