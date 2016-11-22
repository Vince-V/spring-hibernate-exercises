package com.code.springannotations;

public class SpringInstructor implements Instructor {

	private InfoService infoService;
	
	public SpringInstructor(InfoService theInfoService){
		infoService = theInfoService;
	}
	
	@Override
	public String getDailyPractice() {
		return "Practice patterns and algorithms";
	}

	@Override
	public String getDailyInfoService() {
		return infoService.getInfoService();
	}

	@Override
	public String getDailyResults() {
		return null;
	}

}
