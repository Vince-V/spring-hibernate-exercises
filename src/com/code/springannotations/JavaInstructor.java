package com.code.springannotations;

import org.springframework.stereotype.Component;

@Component("thatCrazyInstructor")
public class JavaInstructor implements Instructor {

	@Override
	public String getDailyPractice() {
		return "Practice your basics";
	}

	@Override
	public String getDailyResults() {
		return null;
	}

 

}
