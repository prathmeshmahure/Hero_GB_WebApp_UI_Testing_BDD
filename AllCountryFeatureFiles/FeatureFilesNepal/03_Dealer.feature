Feature:  Dealers


	@Dealers @Nepal
  Scenario: TC_033 verify dealers information
 	 Given User open "Nepal" website link
    When Click on "Dealers"
    Then "Dealers_name , Dealers_address , Dealers_time , Dealers_contact_number" should be displayed
    And Close browser
    