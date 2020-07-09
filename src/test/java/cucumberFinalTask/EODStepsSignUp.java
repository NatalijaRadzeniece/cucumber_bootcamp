package cucumberFinalTask;


import Core.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.hooks.Hooks;


public class EODStepsSignUp {
    WebDriver driver;
    private Login login;

    public EODStepsSignUp(Login login) {
        this.driver = Hooks.driver;
        this.login = login;
    }

    @Given("I'm on testaddressbook main page")
    public void open_website() {
        driver.get("http://a.testaddressbook.com/");
        System.out.println(driver.getCurrentUrl());
    }

    @When("I click on Sign In")
    public void click_signin() {
        driver.findElement(By.xpath("//*[@id='sign-in']")).click();
    }

    @And("Click on Sign Up")
    public void click_signup() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-test='sign-up']"))).click();
    }

    @And("Insert {string} and {string}")
    public void populate_signup() {
        String email = login.getEmail();
        String password = login.getPassword();
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='session[email]']"))).sendKeys(email);
        driver.findElement(By.id("user_password")).sendKeys(password);
    }

    @And("Click Sign Up")
    public void sign_up(){
        driver.findElement(By.xpath("//input[@value='Sign up']")).click();
    }

//    @Then("Welcome message {string} appears")
//    public void welcome_message(){
//        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/h1")));
//        Assertions.assertEquals("Welcome to Address Book " +
//                "A simple web app for showing off your testing", driver.findElement(By.xpath("/html/body/div/div/h1")).getText());

    @Then("Click Sign Out")
    public void sign_out(){
        driver.findElement(By.xpath("//a[@data-method='delete']")).click();
    }

}
