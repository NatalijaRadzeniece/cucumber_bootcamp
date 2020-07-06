package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.SignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.SignUpPage;
import stepDefinitions.hooks.Hooks;

public class EODTestSteps {

    private WebDriver driver;
    private SignUpPage signUpPage;
    private SignUp signup;


    public EODTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I am on Homepage page")
    public void open_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click on 'Login' button")
    public void click_sign_in() {
        signUpPage = new SignUpPage(driver);
        signUpPage.clickLoginBtn();
    }

    @And("I click 'Sign up'")
        public void click_sign_upp() {
        signup = new SignUp(driver);
        signup.clickSignBtn();
    }

    @And("I add email '1234@test.lv' and password 'test123' and remember")
    public void add_email_and_pw(String email, String passw) {
        {

    }

    }

}
