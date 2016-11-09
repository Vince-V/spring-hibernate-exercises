package com.code.springexercise;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	// adding an init method
	public void doStartInit(){
		System.out.println("TrackCoach: inside doStartInit method");
	}
	
	// adding a destroy method
	public void doDestroy(){
		System.out.println("TrackCoach: inside doDestroy method");
	}
}
