package GB_Webapp.Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GB_Webapp.Utility.BaseTest;
import GB_Webapp.Utility.ConfigeDataProvider;
import GB_Webapp.Utility.Library;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
//==============================================================================================================
	
	@FindBy(xpath="//div[@class='d-none d-lg-block']//span[contains(text(),'Bangladesh')]")
	private WebElement Bangladesh;
	
	@FindBy(xpath="//h2[normalize-space()='Please Select Your Country']//following-sibling::ul//following-sibling::li")
	private List<WebElement> AllCountries;

	@FindBy(xpath = "//button[@class='btn-close modal-close']")
	private WebElement CloseAllCountries;

	@FindBy(xpath = "//span[@class='brand-image desktop']//img[@alt='Logo of Hero Motor']")
	private WebElement HeroLogo;
	
	@FindBy(xpath = "//a[normalize-space()='PRODUCTS']")
	private WebElement Products;
	
	@FindBy(xpath = "//a[normalize-space()='DEALERS']")
	private WebElement Dealers;
	
	@FindBy(xpath = "//a[normalize-space()='SERVICE']")
	private WebElement Service;
	
	@FindBy(xpath = "//a[normalize-space()='HERO WORLD']")
	private WebElement HeroWorld;
	
	@FindBy(xpath = "//a[normalize-space()='ABOUT HERO']")
	private WebElement AboutHero;
	
	@FindBy(xpath = "(//span[normalize-space()='NEW LAUNCH'])[1]")
	private WebElement NewLaunch;
	
	@FindBy(xpath = "(//span[normalize-space()='NEW LAUNCH'])[2]")
	private WebElement NewLaunch2;
	
	@FindBy(xpath = "//span[normalize-space()='Find a hero']")
	private WebElement FindAHero;
	
	@FindBy(xpath = "//div[@class='bike-name'][normalize-space()='Karizma XMR']")
	private WebElement KarizmaXMR2;
	
	@FindBy(xpath = "//div[@id='menu-498495753']//a[@type='button'][normalize-space()='REQUEST A CALL BACK']")
	private WebElement RequestACallBackButton;
	
	@FindBy(xpath = "//a[@href='/en-bd/products/KarizmaXMR.html'][normalize-space()='VIEW SPECIFICATIONS']")
	private WebElement ViewSpecifications;
	
	@FindBy(xpath = "//h2[normalize-space()='REQUEST A CALL BACK']")
	private WebElement RequestACallBackText;
	
	

	@FindBy(xpath = "(//span[normalize-space()='COMMUTER'])[1]")
	private WebElement Commuter;
	
	@FindBy(xpath = "(//span[normalize-space()='EXECUTIVE'])[1]")
	private WebElement Executive;
	
	@FindBy(xpath = "(//span[normalize-space()='PREMIUM'])[1]")
	private WebElement Premium;
	
	@FindBy(xpath = "(//span[normalize-space()='SCOOTER'])[1]")
	private WebElement Scooter;
	
	@FindBy(xpath = "//a[@aa-data-attr='track_cta'][normalize-space()='Find a Dealer']")
	private WebElement FindDealerButton;
	
	@FindBy(xpath = "//a[@aa-data-attr='track_cta'][normalize-space()='Find a Service Centre']")
	private WebElement FindServiceCentreButton;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'])[1]")
	private WebElement FirstBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'])[1]//following-sibling::div")
	private WebElement FirstBikePrice;////////////
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HF DELUXE']")
	private WebElement HfDeluxeBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HF DELUXE']//following-sibling::div//child::span)[2]")
	private WebElement HfDeluxeBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ SE']")
	private WebElement SplenderPlusSEBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ SE']//following-sibling::div//child::span)[2]")
	private WebElement SplenderPlusSEBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ Xtec']")
	private WebElement SplenderPlusXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Splendor+ Xtec']//following-sibling::div//child::span)[2]")
	private WebElement SplenderPlusXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro']")
	private WebElement PassionXproBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro']//following-sibling::div//child::span)[2]")
	private WebElement PassionXproBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro Xtec']")
	private WebElement PassionXproXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Passion Xpro Xtec']//following-sibling::div//child::span)[2]")
	private WebElement PassionXproXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Glamour']")
	private WebElement GlamourBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Glamour']//following-sibling::div//child::span)[2]")
	private WebElement GlamourBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Techno']")
	private WebElement IgnitorTechnoBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Techno']//following-sibling::div//child::span)[2]")
	private WebElement IgnitorTechnoBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Xtec']")
	private WebElement IgnitorXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Ignitor Xtec']//following-sibling::div//child::span)[2]")
	private WebElement IgnitorXtecBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R 4V']")
	private WebElement Thriller160R4VBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R 4V']//following-sibling::div//child::span)[2]")
	private WebElement Thriller160R4VBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HUNK 150']")
	private WebElement HUNK150BikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='HUNK 150']//following-sibling::div//child::span)[2]")
	private WebElement HUNK150BikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Hunk 150R']")
	private WebElement Hunk150RBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Hunk 150R']//following-sibling::div//child::span)[2]")
	private WebElement Hunk150RBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R']")
	private WebElement Thriller160RBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='Thriller 160R']//following-sibling::div//child::span)[2]")
	private WebElement Thriller160RBikePrice;
	
	@FindBy(xpath = "//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='PLEASURE']")
	private WebElement PleasureBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='PLEASURE']//following-sibling::div//child::span)[2]")
	private WebElement PleasureBikePrice;
	
	@FindBy(xpath = "//div[normalize-space()='MAESTRO EDGE XTEC']")
	private WebElement MaestroEdgeXtecBikeName;
	
	@FindBy(xpath = "(//div[@class='mm-bike-name font-bold text-uppercase'][normalize-space()='MAESTRO EDGE XTEC']//following-sibling::div//child::span)[2]")
	private WebElement MaestroEdgeXtecBikePrice;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[1]")
	private WebElement image1;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[2]")
	private WebElement image2;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[3]")
	private WebElement image3;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[4]")
	private WebElement image4;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[5]")
	private WebElement image5;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[6]")
	private WebElement image6;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[7]")
	private WebElement image7;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[8]")
	private WebElement image8;

	@FindBy(xpath = "(//div[@class='banner-heading']//parent::div)[8]")
	private WebElement image9;

	@FindBy(xpath = "//button[@data-bs-slide-to='0']")
	private WebElement imageButton1;

	@FindBy(xpath = "//button[@data-bs-slide-to='1']")
	private WebElement imageButton2;

	@FindBy(xpath = "//button[@data-bs-slide-to='2']")
	private WebElement imageButton3;

	@FindBy(xpath = "//button[@data-bs-slide-to='3']")
	private WebElement imageButton4;

	@FindBy(xpath = "//button[@data-bs-slide-to='4']")
	private WebElement imageButton5;

	@FindBy(xpath = "//button[@data-bs-slide-to='5']")
	private WebElement imageButton6;

	@FindBy(xpath = "//button[@data-bs-slide-to='6']")
	private WebElement imageButton7;

	@FindBy(xpath = "//button[@data-bs-slide-to='7']")
	private WebElement imageButton8;

	@FindBy(xpath = "//button[@data-bs-slide-to='8']")
	private WebElement imageButton9;

	@FindBy(xpath = "//div[@class='mm-body-head position-relative scrollbar-hidden']//a[@value='productsMegaMenu']")
	private WebElement CloseScootericon;

