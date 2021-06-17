# Rockets

A rocket is identified with a code and a number of thrusters. We create two rockets with codes "32WESSDS" AND "LDSFJA32".

The first one has 3 thrusters, of a maximum power of 10,30,80, respectively, and the second one, 6, of a maximum power of 30,40,50,50,30,10. All thrusters have a starting current power of 0.

A rocket has two methods, accelerate and brake, and increases or reduces from 10 to 10 the thrusters' power. The rocket's current power is the sum of it's thrusters' power.

Rocket with code "32WESSDS" and 10,30,80 powers. When the rocket is created the currrent power is 0.                                                                                
1st increase: 10+10+10 = 30    rocket current power                                                                                                                                  
2nd increase:  0+10+10 = 30+20 rocket current power                                                                                                                                  
3th increase:  0+10+10 = 50+20 rocket current power                                                                                                                                  
4th increase:  0+ 0+10 = 70+10 rocket current power                                                                                                                                  
5th increase:  0+ 0+10 = 80+10 rocket current power                                                                                                                                  
... until the rocket max power is 120

The app allows the user to create, accelerate, brake and see the information of the rockets
