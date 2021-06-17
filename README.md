# Rockets

Phase 1                                                                                  
A rocket is identified with a code of 8 characters, and a number of thrusters.                                                     
- We create two rockets with codes "32WESSDS" and "LDSFJA32", and 3 and 6 thrusters respectively.                          
- Print out the code and number of thrusters of the rockets.

Phase 2                                                                                  
We want to improve the software, so the rocket has a maximum power.                                                             
Modify the previous main:
- We create two rockets with codes "32WESSDS" and "LDSFJA32". The first one has 3 thrusters (power: 10,30,80), and the second one, 6 (30,40,50,50,30,10).
- Print out the code and number of thrusters of the rockets, and the maximum power of each thruster.                           
  Output:                            
  32WESSDS: 10, 30, 80                           
  LDSFJA32: 30, 40, 50, 50, 30, 10

Phase 3                                                                                  
We add an current power to the thrusters: a thruster will have a maximum power, it can't exceed, and a current power, the power the thruster will have at a very moment. When the rocket is created the currrent power is 0.

A rocket will have two methods, accelerate and brake, and increases or reduces from 10 to 10 the thrusters' power. The rocket's current power is the sum of it's thrusters' power.

Rocket with code "32WESSDS" and 10,30,80 powers.                                                                                
1st increase: 10+10+10 =  0+30 rocket current power                                                                                                                                  
2nd increase:  0+10+10 = 30+20 rocket current power                                                                                                                                  
3th increase:  0+10+10 = 50+20 rocket current power                                                                                                                                  
4th increase:  0+ 0+10 = 70+10 rocket current power                                                                                                                                  
5th increase:  0+ 0+10 = 80+10 rocket current power                                                                                                                                  
... until the rocket max power is 120

Phase 4                                                                                
Calculate the speed of the rocket v = vo+100