//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
//
//	@FindBy(xpath = "Dealer")
//	private WebElement Become;
	
	
	
public WebElement getCloseScootericon() {
		return CloseScootericon;
	}
	//============================================================================================================	
	public WebElement getNewLaunch2() {
		return NewLaunch2;
	}
	public WebElement getKarizmaXMR2() {
		return KarizmaXMR2;
	}
	public WebElement getRequestACallBackButton() {
		return RequestACallBackButton;
	}
	public WebElement getViewSpecifications() {
		return ViewSpecifications;
	}
	public WebElement getRequestACallBackText() {
		return RequestACallBackText;
	}
	public WebElement getImageButton1() {
		return imageButton1;
	}
	public WebElement getImageButton2() {
		return imageButton2;
	}
	public WebElement getImageButton3() {
		return imageButton3;
	}
	public WebElement getImageButton4() {
		return imageButton4;
	}
	public WebElement getImageButton5() {
		return imageButton5;
	}
	public WebElement getImageButton6() {
		return imageButton6;
	}
	public WebElement getImageButton7() {
		return imageButton7;
	}
	public WebElement getImageButton8() {
		return imageButton8;
	}
	public WebElement getImageButton9() {
		return imageButton9;
	}
	public WebElement getImage1() {
		return image1;
	}
	public WebElement getImage2() {
		return image2;
	}
	public WebElement getImage3() {
		return image3;
	}
	public WebElement getImage4() {
		return image4;
	}
	public WebElement getImage5() {
		return image5;
	}
	public WebElement getImage6() {
		return image6;
	}
	public WebElement getImage7() {
		return image7;
	}
	public WebElement getImage8() {
		return image8;
	}
	public WebElement getImage9() {
		return image9;
	}
	public WebElement getPleasureBikeName() {
		return PleasureBikeName;
	}
	public WebElement getPleasureBikePrice() {
		return PleasureBikePrice;
	}
	public WebElement getMaestroEdgeXtecBikeName() {
		return MaestroEdgeXtecBikeName;
	}
	public WebElement getMaestroEdgeXtecBikePrice() {
		return MaestroEdgeXtecBikePrice;
	}
	public WebElement getThriller160R4VBikeName() {
		return Thriller160R4VBikeName;
	}
	public WebElement getThriller160R4VBikePrice() {
		return Thriller160R4VBikePrice;
	}
	public WebElement getHUNK150BikeName() {
		return HUNK150BikeName;
	}
	public WebElement getHUNK150BikePrice() {
		return HUNK150BikePrice;
	}
	public WebElement getHunk150RBikeName() {
		return Hunk150RBikeName;
	}
	public WebElement getHunk150RBikePrice() {
		return Hunk150RBikePrice;
	}
	public WebElement getThriller160RBikeName() {
		return Thriller160RBikeName;
	}
	public WebElement getThriller160RBikePrice() {
		return Thriller160RBikePrice;
	}
	public WebElement getGlamourBikeName() {
		return GlamourBikeName;
	}
	public WebElement getGlamourBikePrice() {
		return GlamourBikePrice;
	}
	public WebElement getIgnitorTechnoBikeName() {
		return IgnitorTechnoBikeName;
	}
	public WebElement getIgnitorTechnoBikePrice() {
		return IgnitorTechnoBikePrice;
	}
	public WebElement getIgnitorXtecBikeName() {
		return IgnitorXtecBikeName;
	}
	public WebElement getIgnitorXtecBikePrice() {
		return IgnitorXtecBikePrice;
	}
	public WebElement getBangladesh() {
		return Bangladesh;
	}
	public List<WebElement> getAllCountries() {
		return AllCountries;
	}
	public WebElement getCloseAllCountries() {
		return CloseAllCountries;
	}
	public WebElement getHfDeluxeBikeName() {
		return HfDeluxeBikeName;
	}
	public WebElement getHfDeluxeBikePrice() {
		return HfDeluxeBikePrice;
	}
	public WebElement getSplenderPlusSEBikeName() {
		return SplenderPlusSEBikeName;
	}
	public WebElement getSplenderPlusSEBikePrice() {
		return SplenderPlusSEBikePrice;
	}
	public WebElement getSplenderPlusXtecBikeName() {
		return SplenderPlusXtecBikeName;
	}
	public WebElement getSplenderPlusXtecBikePrice() {
		return SplenderPlusXtecBikePrice;
	}
	public WebElement getPassionXproBikeName() {
		return PassionXproBikeName;
	}
	public WebElement getPassionXproBikePrice() {
		return PassionXproBikePrice;
	}
	public WebElement getPassionXproXtecBikeName() {
		return PassionXproXtecBikeName;
	}
	public WebElement getPassionXproXtecBikePrice() {
		return PassionXproXtecBikePrice;
	}
	public WebElement getFirstBikeName() {
		return FirstBikeName;
	}
	public WebElement getFirstBikePrice() {
		return FirstBikePrice;
	}
	public WebElement getHeroLogo() {
		return HeroLogo;
	}
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getDealers() {
		return Dealers;
	}
	public WebElement getService() {
		return Service;
	}
	public WebElement getHeroWorld() {
		return HeroWorld;
	}
	public WebElement getAboutHero() {
		return AboutHero;
	}
	public WebElement getNewLaunch() {
		return NewLaunch;
	}
	public WebElement getCommuter() {
		return Commuter;
	}
	public WebElement getExecutive() {
		return Executive;
	}
	public WebElement getPremium() {
		return Premium;
	}
	public WebElement getScooter() {
		return Scooter;
	}
	public WebElement getFindDealerButton() {
		return FindDealerButton;
	}
	public WebElement getFindServiceCentreButton() {
		return FindServiceCentreButton;
	}
	//============================================================================================================
