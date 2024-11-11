Feature: Zambia Dealers


	@Dealers @Philippines
  Scenario: TC_026 verify dealers information
  Given User open Philippines website link "https://www.heromotocorp.com/en-ph.html"
    When Click on "Dealers"
    Then "Dealers_name , Dealers_address , Dealers_time , Dealers_contact_number" should be displayed
    And Close browser