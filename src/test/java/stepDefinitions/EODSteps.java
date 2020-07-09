package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class EODSteps {

    private WebDriver driver;
    private EODHomePage homePage;
    private EODSignInPage signInPage;
    private EODSignUpPage signUpPage;
    private static String email;
    private static String password;
    private EODHomeSignedPage homeSignedPage;
    private EODAddressesPage addressesPage;
    private EODAddressesNewPage addressesNewPage;
    private EODAddressShowPage addressShowPage;
    private static String fName;
    private static String lName;
    private static String addr;
    private static String city;
    private static String zip;


    public EODSteps(){
        driver = Hooks.driver;
    }

    @Given("I am on Home page")
    public void on_home_page(){
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        homePage = new EODHomePage(driver);
        homePage.clickSignIn();
    }

    @And("I click sign up button")
    public void click_signUp_button() {
        signInPage = new EODSignInPage(driver);
        signInPage.clickSignUp();
    }

    @And("I add email {string} and password {string}")
    public void add_data(String mail, String pass) {
        signUpPage = new EODSignUpPage(driver);
        signUpPage.setEmail(mail);
        signUpPage.setPassword(pass);
        email = mail;
        password = pass;
        signUpPage.clickSignUp();
    }

    @Then("I sign out")
    public void iSignOut() {
        homeSignedPage = new EODHomeSignedPage(driver);
        homeSignedPage.clickSignOut();

    }

    @And("I logIn with registered email and password")
    public void logIn_registered_user() {
        signInPage = new EODSignInPage(driver);
        signInPage.logIn(email, password);
        signInPage.clickSignInButton();

    }

    @And("I click on Addresses link")
    public void click_on_addreses() {
        homeSignedPage = new EODHomeSignedPage(driver);
        homeSignedPage.clickAddressesLink();
    }

    @And("I click on New Address link")
    public void click_on_newAddress_link() {
        addressesPage = new EODAddressesPage(driver);
        addressesPage.clickNewAddressLink();
    }

    @And("I fill {string}, {string}, {string}, {string} and {string}")
    public void i_add_data_to_fields(String fName, String lName, String addr, String city, String zip) {
        addressesNewPage = new EODAddressesNewPage(driver);
        addressesNewPage.setData(fName, lName, addr, city, zip);
        this.fName = fName;
        this.lName = lName;
        this.addr = addr;
        this.city = city;
        this.zip = zip;
    }

    @And("I click Create Address")
    public void click_create_address_button() {
        addressesNewPage = new EODAddressesNewPage(driver);
        addressesNewPage.clickCreateAddressButton();
    }

    @And("I verify address added")
    public void verify_added_data() {
        addressShowPage = new EODAddressShowPage(driver);
        Assertions.assertEquals(fName, addressShowPage.getFirstName(), "First name is not the same");
        Assertions.assertEquals(lName, addressShowPage.getLastName(), "Last name is not the same");
        Assertions.assertEquals(addr, addressShowPage.getAddress1(), "Address1 is not the same");
        Assertions.assertEquals(city, addressShowPage.getCity(), "City is not the same");
        Assertions.assertEquals(zip, addressShowPage.getZipCode(), "Zip code  is not the same");
    }

    @And("I click List link")
    public void i_click_list_link() {
        addressShowPage = new EODAddressShowPage(driver);
        addressShowPage.clickListLink();
    }

    @Then("I verify address on page")
    public void verify_added_data_in_list() {
        addressesPage = new EODAddressesPage(driver);
    }

    @And("I destroy one address")
    public void destroy_address() {
        addressesPage = new EODAddressesPage(driver);
        addressesPage.clickDestroyButton();
    }

    @Then("I verify address removed")
    public void iVerifyAddressRemoved() {
    }
}
