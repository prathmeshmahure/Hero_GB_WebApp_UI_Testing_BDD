Feature: HeroWorld


	
@HeroWorld @Bangladesh
Scenario: TC_001 Successfully click on Hero world icon
 	Given User open website link "https://www.heromotocorp.com/en-bd.html"     
  When Click on Hero world icon
  Then Click on Hero News icon
	And Verify news
	And Click on Amaar hero icon
	And Verify new window and close
	And Click on Hero Joyride icon
	And Verify hero joyride page
	And CLick on Blogs icon
	And Verify blogs page
  And Close browser

