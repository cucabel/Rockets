package com.rockets;

public class Main {
	
	public static void main (String[] args) throws Exception {
		int [] thrustersMaxPowerArrayRocket1 = {10, 30, 80};
		Rocket rocket1 = new Rocket("32WESSDS", 3, thrustersMaxPowerArrayRocket1);

		int [] thrustersMaxPowerArrayRocket2 = {30, 40, 50, 50, 30, 10};
		Rocket rocket2 = new Rocket("LDSFJA32", 6, thrustersMaxPowerArrayRocket2 );
		
		System.out.println(rocket1);
		System.out.println(rocket2);	
	}

}
