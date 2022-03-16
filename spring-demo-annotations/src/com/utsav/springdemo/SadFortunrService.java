package com.utsav.springdemo;

public class SadFortunrService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day";
	}

}
