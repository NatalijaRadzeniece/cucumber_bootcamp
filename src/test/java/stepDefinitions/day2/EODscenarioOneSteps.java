package stepDefinitions.day2;

import core.EODheader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.EODpages.SignInPage;
import pageObject.EODpages.SignUpPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;


public class EODscenarioOneSteps {

    private WebDriver driver;
    private EODheader eodHeader;
    private SignInPage signInPage;
    private SignUpPage signUpPage;
    private static String eMail;
    private static String password;

    public EODscenarioOneSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on Sign in Page")
    public void sign_in_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("click Sign in")
    public void click_sign_in_link() {
        eodHeader = new EODheader(driver);
        eodHeader.clickSignInLink();
    }

    @And("click Sign up")
    public void click_sign_up_link() {
        signInPage = new SignInPage(driver);
        signInPage.clickSignUpLink();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("I add email {string} and password {string}")
    public void create_an_account(String email, String pass) {
        signUpPage = new SignUpPage(driver);
        signUpPage.setEmailandPasword(email, pass);
    }

    @Then("click Sign up button")
    public void click_sign_up_button() {
        signUpPage.clickSignUpButton();
    }

    @Then("click Sign out")
    public void click_sign_out_link() {
        eodHeader.clickSignOutLink();
    }

}
