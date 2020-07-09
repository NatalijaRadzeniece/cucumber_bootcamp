package stepDefinitions.finalWork;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.finalWork.CreatePage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class CreateTestSteps {

    private WebDriver driver;
    private CreatePage createPage;
    private static String firstNamenn;
    private static String lastNamenn;
    private static String addresss1;
    private static String city;
    private static String zip;

    public CreateTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on address book home page")
    public void im_on_homePage() {
        driver.get("http://a.testaddressbook.com/");

    }
    //System.out.println(driver.getCurrentUrl());

    @When("I click on sign in")
    public void i_Click_SignIn() {
        createPage = new CreatePage(driver);
        createPage.clickSignIn();

    }

    @And("I click Addresses")
    public void i_Click_Addresses() {
        createPage = new CreatePage(driver);
        createPage.clickaddresses();
    }

    @And("I click new Address")
    public void i_Click_NewAddress() {
        createPage = new CreatePage(driver);
        createPage.clickNewAddress();
    }

    @And("I create new address with {string}, {string}, {string}, {string}, {string}")
    public void populate_Form(String firstNamen,String lastNamen, String addressone, String city, String zip) {
        createPage = new CreatePage(driver);
        createPage.setFirstName(firstNamen);
        createPage.setLastName(lastNamen);
        createPage.setStreet(address1);
        createPage.setCity(city);
        createPage.setzipCode(zip);
        firstNamenn = firstNamen;
        lastNamenn = lastNamen;
        addresss1 = addressone;
        city =
        zip =

    @And("Click create Address button")
    public void clickCreateAddressButton() {
    }

    @And("Verify address on page")
    public void verifyAddressOnPage() {
    }

    @And("I click List")
    public void iClickList() {
    }

    @And("verify address on page")
    public void verifyAddressOnPage() {
    }
}
