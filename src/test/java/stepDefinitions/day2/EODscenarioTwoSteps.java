package stepDefinitions.day2;

import core.EODheader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.EODpages.AddressesPage;
import pageObject.EODpages.SignInPage;
import stepDefinitions.hooks.Hooks;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EODscenarioTwoSteps {

    private WebDriver driver;
    private EODheader eodHeader;
    private SignInPage signInPage;
    private AddressesPage addressesPage;

    public EODscenarioTwoSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on Home Page")
    public void sign_in_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("click Sign in link")
    public void click_sign_in_link() {
        eodHeader = new EODheader(driver);
        eodHeader.clickSignInLink();
    }

    @And("Add email {string} and password {string}")
    public void add_data(String email, String pass) {
        signInPage = new SignInPage(driver);
        signInPage.addEmailAndPassword(email, pass);
    }

    @And("click Sign in button")
    public void click_sign_in_button() {
        signInPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("click Addresses link")
    public void click_addresses_link() {
        eodHeader = new EODheader(driver);
        eodHeader.clickAddressesLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("click New Address link")
    public void click_new_address_link() {
        addressesPage = new AddressesPage(driver);
        addressesPage.clickNewAddressLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I create a new address:")
    public void create_new_address(Map<String, String> values) {
        driver.findElement(By.id("address_first_name")).sendKeys(values.get("First Name"));
        driver.findElement(By.id("address_last_name")).sendKeys(values.get("Last name"));
        driver.findElement(By.id("address_street_address")).sendKeys(values.get("Adress"));
        driver.findElement(By.id("address_city")).sendKeys(values.get("City"));
        driver.findElement(By.id("address_zip_code")).sendKeys(values.get("Zipcode"));
        addressesPage.clickCreateAddButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("verify address is added")
    public void verifyAddressIsAdded() {
        Assertions.assertEquals("Address was successfully created.", driver.findElement(By.xpath("//div[@data-test='notice']")).getText(), "Address is not created");
    }

    @And("click List link")
    public void clickListLink() {
        addressesPage.clickListLink();
    }

//    @Then("verify address on page")
//    public void verifyAddressOnPage() {
//        Assertions.
//
//    }
}


