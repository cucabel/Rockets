package com.rockets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rocket {
	private String code;
	private int thrustersNumber;
	private int [] thrustersMaxPowerArray;
	private List<Thruster> thrustersList = new ArrayList<>();
	
	public Rocket() {};
	
	public Rocket(String code, int thrustersNumber, int [] thrustersMaxPowerArray) throws Exception {
		validateCode(code);
		this.thrustersNumber = thrustersNumber;
		this.thrustersMaxPowerArray = thrustersMaxPowerArray;
		
		addThrusters(thrustersMaxPowerArray);
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

	public int[] getThrustersMaxPowerArray() {
		return thrustersMaxPowerArray;
	}

	public void setThrustersMaxPowerArray(int[] thrustersMaxPowerArray) {
		this.thrustersMaxPowerArray = thrustersMaxPowerArray;
	}

	public List<Thruster> getThrustersList() {
		return thrustersList;
	}

	public void setThrustersList(List<Thruster> thrustersList) {
		this.thrustersList = thrustersList;
	}
	
	public void validateCode(String code) throws Exception {
		Pattern pattern = Pattern.compile("\\w\\w\\w\\w\\w\\w\\w\\w");		
		Matcher matcher = pattern.matcher(code);
		if (!matcher.find())
			throw new Exception();
		else
			this.code = code;
	}
	
	private void addThrusters(int [] thrustersMaxPowerArray) {
		int thrusterMaxPower = 0;
		
		for (int i = 0; i < thrustersMaxPowerArray.length; i++) {
			thrusterMaxPower = thrustersMaxPowerArray[i];
			thrustersList.add(new Thruster(thrusterMaxPower));
		}
		System.out.println(thrustersList);
	}

	public int rocketMaxPower() {
		int maxPower = 0;
		
		Iterator<Thruster> iterator = thrustersList.iterator();
		
		while (iterator.hasNext()) {
			Thruster value = iterator.next();

			if(value.getMaxPower() > maxPower)
				maxPower = value.getMaxPower();			
		}		
		return maxPower;	
	}
	
	public String toString() {
		String result = "Rocket's code: " + code + "\nThrusters' number: " + thrustersNumber + "\nThrusters' Max. Power: " + "\nRocket' Max. power: ";
		
		for (int thrusterMaxPower : thrustersMaxPowerArray) {
			result += String.valueOf(thrusterMaxPower) + ", ";
		}
		result += "\nRocket' Max. power: " + rocketMaxPower();
		return result;
	}

}