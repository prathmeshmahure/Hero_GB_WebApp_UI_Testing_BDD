package GB_Webapp.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GB_Webapp.Utility.Library;

public class DealersPage extends BasePage{

	public DealersPage(WebDriver driver) {
		super(driver);
	}

	
//=================================================================================================================	
	@FindBy(xpath="//div[@class='search-results']//div[@class='sr-item-title gradient-text-red fs-18']")
	private List <WebElement> DealerName;
	
	@FindBy(xpath="//div[@class='search-results']//div[@class='sr-item-address']")
	private List <WebElement> DealersAddress;
		
	@FindBy(xpath="//div[@class='search-results']//div[@class='sr-item-time'][1]")
	private List <WebElement> DealersTime;
	
	@FindBy(xpath="//a[text()='View Direction']//parent::div")
	private List <WebElement> DealersContactNumber;
	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;
//	
//	@FindBy(xpath="normalize")
//	private WebElement Features;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//=====================================================================================================
//=====================================================================================================
//=====================================================================================================
//=====================================================================================================
//=====================================================================================================
		
	public void delears_name_should_be_displayed() {
		for (WebElement element : DealerName) {
			Library.visible_link_gettext(driver, element, "Dealer Name");
		}		
	}
	public void delears_address_should_be_displayed() {
		for (WebElement element : DealersAddress) {
			Library.visible_link_gettext(driver, element, "Dealers Address");
		}		
	}
	public void delears_contact_number_should_be_displayed() {
		for (WebElement element : DealersTime) {
			Library.visible_link_gettext(driver, element, "Dealers Time");
		}		
	}
	public void delears_time_should_be_displayed() {
		for (WebElement element : DealersContactNumber) {
			Library.visible_link_gettext(driver, element, "Dealers Contact Number");
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
