package com.code.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JavaInstructor implements Instructor {

	@Autowired
	@Qualifier("randomInfoService")
	private InfoService infoService;
	
	// define a default constructor
	public JavaInstructor() {
		System.out.println(">> inside default constructor");
	}
	
	/*
	@Autowired
	public void utilizeAutowire(InfoService theInfoService){
		System.out.println(">> inside utilizeAutowire");
		infoService = theInfoService;
	}
	*/
	/*
	@Autowired
	public JavaInstructor(InfoService theInfoService){
		infoService = theInfoService;
	}
	*/
	@Override
	public String getDailyPractice() {
		return "Practice your basics";
	}

	@Override
	public String getDailyInfoService() {
		// TODO Auto-generated method stub
		return infoService.getInfoService();
	}
	
	@Override
	public String getDailyResults() {
		return null;
	}

	

 

}
