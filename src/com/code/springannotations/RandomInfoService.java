package com.code.springannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomInfoService implements InfoService {

	//create an array of strings
	private String[] stringData = {
			"Make sure to plan manage your time",
			"Being prepared for good luck is as important as luck itself",
			"Focus on and enjoy the process"
	};
	
	// create random number generator
	private Random randomGen = new Random();
	
	
	@Override
	public String getInfoService() {
		// pick random string from that array
		int index = randomGen.nextInt(stringData.length);
		
		String theInfo = stringData[index];
		
		return theInfo;
	}

}
