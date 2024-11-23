Feature: Service


	@Service @Bangladesh
	Scenario: TC_056 Successfully click on service icon
	  Given User open "Bangladesh" website link 
	  When Click on service icon
		Then Click on Maintenance Tips icon
		And Click on warranty icon
		And Click on two wheeler tips icon
		And Click on owners manual icon
		And Click on hero joy ride icon
		And Click on Diy videos icon
		And Click on Hero genuine parts icon
	  And Close browser


	@Service @Bangladesh
	Scenario: TC_057 verify Close button under service icon
  Given User open "Bangladesh" website link 
		When Click on "Service"
		Then Click on close icon
		And Close browser
		
	@Service @Bangladesh
	Scenario: TC_058 verify service and maintenance tips all information
    Given User open "Bangladesh" website link 
		When Click on "Service"
		When Click on maintenance tips
		Then Verify header line four icons
#		And Verify service schedule and dropdown three bikes
#		And select any bikes and verify bikes servicing information it should be displayed
		And Close browser
		
	@Service @Bangladesh
	Scenario: TC_059 verify pre ride inspection guide under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on pre ride inspection guide
		Then Verify all inspection guide
		And Close browser
		
	@Service @Bangladesh
	Scenario: TC_060 verify care and maintenance under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on care and maintenance
		And Verify all care and maintenance
		And Close browser
		
	@Service @Bangladesh
	Scenario: TC_061 verify hero genuine parts
		Given Click on hero genuine parts
		When Verify hero genuine parts page information
		And Close browser
		
		
		
		