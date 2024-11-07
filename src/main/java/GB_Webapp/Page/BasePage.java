package GB_Webapp.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GB_Webapp.Utility.Log;
import GB_Webapp.Utility.PageClassObject;

/**
 * @author Prathmesh.Mahure
 *
 */

public abstract class BasePage extends PageClassObject {

	public static WebDriver driver;

	@SuppressWarnings("static-access")
	public BasePage(WebDriver driver) {
		try {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}catch (Exception e) {
			System.out.println("============================================");
   		 System.out.println("Page load timed out. Exception: " + e.getMessage());
   		 Log.error("Page load timed out. Exception: " + e.getMessage());
			System.out.println("============================================");
   	}
	}

}
