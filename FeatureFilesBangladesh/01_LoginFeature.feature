Feature: HomePage 



@HomePage @Bangladesh
Scenario: TC_001 Successfully open global website link
	Given User open website link "https://www.heromotocorp.com/en-bd.html"
	When Verify all country should be displayed
	Then Close browser

@HomePage @Bangladesh
Scenario: TC_002 Successfully open bangladesh global website link
	Given User open website link "https://www.heromotocorp.com/en-bd.html"
	When country name should be displayed
	Then Close browser

@HomePage @Bangladesh
Scenario: TC_003 Successfully verify all tabbar icons
 	  Given "Company_logo" icon name should be displayed	
 	   And "Product" icon name should be displayed		
 	   And "Dealers" icon name should be displayed		
 	   And "Service" icon name should be displayed		
 	   And "Hero_world" icon name should be displayed		
 	   And "About_hero" icon name should be displayed	
	   And Close browser

@HomePage @Bangladesh
Scenario: TC_004 Successfully verify all product image icons
  Given "Company_logo" icon name should be displayed	
	When Click on banner "1st_image_button"	
	Then Verify "1st_image" should be displayed	
	And Click on banner "2nd_image_button"	
	And Verify "2nd_image" should be displayed	
	And Click on banner "3rd_image_button"	
	And Verify "3rd_image" should be displayed	
	And Click on banner "4th_image_button"	
	And Verify "4th_image" should be displayed	
	And Click on banner "5th_image_button"	
	And Verify "5th_image" should be displayed	
	And Click on banner "6th_image_button"	
	And Verify "6th_image" should be displayed	
	And Click on banner "7th_image_button"	
	And Verify "7th_image" should be displayed	
	And Click on banner "8th_image_button"	
	And Verify "8th_image" should be displayed	
	And Click on banner "9th_image_button"	
	And Verify "9th_image" should be displayed	
	And Close browser

@HomePage @Bangladesh
Scenario: TC_005 Successfully verify product icons
	Given Click on "Product"
	When "New_launch" icon name it should be displayed
	And "Commuter" icon name it should be displayed
	And "Excutive" icon name it should be displayed
	And "premium_world" icon name it should be displayed
	And "Scooter" icon name it should be displayed	
	And "Find_a_dealer" icon name it should be displayed
	And "Find_a_service_center" icon name it should be displayed
	And Close browser

@HomePage @Bangladesh
Scenario: TC_006 Successfully verify bike under New launch icons
	Given Click on "Product"
	When Click on "New_launch_icons"	
	And Verify "Bike_name" should be displayed	
	And Verify "Bike_Price" should be displayed
	And Close browser

@HomePage @Bangladesh
Scenario: TC_007 Successfully verify bike under Commuter icons
	Given Click on "Product"
	When Click on "commuter_icons"
	Then Verify "HF_Deluxe_bike_name" should be displayed
	And Verify "HF_Deluxe_bike_price" should be displayed
	And Verify "Splender+SE_bike_name" should be displayed
	And Verify "Splender+SE_bike_price" should be displayed
	And Verify "Splender+XTEC_bike_name" should be displayed
	And Verify "Splender+XTEC_bike_price" should be displayed
	And Verify "Passion_XPRO_bike_name" should be displayed
	And Verify "Passion_XPRO_price" should be displayed
	And Verify "Passion_XPRO_XTEC_bike_name" should be displayed
	And Verify "Passion_XPRO_XTEC_bike_price" should be displayed
	And Close browser

@HomePage @Bangladesh
Scenario: TC_008 Successfully verify bike under Executive icons
	Given Click on "Product"
	When Click on "executive_icons"
	Then Verify Glamour bike name should be displayed
	And Verify Glamour bike price should be displayed
	Then Verify Ignitor techno bike name should be displayed
	And Verify Ignitor techno bike price should be displayed
	Then Verify Ignitor Xtec bike name should be displayed
	And Verify Ignitor Xtec bike price should be displayed
	And Close browser

@HomePage @Bangladesh
Scenario: TC_009 Successfully verify bike under Premium icons
	Given Click on "Product"
	When Click on "Premium_icons"
	Then Verify Thriller 160R 4v bike name should be displayed
	And Verify Thriller 160R 4v bike price should be displayed
	Then Verify Hunk 150 bike name should be displayed
	And Verify Hunk 150 bike price should be displayed
	Then Verify Hunk 150R bike name should be displayed
	And Verify Hunk 150R bike price should be displayed
	Then Verify Thriller 160R bike name should be displayed
	And Verify Thriller 160R bike price should be displayed
	And Close browser

@HomePage @Bangladesh
Scenario: TC_010 Successfully verify bike under Scooter icons
	Given Click on "Product"
	When Click on "Scooter_icons"
	Then Verify Pleasure bike name should be displayed
	And Verify Pleasure bike price should be displayed
	Then Verify Maestro edge XTEC bike name should be displayed
	And Verify Maestro edge XTEC bike price should be displayed
	And Close browser
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	
