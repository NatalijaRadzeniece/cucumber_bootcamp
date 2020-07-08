package stepDefinitions.day2;

import core.EODheader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.EODpages.AddressesPage;
import pageObject.EODpages.SignInPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class EODscenarioThreeSteps {

    private WebDriver driver;
    private EODheader eodHeader;
    private SignInPage signInPage;
    private AddressesPage addressesPage;

    public EODscenarioThreeSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on Page")
    public void sign_in_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("click Sign In")
    public void click_sign_in_link() {
        eodHeader = new EODheader(driver);
        eodHeader.clickSignInLink();
    }

    @And("Add Email {string} and password {string}")
    public void add_data(String email, String pass) {
        signInPage = new SignInPage(driver);
        signInPage.addEmailAndPassword(email, pass);

    }

    @And("click Sign In button")
    public void click_sign_in_button() {
        signInPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("click Addresses Link")
    public void click_addresses_link() {
        eodHeader = new EODheader(driver);
        eodHeader.clickAddressesLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("destroy one address")
    public void click_destroy() {
        addressesPage = new AddressesPage(driver);
        addressesPage.clickDestroyButton(2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
    }

    @And("verify that address removed")
    public void verify_destroy(){
        Assertions.assertEquals("Address was successfully destroyed.",driver.findElement(By.cssSelector("[class='alert alert-notice']")).getText(),"Address is not destroyed");
    }
}
