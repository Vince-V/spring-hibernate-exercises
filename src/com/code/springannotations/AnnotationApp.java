package com.code.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		
		// will first read the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// get bean from spring container
		Instructor theInstructor = context.getBean("javaInstructor", Instructor.class);
		
		// call methods on the bean
		System.out.println(theInstructor.getDailyPractice());
		
		// call method , get daily infoservice
		System.out.println(theInstructor.getDailyInfoService());	
		
		// close context
		context.close();

	}

}