//============================================================================================================
//============================================================================================================
	public void user_open_website_link() {
		Library.threadSleep(500);
		try {
				if(bf.getHighlights().isDisplayed()) {
					bf.getHighlights().click();
				}else {
				driver.navigate().to(ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
				}
		}catch(Exception e) {
			Library.open_new_Window_and_close_previous_Window(driver, ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
//			driver.navigate().to(ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
		}		
 		Library.passmsg("Website is open using this link : "+ConfigeDataProvider.hero_Gb_Bangladesh_ProdUrl);
 		BaseTest.handlePopup();
	}
	public void user_navigate_to_back_on_current_page() {
		Library.threadSleep(500);
		driver.navigate().back();
		Library.passmsg("User navigate to back on old page");	
	}
	public void country_name_should_be_displayed() {
		
		Library.visible_link(driver, Bangladesh, "Bangladesh");
	}
	public void close_browser() {	
		
		Library.passmsg("Close browser");
//		driver.close();
	}
	public void verify_all_country_should_be_displayed() {
		
		Library.click(driver, Bangladesh, "Select country");
		Library.threadSleep(1000);
		for(WebElement country:AllCountries) {
			Library.visible_link_gettext(driver, country, "Country name is ");
		}
		Library.click(driver, CloseAllCountries, "Close country button");
	}
	public void click_on_new_launch2_icons() {
		loginPg.user_open_website_link();
		try {
			Library.threadSleep(1000);
			Library.waitForVisibilityOf(driver, AboutHero);
			Library.scrollwebpage(driver, FindAHero, "FindAHero");
			FindAHero.click();
		}catch(Exception e) {		}
		Library.scrollwebpage(driver, AboutHero, "About Hero");
	    Library.click(driver, loginPg.getNewLaunch2(), "New Launch");		
	}
	public void click_on_commuter_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getCommuter(), "Commuter icon");
		Library.threadSleep(100);
		
	}
	public void click_on_executive_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getExecutive(), "Executive icon");
		Library.threadSleep(100);
		
	}
	public void click_on_premium_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getPremium(), "Premium icon");
		Library.threadSleep(100);
		
	}
	public void click_on_scooter_icons() {
		BaseTest.handlePopup();
		Library.waitForVisibilityOf(driver, loginPg.getCommuter());
		BaseTest.handlePopup();
		Library.threadSleep(100);
		Library.click(driver, loginPg.getScooter(), "Scooter icon");
		Library.threadSleep(100);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
