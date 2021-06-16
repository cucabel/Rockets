package com.rockets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rocket {	
	private String code;
	private int thrustersNumber;
	
	public Rocket() {};
	
	public Rocket(String code, int thrustersNumber) throws Exception {
		validateCode(code);
		this.thrustersNumber = thrustersNumber;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getThrustersNumber() {
		return thrustersNumber;
	}

	public void setThrustersNumber(int thrustersNumber) {
		this.thrustersNumber = thrustersNumber;
	}
	
	public void validateCode(String code) throws Exception {
		Pattern pattern = Pattern.compile("\\w\\w\\w\\w\\w\\w\\w\\w");		
		Matcher matcher = pattern.matcher(code);
		if (!matcher.find())
			throw new Exception();
		else
			this.code = code;
	}
	
	public String toString() {
		String result = "Rocket's code: " + code + "," + " Thrusters' number: " + thrustersNumber;
		return result;
	}
}
