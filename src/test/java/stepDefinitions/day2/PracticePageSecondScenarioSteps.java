package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.PractiseSecondScenarioPage;
import stepDefinitions.hooks.Hooks;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PracticePageSecondScenarioSteps {

    private WebDriver driver;
    private PractiseSecondScenarioPage secondScenarioSteps;
    //    private PractiseSecondScenarioPage populateFields;
    private static String email;
    private static String addPassword;

    public PracticePageSecondScenarioSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I am on a page")
    public void i_am_on_this_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I go to sign in")
    public void i_go_to_sign_up() throws InterruptedException {
        secondScenarioSteps = new PractiseSecondScenarioPage(driver);
        secondScenarioSteps.clickToSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I add email {string} and password {string} from previous test")
    public void i_add_data(String name, String pass) {
        secondScenarioSteps.setEmail(name);
        secondScenarioSteps.setPass(pass);
        email = name;
        addPassword = pass;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click Sign in")
    public void i_click_sign_in() throws InterruptedException {
        secondScenarioSteps.pressSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Thread.sleep(5000);
    }

    @And("I click Addresses")
    public void i_click_addresses() {
        secondScenarioSteps.pressSAddresses();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click New Address")
    public void i_click_new_address() {
        secondScenarioSteps.pressNewAddress();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I add :")
    public void i_add_value(Map<String, String> data) {
        driver.findElement(By.id("address_first_name")).sendKeys(data.get("First name"));
        driver.findElement(By.id("address_last_name")).sendKeys(data.get("Last name"));
        driver.findElement(By.id("address_street_address")).sendKeys(data.get("adress"));
        driver.findElement(By.id("address_city")).sendKeys(data.get("city"));
        driver.findElement(By.id("address_state")).sendKeys(data.get("state"));
        driver.findElement(By.id("address_zip_code")).sendKeys(data.get("zipcode"));
    }

    @And("click create adress")
    public void i_click_create_address() {
        secondScenarioSteps.pressCreateAddress();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("message {string} appears")
    public void message_appeared(String message) {
        Assertions.assertTrue(message.equals(secondScenarioSteps.getMessageAppeared()), "Message not the same");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click List")
    public void i_click_list() {
        secondScenarioSteps.pressListButton();
    }
//
//    @Then("verify address is added")
//    public void verify_address_added(){
//        Assertions.
//    }
}
