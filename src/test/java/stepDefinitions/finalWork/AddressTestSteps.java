package stepDefinitions.finalWork;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.finalWork.AddressHomePage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class AddressTestSteps {

    private WebDriver driver;
    private AddressHomePage addressHomePage;
    private static String emailUser;
    private static String password;
    private AddressHomePage goToSignUp;


    public AddressTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on address book home page")
    public void im_on_homePage() {
        driver.get ("http://a.testaddressbook.com/");

    }

    @When("I click sign in")

    public void i_Click_SignIn() {
        addressHomePage = new AddressHomePage(driver);
        addressHomePage.setSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click sign up")
    public void i_Click_Sign_Up() {
        addressHomePage = new AddressHomePage(driver);
        addressHomePage.setSignUp();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("Add email {string} and password {string}")
    public void add_user_data(String mail, String pass){
        addressHomePage = new AddressHomePage(driver);
        addressHomePage.setEmail(mail);
        addressHomePage.setPassword(pass);
        emailUser = mail;
        password = pass;

    }

    @And("Click sign up")
    public void clickSignUp() throws InterruptedException {
        addressHomePage.setSignUpTwo();
        Thread.sleep(3000);
    }


    @Then("Click sign out")
    public void clickSignOut() {
        addressHomePage.setsignOut();

    }
}
