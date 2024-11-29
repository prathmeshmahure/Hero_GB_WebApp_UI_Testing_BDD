Feature: BikeFeature

Background:
  Given User open "Nepal" website link
	When Click on "Product"


@BikeFeature @Nepal 
Scenario Outline: <TC_Num> Successfully verify <Bike_Name> bike feature under <Icon_Name> icon 
  Then Click on "<Icon_Name>" icons
	And Click on header "<Bike_Name>" bike name
	And Click on highlights "CommonForAllStep" icon  
	And Click on Colours icon
	And Verify bike multiple colours
	And Click on price icon
	And Verify bike price
  And Click on specifications icon
  And Verify multiple specificatios
  And Close browser

    Examples: 
      |Bike_Name 					 |Icon_Name	 	 |TC_Num    |
			|Splendor_Plus			 |commuter     |TC_029		|
			|Super_Splendor			 |commuter     |TC_030		|
			|Xpulse2004V				 |Premium      |TC_031		|
			|Xoom110				     |Scooter      |TC_032		|
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			