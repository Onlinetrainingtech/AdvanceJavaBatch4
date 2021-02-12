package com.xyz.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//Creating the Object
		
		//BaseballCoach theCoach=new BaseballCoach();
		
		//TrackCoach   theCoach=new TrackCoach();
		
		Coach theCoach=new TrackCoach();
		
		//Use this object
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
