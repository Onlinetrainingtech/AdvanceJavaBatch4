package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the Spring Configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrive bean from Spring Container
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//call the method
		
		System.out.println(theCoach.getDailyWorkout());

		//close the context
		
		context.close();
	}

}
