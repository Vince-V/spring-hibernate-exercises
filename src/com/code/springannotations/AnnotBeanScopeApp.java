package com.code.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotBeanScopeApp {

	public static void main(String[] args) {
		 
		// load spring config
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// get bean from spring container
		Instructor theInstructor = context.getBean("javaInstructor", Instructor.class);
		
		Instructor anotherInstructor = context.getBean("javaInstructor", Instructor.class);
		
		// check if both are the same
		boolean isResultSame = (theInstructor == anotherInstructor);
		
	
		System.out.println("\nPoint to the same object? : " +isResultSame);
		
		System.out.println("\nYes, point to the same object: " +theInstructor);
		
		System.out.println("\nMemory location of anotherInstructor: " +anotherInstructor + "\n" );
		
		
		context.close();
     }

}
