Feature: Service



	@Service @Nepal
	Scenario: TC_034 verify Close button under service icon
    Given User open "Nepal" website link
		When Click on "Service"
		Then Click on close icon
		And Close browser
		
	@Service @Nepal
	Scenario: TC_035 verify service and maintenance tips all information
    Given User open "Nepal" website link
		Given Click on "Service"
		When Click on maintenance tips
		Then Verify header line four icons
		And Verify service schedule and dropdown three bikes
		And select any bikes and verify bikes servicing information it should be displayed
		And Close browser
		
	@Service @Nepal
	Scenario: TC_036 verify pre ride inspection guide under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on pre ride inspection guide
		Then Verify all inspection guide
		And Close browser
		
	@Service @Nepal
	Scenario: TC_037 verify fuel saving tips under two wheeler tips header icon
		Given Click on header two wheeler tips icon
		When Click on care and maintenance
		And Verify all care and maintenance
		And Close browser
		
	@Service @Nepal
	Scenario: TC_038 verify hero genuine parts
		Given Click on hero genuine parts
		When Verify hero genuine parts page information
		And Close browser