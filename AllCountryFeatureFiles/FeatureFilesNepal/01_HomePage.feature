Feature: HomePage

  @HomePage @Nepal
  Scenario: TC_001 Successfully open global website link
  Given User open "Nepal" website link
    When Verify country name should be displayed
    Then Close browser

  @HomePage @Nepal
  Scenario: TC_002 Successfully verify all header menu icons
 	  Given "Company_logo" icon name should be displayed	
 	   And "Product" icon name should be displayed		
 	   And "Dealers" icon name should be displayed		
 	   And "Service" icon name should be displayed			
 	   And "Hero_world" icon name should be displayed	
 	   And "About_hero" icon name should be displayed	
    Then Close browser
    
  @HomePage @Nepal
  Scenario Outline: <TC_Num> Click on <Icon_Name>
    Given "<Icon_Name>" icon name should be displayed	
 	  When Click on "<Icon_Name>"
    And Close browser
    
    Examples: 
      |Icon_Name	    |TC_Num   |
      |Product        |TC_003		|	
      |Dealers 	      |TC_004	  |
      |Service        |TC_005		|	
      |Hero_world     |TC_006		|
      |About_hero     |TC_007		|
      |Company_logo   |TC_008		|	

  @HomePage @Nepal
  Scenario: TC_009 Click on country icon and select any country
    Given Verify country name should be displayed
    When Click on country icon
    And Close browser

  @HomePage @Nepal
  Scenario: TC_010 Verify home page text content
    Given Verify home page text should be displayed
    And Close browser

  @HomePage @Nepal
  Scenario: TC_011 Verify home page commuter all bikes
  Given User open "Homepage" website link
  When Click on homepage "Commuter" icons
  Then verify home page "Nepal" country commuter all bikes
  And Close browser
    
  @HomePage @Nepal
  Scenario: TC_012 Verify home page premium bikes
  Given User open "Homepage" website link
  When Click on homepage "Premium" icons
  Then Verify home page "Nepal" country premium all bikes
  And Close browser

  @HomePage @Nepal
  Scenario: TC_013 Verify home page all scooter
  Given User open "Homepage" website link
  When Click on homepage "scooter" icons
  Then home page "Nepal" country scooter all bikes
  And Close browser

  @HomePage @Nepal
  Scenario Outline: <TC_Num> Verify home page <Bike_Name> bike expanded card under <Icon_Name> icon
  Given User open "Nepal" website link
    When Click on homepage "<Icon_Name>" icons 
    Then Click on "<Bike_Name>" bike name and verify expanded card info
    And Close browser
    
    Examples: 
      |Bike_Name 		       |Icon_Name	  	|TC_Num   |
      |Splendor_Plus		 	 |Commuter      |TC_014		|	
      |Super_Splendor		   |Commuter      |TC_015		|	
      |Xpulse2004V	       |Premium       |TC_016		|	
      |Xoom110		         |scooter       |TC_017		|	
    
  @HomePage @Nepal
  Scenario: TC_018 Verify home page promotion banner
  Given User open "Homepage" website link
    When Verify promotion banner it should be displayed
    And Close browser 
  
  @HomePage @Nepal  
  Scenario: TC_019 Verify home page let us call you back form mandatory field
    Given Click on submit button
    When Verify all mandatory field should be displayed
    And Close browser
  
  @HomePage @Nepal  
  Scenario: TC_020 Successfully fill home page let us call you back form
    Given User able to enter "customer_name"
    When User able to enter "mobile_number"
    Then User able to enter "email_id"
    And select city in dropdown "city"
    And Click submit enquiry button
    And Verify successfully submit form 
    And Close browser    
  
  @HomePage @Nepal  
  Scenario: TC_021 Verify home page marketing advertisement banner text
    Given Verify "1st" marketing advertisement line text
    When Verify "2nd" marketing advertisement line text
    And Close browser   
  
  @HomePage @Nepal  
  Scenario: TC_022 Verify home page footer link inside the product all icons rediretions
  Given User open "Homepage" website link
    Given Verify "commuter" icon redirection
    And Verify "premium" icon redirection
    And Verify "scooter" icon redirection
    And Close browser      
  
  @HomePage @Nepal  
  Scenario: TC_023 Verify home page footer link inside the support all icons rediretions
    Given Verify "owners_manual" icon redirection
    And Verify "contact_us" icon redirection
    And Verify "request_a_call" icon redirection
    And Verify "become_a_dealer" icon redirection
    And Close browser      
  
  @HomePage @Nepal  
  Scenario: TC_024 Verify home page footer link facebook and instagram logo
  Given User open "Homepage" website link
    When Verify logo
    And Close browser 
           
  @HomePage @Nepal  
  Scenario: TC_025 Verify home page request a call back popup form mandatory field
    Given Click on submit button1
    When Verify all mandatory field should be displayed1
    And Close browser   
  
 
  @HomePage @Nepal  
  Scenario: TC_026 Successfully fill home page let us call you back popup form
    Given User able to enter "customer_name1"    
    And User able to enter "mobile_number1"    
    And User able to enter "email_id1"   
    And select city in dropdown "city1"
    And Click submit enquiry button1
    And Verify successfully submit form1 
    And Close browser  
  
  @HomePage @Nepal  
  Scenario: TC_027 Verify home page find a dealer icon and redirection
  Given User open "Homepage" website link
    When Click on find a dealer icon
    Then Verify dealer page 
    And Close browser 
   
	@HomePage @Nepal
	Scenario: TC_028 Successfully verify all product image icons
  Given User open "Homepage" website link
	  When "Company_logo" icon name should be displayed	
		And Click on banner "All_banner_icon"	
		And Close browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
