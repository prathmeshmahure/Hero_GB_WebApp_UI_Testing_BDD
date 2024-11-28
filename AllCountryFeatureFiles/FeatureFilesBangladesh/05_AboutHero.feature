Feature: AboutHero


	 
	@AboutHero @Bangladesh
	Scenario: TC_063 Successfully click on About Hero icon
	  Given User open "Bangladesh" website link
			When Click on "About_hero"
	  Then Click on About Hero page
		And Verify About Hero page in new window and close
		And Click on About Niloy Bangladesh Ltd icon
		And Verify About Niloy Bangladesh Ltd page
		And Click on Reach us icon
		And Verify Reach us page
		And Click on Become a delear icon
		And Verify Become a delear page
		And Click on investor icon
		And Verify investor page
	  And Close browser

	@AboutHero @Bangladesh
	Scenario: TC_064 verify about hero right side image close button and find a delear redirection
  Given User open "Bangladesh" website link
		When Click on "About_hero"
		Then Verify right side static image
		And Click on about hero close icon
		And Click on "About_hero"
		And Click on find a delear
		And Verify dealer page 
		And Close browser
			
	@AboutHero @Bangladesh
	Scenario: TC_065 verify about hero become a dealer page form
  Given User open "Bangladesh" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Bangladesh"
		And Fill contact details "Bangladesh"
		And Click on Submit button and verify Thank you pop up
		And Close browser
			
	@AboutHero @Bangladesh
	Scenario: TC_066 verify share holder details in become a dealer page form
  Given User open "Bangladesh" website link
		When Click on "About_hero"
		Then Click on Become a delear icon
		And Fill personal details "Bangladesh"
		And Fill contact details "Bangladesh"
		And Fill existing business details
		And Fill share holder details
		And Click on Submit button and verify Thank you pop up
		And Close browser
		
		