package com.code.springannotations;

import org.springframework.stereotype.Component;

@Component
public class AppliedInfoService implements InfoService {

	@Override
	public String getInfoService() {
		return "The getInfoService action has executed!";
	}

}
