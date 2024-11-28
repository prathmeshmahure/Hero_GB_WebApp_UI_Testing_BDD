package GB_Webapp.StepDefinition;

import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends BaseTest{

	@When("Verify home page new launch all bikes should be displayed")
	public void verify_home_page_new_launch_all_bikes_should_be_displayed() {
	    hp.verify_home_page_new_launch_all_bikes_should_be_displayed();
	}
	@Then("Verify home page commuter all bikes should be displayed")
	public void verify_home_page_commuter_all_bikes_should_be_displayed() {
	    hp.verify_home_page_commuter_all_bikes_should_be_displayed();
	}
	@Then("Verify home page executive all bikes should be displayed")
	public void verify_home_page_executive_all_bikes_should_be_displayed() {
	    hp.verify_home_page_executive_all_bikes_should_be_displayed();
	}
	@Then("Verify home page premium all bikes")
	public void verify_home_page_premium_all_bikes_should_be_displayed1() {
	    hp.verify_home_page_premium_all_bikes_should_be_displayed1();
	}
	@Then("Verify home page scooter all bikes should be displayed")
	public void verify_home_page_scooter_all_bikes_should_be_displayed() {
	    hp.verify_home_page_scooter_all_bikes_should_be_displayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//================================================= Zambia country test case start======================================================
	@Given("User open {string} website link")
	public void user_open_website_link(String string){
		switch (string) {
	    case "Homepage":
	    	driver.navigate().refresh();
	    	Library.threadSleep(1000);
	    	Library.moveToElement(driver, loginPg.getHeroLogo());
	    	try { loginPg.getHeroLogo().click();     }catch(Exception e) { }
	        break;
	    case "Bangladesh":
	    	loginPg.user_open_website_link();
	        break;
	    case "Zambia":
	    	 hp.user_open_zambia_website_link();
	        break;
	    case "Philippines":
	    	hp.user_open_Philippines_website_link();
	        break;
	    case "Nepal":
	    	hp.user_open_Nepal_website_link();
	        break;
	    default: 
	    	Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }   
	}
	@When("Verify country name should be displayed")
	public void verify_country_name_should_be_displayed() {
	    hp.verify_country_name_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Verify home page text should be displayed")
	public void verify_home_page_text_should_be_displayed() {
	    hp.verify_home_page_text_should_be_displayed();
	}
//=======================================================================================================		
	@Given("Verify home page moto taxi All bikes should be displayed")
	public void verify_home_page_moto_taxi_all_bikes_should_be_displayed() {
	   hp.verify_home_page_moto_taxi_all_bikes_should_be_displayed();
	}
	@When("Verify home page personal All bikes should be displayed")
	public void verify_home_page_personal_all_bikes_should_be_displayed() {
	    hp.verify_home_page_personal_all_bikes_should_be_displayed();
	}
	@Then("Verify home page All scooter should be displayed")
	public void verify_home_page_all_scooter_should_be_displayed() {
	    hp.verify_home_page_all_scooter_should_be_displayed();
	}
//=======================================================================================================		
	@When("Click on homepage {string} icons")
	public void should_be_displayed(String string) {
		switch (string) {
	    case "moto_taxi":
	    		hp.Click_on_mototaxi();  // Zambia
	        break;
	    case "personal":
	    	    hp.Click_on_personal();  // Zambia
	        break;
	    case "scooter":
	    	    hp.Click_on_scooter();  // Zambia or Bangladesh or Nepal
	        break;
	    case "New_Launch":
    	    hp.Click_on_new_launch();  // Bangladesh
    	    break;
	    case "Commuter":
    	    hp.Click_on_commuter();  // Bangladesh or Nepal
    	    break;
	    case "Executive":
    	    hp.Click_on_executive();  // Bangladesh
    	    break;
	    case "Premium":
    	    hp.Click_on_premium();  // Bangladesh or Philippines or Nepal
    	    break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }
	}

	@Then("Click on {string} bike name and verify expanded card info")
	public void click_on_bike_name_and_verify_expanded_card_info(String string) {
		switch (string) {
	    case "Hunter100":
	    		hp.verifyHunter100Bike();  // Zambia
	        break;
	    case "Hunter125":
	    		hp.verifyHunter125Bike();  // Zambia
	        break;
	    case "Hunter150":
	    		hp.verifyHunter150Bike();  // Zambia
	        break;
	    case "Hunter150TR":
	    		hp.verifyHunter150TRBike();  // Zambia
	        break;
	    case "XPULSE200":
	    		hp.verifyXpulse200Bike();  // Zambia
	        break;
	    case "Destini125":
	    		hp.verifyDestini125Scooter();  // Zambia
	        break;
	    case "Karizma_XMR":
    		hp.verifyKarizmaXMRBike();  // Bangladesh
    		break;
	    case "HF_Deluxe":
    		hp.verifyHFDeluxeBike();  // Bangladesh
    		break;
	    case "Splendor_Plus_SE":
    		hp.verifySplendorPlusSEBike();  // Bangladesh
    		break;
	    case "Splendor_Plus_Xtec":
    		hp.verifySplendorPlusXtecBike();  // Bangladesh
    		break;
	    case "Passion_Xpro":
    		hp.verifyPassionXproBike();  // Bangladesh
    		break;
	    case "Passion_Xpro_Xtec":
    		hp.verifyPassionXproXtecBike();  // Bangladesh
    		break;
	    case "Glamour":
    		hp.verifyGlamourBike();  // Bangladesh
    		break;
	    case "Ignitor_Techno":
    		hp.verifyIgnitorTechnoBike();  // Bangladesh
    		break;
	    case "Ignitor_Xtec":
    		hp.verifyIgnitorXtecBike();  // Bangladesh
    		break;
	    case "Thriller160R4v":
    		hp.verifyThriller160R4vBike();  // Bangladesh
    		break;
	    case "Hunk150":
    		hp.verifyHunk150Bike();  // Bangladesh
    		break;
	    case "Hunk150R":
    		hp.verifyHunk150RBike();  // Bangladesh
    		break;
	    case "Thriller160R":
    		hp.verifyThriller160RBike();  // Bangladesh
    		break;
	    case "Pleasure":
    		hp.verifyPleasureScooter();  // Bangladesh
    		break;
	    case "Maestro_Edge_Xtec":
    		hp.verifyMaestroEdgeXtecScooter();  // Bangladesh
    		break;
	    case "Splendor_Plus":
    		hp.verify_Splendor_Plus_Bike();  // Nepal
    		break;
	    case "Super_Splendor":
    		hp.verify_Super_Splendor_Bike();  // Nepal
    		break;
	    case "Xpulse2004V":
    		hp.verify_Xpulse2004V_Bike();  // Nepal
    		break;
	    case "Xoom110":
    		hp.verify_Xoom110_Scooter();  // Nepal
    		break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
		}
	}
//=======================================================================================================	
	@When("Verify promotion banner it should be displayed")
	public void verify_promotion_banner_it_should_be_displayed() {
		hp.verify_promotion_banner_it_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Click on submit button")
	public void click_on_submit_button() {
		hp.click_on_submit_button();
	}
	@When("Verify all mandatory field should be displayed")
	public void verify_all_mandatory_field_should_be_displayed() {
		hp.verify_all_mandatory_field_should_be_displayed();
	}
//=======================================================================================================	
	@Given("Click on submit button1")
	public void click_on_submit_button1() {
		hp.click_on_submit_button1();
	}
	@When("Verify all mandatory field should be displayed1")
	public void verify_all_mandatory_field_should_be_displayed1() {
		hp.verify_all_mandatory_field_should_be_displayed1();
	}	
//=======================================================================================================
	@Given("User able to enter {string}")
	public void user_able_to_enter(String string) {
		switch (string) {
	    case "customer_name":
			hp.user_able_to_enter_customer_name();
			break;
	    case "mobile_number":
			hp.user_able_to_enter_mobile_number();
	        break;
	    case "email_id":
			hp.user_able_to_enter_email_id();
	        break;
	    case "city":
			hp.user_able_to_enter_city();
			break;
	    case "customer_name1":
	    	hp.user_able_to_enter_customer_name1();
			break;
	    case "mobile_number1":
	    	hp.user_able_to_enter_mobile_number1();
	        break;
	    case "email_id1":
	    	hp.user_able_to_enter_email_id1();
	        break;
	    case "city1":
	    	hp.user_able_to_enter_city1();
			break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }
	}
	@Then("Click submit enquiry button")
	public void click_submit_enquiry_button() {
		hp.click_submit_enquiry_button();
	}
	@Then("Verify successfully submit form")
	public void verify_successfully_submit_form() {
		hp.verify_successfully_submit_form();
	}
	@Then("Click submit enquiry button1")
	public void click_submit_enquiry_button1() {
		hp.click_submit_enquiry_button1();
	}
	@Then("Verify successfully submit form1")
	public void verify_successfully_submit_form1() {
		hp.verify_successfully_submit_form1();
	}
//=======================================================================================================	
	@Given("Verify {string} marketing advertisement line text")
	public void verify_1st_marketing_advertisement_line_text(String string) {
		switch (string) {
	    case "1st":
	    	hp.verify_1st_marketing_advertisement_line_text();
	        break;
	    case "2nd":
	    	hp.verify_2nd_marketing_advertisement_line_text();
	        break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }	    
	}
//=======================================================================================================		
	@Given("Verify {string} icon redirection")
	public void verify_icon_redirection(String string) {
		switch (string) {
	    case "moto_taxi":
		    hp.verify_mototaxi_icon_redirection();
	        break;
	    case "personal":
		    hp.verify_personal_icon_redirection();
	        break;
	    case "scooter":
	 	   hp.verify_scooter_icon_redirection();
	        break;
	    case "reach_us":
	    	hp.verify_reach_us_icon_redirection();
	        break;
	    case "request_a_call":
	    	hp.verify_request_a_call_icon_redirection();
	        break;
	    case "become_a_dealer":
	    	hp.verify_beacome_a_dealer_icon_redirection();
	        break;
	    case "premium":
	    	hp.verify_premium_icon_redirection();
	        break;
	    case "contact_us":
	    	hp.verify_contactus_icon_redirection();
	        break;
	    case "owners_manual":
	    	hp.verify_OwnersManual_icon_redirection();
	        break;
	    case "owners_manual1":
	    	hp.verify_OwnersManual_icon_redirection1();
	        break;
	    case "commuter":
	    	hp.verify_commuter_icon_redirection();
	        break;
	    case "executive":
	    	hp.verify_executive_icon_redirection();
	        break;
	    case "service_center":
	    	hp.verify_service_center_icon_redirection();
	        break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }
	}
//=======================================================================================================		
	@When("Verify logo")
	public void verify_logo() {
	    hp.verify_logo();
	}
//=======================================================================================================		
	@When("Click on find a dealer icon")
	public void click_on_find_a_dealer_icon() {
	   hp.click_on_find_a_dealer_icon();
	}
	@Then("Verify dealer page")
	public void verify_dealer_page() {
	    hp.verify_dealer_page();
	}
//=======================================================================================================		
//=======================================================================================================	
//=======================================================================================================		
//=======================================================================================================		
//=======================================================================================================		
//=======================================================================================================		
///=========================// Philippines country start//=========================//	
	
	@When("Verify philippines country name should be displayed")
	public void verify_philippines_country_name_should_be_displayed() {
	    hp.verify_philippines_country_name_should_be_displayed();
	}
//=======================================================================================================	
	@When("Verify home page premium All bikes should be displayed")
	public void verify_home_page_premium_all_bikes_should_be_displayed() {
	    hp.verify_home_page_premium_all_bikes_should_be_displayed();
	}
	@Then("Verify Philippines home page All scooter should be displayed")
	public void verify_Philippines_home_page_all_scooter_should_be_displayed() {
	    hp.verify_Philippines_home_page_all_scooter_should_be_displayed();
	}
//=======================================================================================================	
	@When("Click on Philippines homepage {string} icons")
	public void click_on_Philippines_homepage_icons(String string) {
		switch (string) {
	    case "premium":
	    		hp.Click_on_premium();
	        break;
	    case "scooter":
	    	    hp.Click_on_scooter1();
	        break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }
	}
	@Then("Click on Philippines {string} bike name and verify expanded card info")
	public void click_on_Philippines_bike_name_and_verify_expanded_card_info(String string) {
		switch (string) {
	    case "Xpulse2004V":
	    		hp.verifyxpulse2004vBike();
	        break;
	    case "Hunk160R4V":
	    		hp.verifyHunk160R4vBike();
	        break;
	    case "Xoom110":
	    		hp.verifyXoom110Scooter();
	        break;
	    default:
	         Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
		}
	}
	@Then("select city in dropdown {string}")
	public void select_city_in_dropdown(String string) {
		switch (string) {
	    case "city":
	    		hp.select_city();
	        break;
	    case "city1":
	    		hp.select_city1();
	        break;
	    default:
	        Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
		}
	}
//================================ Nepal country code start ==================================================	
	
	@Then("verify home page {string} country commuter all bikes")
	public void verify_home_page_country_commuter_all_bikes(String string) {
		switch (string) {
	    case "Nepal":
	    	hp.verify_home_page_nepal_country_commuter_all_bikes();
	        break;
	    default: 
	    	Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }   
	}

	@Then("Verify home page {string} country premium all bikes")
	public void verify_home_page_country_premium_all_bikes(String string) {
		switch (string) {
	    case "Nepal":
	    	hp.verify_home_page_nepal_country_premium_all_bikes();
	        break;
	    default: 
	    	Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }  
	}

	@Then("home page {string} country scooter all bikes")
	public void home_page_country_scooter_all_bikes(String string) {
		switch (string) {
	    case "Nepal":
	    	hp.verify_home_page_nepal_country_scooter_all_bikes();
	        break;
	    default: 
	    	Library.failmsg(string+" = Switch case statemwnt string is not matched. ");
	    	break;
	   }  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
