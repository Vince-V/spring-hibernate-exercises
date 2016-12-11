package com.code.springannotations;

import org.springframework.beans.factory.annotation.Value;

public class SpringInstructor implements Instructor {

	private InfoService infoService;
	
//	@Value("${springpractice.email}")
//	private String email;
//	
//	@Value("${springpractice.team}")
//	private String team;
	
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

//	public String getEmail() {
//		return email;
//	}
//
//	public String getTeam() {
//		return team;
//	}
	
	

}
