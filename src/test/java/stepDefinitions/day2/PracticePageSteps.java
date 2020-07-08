package stepDefinitions.day2;

import core.Header;
import core.HeaderFirst;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.PracticePage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class PracticePageSteps {

    private WebDriver driver;
    private PracticePage myPracticePage;
    private PracticePage goToSignUp;
    private PracticePage addUserInfo;
    private static String email;
    private static String addPassword;
    private Header header;

    public PracticePageSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I am on this page")
    public void i_am_on_eod_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in")
    public void i_click_sign_in() {
        myPracticePage = new PracticePage(driver);
        myPracticePage.clickSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click sign up")
    public void i_click_sign_up() throws InterruptedException {
        goToSignUp = new PracticePage(driver);
        goToSignUp.clickSignUp();
        Thread.sleep(1000);
    }

    @And("I add email {string} and password {string}")
    public void i_add_data(String name, String pass) {
        myPracticePage.setEmail(name);
        myPracticePage.setPass(pass);
        email = name;
        addPassword = pass;
    }

    @And("I press sign up")
    public void i_press_sign_up() throws InterruptedException {
        myPracticePage.applyData();
        Thread.sleep(5000);
    }

    @Then("I sign out")
    public void press_logOut(){
        header = new Header(driver);
        header.clickSignOut();
    }

}
