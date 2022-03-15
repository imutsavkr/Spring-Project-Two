package com.utsav.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	

//	Create an Array of strings
	private String[] data = {
			"Beware of the wolf in Sheep's clothing",
			"Diligence is the mother of good luck",
			"The Journey is the reward"
	};
	
//	Create a random generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
//		pick a random fortune from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		
		return theFortune;
	}

}
