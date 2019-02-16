package com.singtel.serviceImpl;

import com.singtel.service.ILivinigWith;
import com.singtel.service.IMakeSound;

public class Parrot extends Bird implements ILivinigWith, IMakeSound{

	private String sound;
	private IMakeSound livesWith;

	@Override
	public void livingWith(IMakeSound a) {
		setLivesWith(a);
	}

	@Override
	public void sound() {
		getLivesWith().sound();
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public IMakeSound getLivesWith() {
		return livesWith;
	}

	public void setLivesWith(IMakeSound livesWith) {
		this.livesWith = livesWith;
	}


}
