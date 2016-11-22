package com.code.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigSpringApp {

	public static void main(String[] args) {
		
		// will first read the spring configuration java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("bin.com.code.springannotations.SpringConfig.class");
		
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
