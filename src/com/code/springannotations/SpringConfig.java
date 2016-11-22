package com.code.springannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan("com.code.springannotations")
//@Qualifier("Instructor")
public class SpringConfig {
	 //@Bean(name="javaInstructor")
}
