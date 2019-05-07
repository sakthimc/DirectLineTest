package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class DealerPortalPage {
    private WebDriver driver;

    public DealerPortalPage(WebDriver driver) throws MalformedURLException {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "input#vehicleReg")
    private WebElement regNumTextBox;

    @FindBy(how = How.CSS, using = "div#page-container button[type=\"button\"]")
    private WebElement findVehicleButton;

    @FindBy(how = How.CSS, using = "div#page-container div.result")
    private WebElement resultTitle;

    @FindBy(how = How.CSS, using = "div#page-container div:nth-child(4) > div:nth-child(2)")
    private WebElement validFrom;

    @FindBy(how = How.CSS, using = "div#page-container div:nth-child(4) > div:nth-child(3)")
    private WebElement validTo;


    public void enterValidVehicleRegNum(String regNum) throws InterruptedException {
        regNumTextBox.isDisplayed();
        regNumTextBox.click();
        regNumTextBox.sendKeys(regNum);
        findVehicleButton.click();
        Thread.sleep(750);
    }

    public void getVehicleInsuranceDetails() throws InterruptedException {
        Thread.sleep(750);
        String title = resultTitle.getText();
        System.out.println(title);
        Thread.sleep(750);
        String validF = validFrom.getText();
        System.out.println(validF);
        Thread.sleep(750);
        String validT = validTo.getText();
        System.out.println(validT);
    }

}
