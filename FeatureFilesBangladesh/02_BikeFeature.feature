Feature: Bangladesh BikeFeature

Background:
	Given User open website link "https://www.heromotocorp.com/en-bd.html"
	When Click on "Product"

# All bike features file
# //    Commuter all 5 bikes 

@BikeFeatureTest @Bangladesh 
Scenario Outline: Successfully verify "<Bike_Name>" bike feature under "<Icon_Name>" icon 
	Then Click on "<Icon_Name>" icons
	And Click on "<Bike_Name>" bike name
	# for premium bike condition apply due to xpath chg
	And Click on highlights "<Icon_Name>" icon  
	And Click on Colours icon
	And Verify bike multiple colours
	And Click on price icon
	And Verify bike price
  And Click on specifications icon
  And Verify multiple specificatios
  And Click on EMI icon
  And Verify all EMI option
  And Click on Gallery icon
  And Close browser
    
    Examples: 
      |Bike_Name 					 |Icon_Name	  	|
      |Hf_Deluxe					 |commuter 		  |
      |Splendor+SE				 |commuter      |
      |Splender+_XTEC		   |commuter 		  |
      |Passion_XPRO			   |commuter      |
      |Passion_XPRO_XTEC	 |commuter 		  |
      |Glamour    			   |executive     |
      |Ignitor_techno			 |executive     |
      |Ignitor_XTEC				 |executive     |
      |Thriller_160R_4V	   |Premium       |
      |Hunk_150				     |Premium       |
      |Hunk_150R			     |Premium       | 
      |Thriller_160R			 |Premium       |
      |Pleasure  				   |Scooter       |
      |MAESTRO_EDGE_XTEC	 |Scooter       |




#@BikeFeature
#Scenario: Successfully verify Hf Deluxe bike feature under commuter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"
  #When Click on product icon
#	Then Click on commuter icons
#	And Click on HF Deluxe bike name
#	And Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	And Click on Colours icon
#	And Verify bike multiple colours
#	And Click on price icon
#	And Verify bike price
  #And Click on specifications icon
  #And Verify multiple specificatios
  #And Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Splendor+SE bike feature under commuter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"
  #When Click on product icon
#	Then Click on commuter icons
#	And Click on Splender+SE bike name
#	And Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	And Click on Colours icon
#	And Verify bike multiple colours
#	And Click on price icon
#	And Verify bike price
  #And Click on specifications icon
  #And Verify multiple specificatios
  #And Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Splender+ XTEC bike feature under commuter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"  
  #When Click on product icon
#	Then Click on commuter icons
#	And Click on Splender+ XTEC bike name
#	And Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	And Click on Colours icon
#	And Verify bike multiple colours
#	And Click on price icon
#	And Verify bike price
  #And Click on specifications icon
  #And Verify multiple specificatios
  #And Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
 #
#@BikeFeature
#Scenario: Successfully verify Passion XPRO bike feature under commuter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"  
  #When Click on product icon
#	Then Click on commuter icons
#	And Click on Passion XPRO bike name
#	And Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	And Click on Colours icon
#	And Verify bike multiple colours
#	And Click on price icon
#	And Verify bike price
  #And Click on specifications icon
  #And Verify multiple specificatios
  #And Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Passion XPRO XTEC bike feature under commuter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"  
  #When Click on product icon
#	Then Click on commuter icons
#	And Click on Passion XPRO XTEC bike name
#	And Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	And Click on Colours icon
#	And Verify bike multiple colours
#	And Click on price icon
#	And Verify bike price
  #And Click on specifications icon
  #And Verify multiple specificatios
  #And Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
# //==============================  Executive all 3 bikes =================================================
#
#@BikeFeature
#Scenario: Successfully verify Glamour bike feature under executive icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"    
  #When Click on product icon
#	Then Click on executive icons
#	Then Click on Glamour bike name
#	Then Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Ignitor techno bike feature under executive icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"
  #When Click on product icon
#	Then Click on executive icons
#	Then Click on Ignitor techno bike name
#	Then Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Ignitor XTEC bike feature under executive icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"     
  #When Click on product icon
#	Then Click on executive icons
#	Then Click on Ignitor XTEC bike name
#	Then Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
#
# //==============================  Premium all 4 bikes =================================================
#
#@BikeFeature
#Scenario: Successfully verify Thriller 160R 4V bike feature under Premium icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"     
  #When Click on product icon
#	Then Click on Premium icons
#	Then Click on Thriller 160R 4V bike name
#	Then Click on highlights icon
#	And Verify technology button1
#	And Verify features button1
#	And Verify safety button1
#	And Verify trust button1
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
#@BikeFeature
#Scenario: Successfully verify Hunk 150 bike feature under Premium icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"   
  #When Click on product icon
#	Then Click on Premium icons
#	Then Click on Hunk 150 bike name
#	Then Click on highlights icon
#	And Verify technology button1
#	And Verify features button1
#	And Verify safety button1
#	And Verify trust button1
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
#
#@BikeFeature
#Scenario: Successfully verify Hunk 150R bike feature under Premium icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"  
  #When Click on product icon
#	Then Click on Premium icons
#	Then Click on Hunk 150R bike name
#	Then Click on highlights icon
#	And Verify technology button1
#	And Verify features button1
#	And Verify safety button1
#	And Verify trust button1
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
#
#@BikeFeature
#Scenario: Successfully verify Thriller 160R bike feature under Premium icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"   
  #When Click on product icon
#	Then Click on Premium icons
#	Then Click on Thriller 160R bike name
#	Then Click on highlights icon
#	And Verify technology button1
#	And Verify features button1
#	And Verify safety button1
#	And Verify trust button1
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
#
# //==============================  Scooter all 2 bikes =================================================
#
#@BikeFeature
#Scenario: Successfully verify Pleasure Scooter feature under Scooter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"   
  #When Click on product icon
#	Then Click on Scooter icons
#	Then Click on verify Pleasure Scooter name
#	Then Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser
  #
 #@BikeFeature
#Scenario: Successfully verify MAESTRO EDGE XTEC Scooter feature under Scooter icon
#	Given User open website link "https://www.heromotocorp.com/en-bd.html"     
  #When Click on product icon
#	Then Click on Scooter icons
#	Then Click on MAESTRO EDGE XTEC Scooter name
#	Then Click on highlights icon
#	And Verify technology button
#	And Verify features button
#	And Verify safety button
#	And Verify trust button
#	Then Click on Colours icon
#	And Verify bike multiple colours
#	Then Click on price icon
#	And Verify bike price
  #Then Click on specifications icon
  #And Verify multiple specificatios
  #Then Click on EMI icon
  #And Verify all EMI option
  #And Click on Gallery icon
  #And Close browser










































	