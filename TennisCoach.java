package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//bean id someSillyCoach
@Component("someSillyCoach")
public class TennisCoach implements Coach {

	
	private FortuneService FortuneService;
	
	public TennisCoach(FortuneService theFortuneService) {
		FortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

}
