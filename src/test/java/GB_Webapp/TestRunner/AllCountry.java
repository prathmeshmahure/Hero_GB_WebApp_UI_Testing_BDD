package GB_Webapp.TestRunner;
//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//AllCountryFeatureFiles/FeatureFilesBangladesh/01_LoginFeature.feature",".//AllCountryFeatureFiles/FeatureFilesBangladesh/02_BikeFeature.feature",".//AllCountryFeatureFiles/FeatureFilesBangladesh/03_Service.feature",
				".//AllCountryFeatureFiles/FeatureFilesBangladesh/04_HeroWorld.feature",".//FeatureFilesBangladesh/05_AboutHero.feature",
				
				".//AllCountryFeatureFiles/FeatureFilesZambia/01_HomePage.feature",".//AllCountryFeatureFiles/FeatureFilesZambia/02_ZambiaBikeFeature.feature",".//AllCountryFeatureFiles/FeatureFilesZambia/03_Dealer.feature",
					".//AllCountryFeatureFiles/FeatureFilesZambia/04_Service.feature",".//AllCountryFeatureFiles/FeatureFilesZambia/05_AboutHero.feature",
					
					".//AllCountryFeatureFiles/FeatureFilesPhilippines/01_HomePage.feature",".//AllCountryFeatureFiles/FeatureFilesPhilippines/02_PhilippinesBikeFeature.feature",".//AllCountryFeatureFiles/FeatureFilesPhilippines/03_Dealer.feature",
					".//AllCountryFeatureFiles/FeatureFilesPhilippines/04_Service.feature",".//AllCountryFeatureFiles/FeatureFilesPhilippines/05_AboutHero.feature",
					
					".//AllCountryFeatureFiles/FeatureFilesNepal/01_HomePage.feature",".//AllCountryFeatureFiles/FeatureFilesNepal/02_BikeFeature.feature",".//AllCountryFeatureFiles/FeatureFilesNepal/03_Dealer.feature",
					".//AllCountryFeatureFiles/FeatureFilesNepal/04_Service.feature",".//AllCountryFeatureFiles/FeatureFilesNepal/05_AboutHero.feature"
					},
		glue="GB_Webapp.StepDefinition",
		dryRun = false,				// if check test case method present or not as per feature file
		monochrome = true,
		tags = "@Bangladesh or @Zambia or @Philippines or @Nepal",   //@Bangladesh , @Zambia , @Philippines ,@Nepal
		plugin = {"summary",        // Using "pretty" console displayed each & every scenario and "summary" not display scenario
				  "html:Reports/cucumber_reports.html",
		          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		          }
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		)


//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
//		plugin = {"pretty","json:target/cucumber-reports/report_json.json"}

public class AllCountry extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
}

