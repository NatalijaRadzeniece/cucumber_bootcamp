package stepDefinitions.day2;

import core.BaseCore;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EODHomePage;
import pageObjects.EODPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class EODSteps {
    private WebDriver driver;
    private WebDriverWait wait;
    private EODHomePage eodHomePage;
    private EODPage eodPage;
    private static String emailName;
    private static String passName;

    public EODSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on a Homepage")
    public void on_homepage() {
        driver.get("http://a.testaddressbook.com/");
        Assertions.assertEquals("Welcome to Address Book", driver.findElement(By.xpath("//h1")).getText(), "Welcome message does not appear/");
    }

    @When("I click sign in")
    public void click_sign_in() {
        eodHomePage = new EODHomePage(driver);
        eodHomePage.clickSignInOnHomePage();
    }

    @And("I click sign up")
    public void click_sign_up() {
        eodPage = new EODPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        eodPage.clickSignUp();
    }

    @And("I add email {string} and password {string}")
    public void add_email_and_password(String email, String pass) {
        eodPage.setEmail(email);
        eodPage.setPassword(pass);
        emailName = email;
        passName = pass;
        System.out.println(emailName);
        //eodPage.waitTextToBeInElement(driver.findElement(By.xpath("//input[@type='email']")), emailName);
    }

    @And("I click Sign up button")
    public void click_sign_up_button() {
        eodPage.clickSignUpTwo();
    }
}
