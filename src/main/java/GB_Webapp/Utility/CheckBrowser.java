package GB_Webapp.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckBrowser extends PageClassObject {

    public static void CheckBrowserStatus() {
        try {
            // Check if the page is completely loaded
            boolean isPageLoaded = isBrowserLoaded(driver);
            if (isPageLoaded) {
//                Log.info("Browser is ready for the next command.");
            } else {
                handlePageUnresponsiveError("Browser is not ready for the next command: Page Unresponsive error.");
            }
        } catch (Exception e) {
            // Handle any unexpected exceptions during the process
           handlePageUnresponsiveError("Exception occurred while checking browser status: Page Unresponsive error.");
        }
    }

   
    public static boolean isBrowserLoaded(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            for (int i = 0; i < 5; i++) { // Retry for up to 5 seconds
                String readyState = js.executeScript("return document.readyState").toString();
                if ("complete".equalsIgnoreCase(readyState)) {
                    return true; // Page is fully loaded
                }
                Thread.sleep(1000); // Wait 1 second before rechecking
            }
        } catch (InterruptedException e) {
            Log.error("Interrupted while checking page load status: Page Unresponsive error.");
            Thread.currentThread().interrupt(); // Restore the interrupt status
        } catch (Exception e) {
            Log.error("Error during page load check: Page Unresponsive error.");
        }
        return false; // Return false if the page does not load within the timeout
    }

    /**
     * Handles the scenario where the browser is unresponsive or the page fails to load.
     *
     * @param errorMessage The error message to log.
     */
    private static void handlePageUnresponsiveError(String errorMessage) {
        try {
            // Quit the current browser session
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            Log.error("Error while quitting the browser: Page Unresponsive error.");
        }

        try {
            // Relaunch the browser and perform necessary recovery actions
            BaseTest.launchBrowser();
            Library.open_new_Window_and_close_previous_Window(driver, hero_Gb_Bangladesh_ProdUrl);
            Log.error(errorMessage);
        } catch (Exception e) {
            Log.error("Error during browser recovery: Page Unresponsive error.");
        }
    }
}



