package com.singtel.serviceImpl;

import com.singtel.service.Animal;
import com.singtel.service.IMakeSound;
import com.singtel.service.IMakeSoundLocaleImpl;

public class Rooster implements Animal,IMakeSound{

	private String language;
	
	@Override
	public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
	public void sound(String lang) {
		setLanguage(lang);
		IMakeSoundLocaleImpl langSound = new IMakeSoundLocaleImpl(this,language);
		langSound.sound();
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
