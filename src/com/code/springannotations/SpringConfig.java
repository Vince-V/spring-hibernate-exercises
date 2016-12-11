package com.code.springannotations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan("com.code.springannotations")
//@PropertySource("classpath:spring.properties")
public class SpringConfig {
	
	// add lines to resolve ${...} properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer
					propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// create bean for spring info service
	@Bean
	public InfoService springInfoService() {
		return new SpringInfoService();
	}
	
	// create bean for spring instructor and inject dependency
	@Bean
	public Instructor springInstructor() {
		return new SpringInstructor(springInfoService());
	} 
}
