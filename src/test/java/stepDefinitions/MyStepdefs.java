/**
 * Author: SathyaPriya Ramakrisshnan
 * Glue code Implementation for feature file
 */
package stepDefinitions;

import PageObjects.DealerPortalPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MyStepdefs {
    private WebDriver driver;
    private DealerPortalPage dealerPortalPage;

    @Before
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I launch the insurance portal$")
    public void iLaunchTheInsurancePortal() {
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
        String pageTitle = driver.getTitle();
        System.out.println("I am on:" + pageTitle);
        Assert.assertEquals("PageTitle is:", "Dealer Portal", pageTitle);
    }

    @When("^I enter the vehicle \"([^\"]*)\" and click submit$")
    public void iEnterTheVehicleAndClickSubmit(String regNumber) throws Throwable {
        dealerPortalPage = new DealerPortalPage(driver);
        if (regNumber.equals("OV12UYY")) {
            dealerPortalPage.enterValidVehicleRegNum(regNumber);
        } else {
            dealerPortalPage.enterValidVehicleRegNum(regNumber);
            String invalidRegNumberGiven = driver.findElement(By.cssSelector("div#page-container > div.result")).getText();
            System.out.println(invalidRegNumberGiven);
        }

    }

    @Then("^I should see the \"([^\"]*)\" insurance details$")
    public void iShouldSeeTheInsuranceDetails(String regNumber) throws Throwable {
        if (regNumber.equals("OV12UYY")) {
            dealerPortalPage = new DealerPortalPage(driver);
            dealerPortalPage.getVehicleInsuranceDetails();
        } else {
            System.out.println("Do nothing");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}