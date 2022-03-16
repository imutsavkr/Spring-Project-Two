package com.utsav.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

//		Read Spring config File

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//		get the bean from spring container

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

//		call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

//		call method to get the detail fortune
		System.out.println(theCoach.getDailyFortune());
		
//		call our new swim coach methods ... has the props value injected
		System.out.println("email:" + theCoach.getEmail());
		System.out.println("Team:" + theCoach.getTeam());

//		close the context
		context.close();

	}

}
