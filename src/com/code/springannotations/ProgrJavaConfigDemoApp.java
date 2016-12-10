package com.code.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgrJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// will first read the spring configuration java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		// get bean from spring container
		Instructor theInstructor = context.getBean("springInstructor", SpringInstructor.class);//springInstructor
		
		// call methods on the bean
		System.out.println(theInstructor.getDailyPractice());
		
		// call method , get daily infoservice
		System.out.println(theInstructor.getDailyInfoService());	
		
		// utilize new spring instructor methods to check if property values injected
//		System.out.println("email: " + theInstructor.getEmail() );	
//		System.out.println("team: " + theInstructor.getTeam() );	
		
		
		// close context
		context.close();

	}

}
