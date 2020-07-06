package stepDefinitions.day2;

import core.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.AddUserPage;
import pageObjects.EODpage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class EODSteps {

    private WebDriver driver;
    private EODpage myPracticePage;
    private EODpage addUserInfo;
    private static String email;
    private static String pass;

    public void PageEodSteps() {
        driver = Hooks.driver;
    }

    @Given("I am on EOD page")
    public void i_am_on_eod_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in")
    public void i_click_sign_in() {
        myPracticePage = new EODpage(driver);
        myPracticePage.clickSignIn();
    }

    @And("I click sign up")
    public void i_click_sign_up() {
        myPracticePage = new EODpage(driver);
        myPracticePage.clickSignUp();

    }

    @And("I add email {string} and password {string}")
    public void i_add_data(String name, String password) {
        addUserInfo = new EODpage(driver);
        myPracticePage.setEmail(name);
        myPracticePage.setPass(pass);
        email = name;
        pass = password;
    }

    @And("I press sign up")
    public void i_press_sign_up() {
        myPracticePage.applyData();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I sign out")
    public void i_sign_out() {
    }

}
