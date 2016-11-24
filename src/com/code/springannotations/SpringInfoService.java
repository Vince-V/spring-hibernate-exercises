package com.code.springannotations;

public class SpringInfoService implements InfoService {

	@Override
	public String getInfoService() {
		return "Practicing Spring today!";
	}

}
