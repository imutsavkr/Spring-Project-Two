package com.utsav.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach : Inside default constructor");
	}

//	add an init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside method doMyStartupStuff");
	}

//	add destroy method
	@PreDestroy
	public void doMyCleanupStuffYoYo() {
		System.out.println("TennisCoach: inside method doMyCleanupStuffYoYo");
	}
//	define a setter method

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> Tennis Coach : Inside doSomeCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	@Override
	public String getDailyWorkout() {

		return "Practice Your Backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
