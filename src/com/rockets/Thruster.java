package com.rockets;

public class Thruster {
	private int maxPower;
	
	public Thruster() {}
	
	public Thruster(int maxPower) {
		this.maxPower = maxPower;
	}
	
	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}
	
	public String toString() {
		String result = "Thruster's Max. Power :";
		result += String.valueOf(maxPower);
		return result;
	}

}



