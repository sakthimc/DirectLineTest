package stepDefinitions;

import PageObjects.DealerPortalPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    private WebDriver driver;
    private DealerPortalPage dealerPortalPage;

    @Given("^I launch the insurance portal$")
    public void iLaunchTheInsurancePortal() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krish.Murthy\\intellijworkspace\\DirectLineCoverCheck\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
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
            driver.close();
        } else {
            System.out.println("Do nothing");
            driver.close();
        }
    }
}