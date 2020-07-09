package stepDefinitions;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import stepDefinitions.hooks.Hooks;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddressPageTestSteps {
    private WebDriver driver;

    public AddressPageTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on test address Page")
    public void navigate_to_site() {
        driver.get("http://a.testaddressbook.com/");
    }

    @Given("I click Sign in link")
    public void click_sign_in_link() {

        driver.findElement(By.id("sign-in")).click();
    }

    //Scenario 1

    @When("I click Sign up link")

    public void click_sign_up_link() {
        SignInPage sign = new SignInPage(driver);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        sign.ClickSignUpLink();
    }

    @And("I enter email{string} and password {string}")
    public void add_user_data(String email, String pass) {
        SignUpPage1 sign = new SignUpPage1(driver);
        sign.EnterDataEmail(email);
        sign.EnterDataPass(pass);
    }

    @And("I click Sign up button")

    public void click_sign_up_button() {
        SignUpPage1 sign = new SignUpPage1(driver);
        sign.ClickSignUpButton();
    }

    @Then("I click Sign out button")

    public void click_sign_out_button() {
        SignUpPage signup = new SignUpPage(driver);
        signup.ClickSignOutButton();
    }

    //Scenario 2

    @When("I enter email {string} and password {string}")

    public void enter_user_data(String email, String pass) {
        SignInPage sign = new SignInPage(driver);
        sign.EnterDataEmail(email);
        sign.EnterDataPass(pass);
    }

    @And("I click Sign in button")
    public void click_sign_in_button2() {
        SignInPage sign = new SignInPage(driver);
        sign.ClickSignInButton();
    }

    @And("I click on Alert button save")
    public void click_on_alert_button_save() {
        SignInPage sign = new SignInPage(driver);
        sign.clickAlert();
        //sign.acceptAlert();
    }

    @And("I click Addresses")

    public void click_addresses() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.ClickAddresses();
    }

    @And("I click New Address")
    public void click_new_address() {
        driver.findElement(By.linkText("New Address")).click();
    }

    @And("I enter details into Address form:")

    public void add_text_to_fields(Map<String, String> data) {
        driver.findElement(By.id("address_first_name")).sendKeys(data.get("First name"));
        driver.findElement(By.id("address_first_name")).sendKeys(data.get("Last name"));
        driver.findElement(By.name("address[address1]")).sendKeys(data.get("Address1"));
        driver.findElement(By.id("address_city")).sendKeys(data.get("City"));
        driver.findElement(By.id("address_zip_code")).sendKeys(data.get("Zip code"));
    }

    @And("I click create address")
    public void click_create_address() {
        driver.findElement(By.xpath("//a[@value ='Create Address']")).click();
    }

    @And("verify address added")
    public void verify_sddress() {
        NewCreatedAddressPage newCreatedAddressPage = new NewCreatedAddressPage(driver);
        Assert.assertEquals("Address was successfully created.", newCreatedAddressPage.GetAddressMessage(), "Message does not exist or not the same");
    }

    @And("click list")
    public void clickList() {
        NewCreatedAddressPage newCreatedAddressPage = new NewCreatedAddressPage(driver);
        newCreatedAddressPage.ClickList();
    }

    @And("verify address on page")


    @And("repeat adding address for three times")

    //Scenario 3

    @When("I enter email {string} and password {string}")

    public void enter_user_data(String email, String pass) {
        SignInPage sign = new SignInPage(driver);
        sign.EnterDataEmail(email);
        sign.EnterDataPass(pass);
    }

    @And("I click Sign in button")
    public void click_sign_in_button2() {
        SignInPage sign = new SignInPage(driver);
        sign.ClickSignInButton();
    }

    @And("I click Addresses")

    public void click_addresses() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.ClickAddresses();
    }

    @And("I click Destroy address button")
    public void click_destroy_address_button() {
        driver.findElement(By.linkText("Destroy")).click();
    }

    @And("I click on the Alert OK button")
    public void Click_on_the_alert_OK_Button() {
    }

    @Then("I verify that address moved from page")
    public void verify_that_address_moved_from_page() {
    }
}
