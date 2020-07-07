package stepDefinitions.day2;

import core.EODHeader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.NewAddresPage;
import pageObjects.SignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.SignUpPage;
import stepDefinitions.hooks.Hooks;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EODTestSteps {

    private WebDriver driver;
    private SignUpPage signuppage;
    private EODHeader eodheader;
    private SignUp signup;
    private static String emailUser;
    private static String userPassword;
    private NewAddresPage newaddrespage;
    private WebDriverWait wait;


    public EODTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I am on Homepage page")
    public void open_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click on 'Login' button")
    public void click_sign_in() throws InterruptedException {
        signuppage = new SignUpPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        signuppage.clickLoginBtn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("I click 'Sign up'")
    public void click_sign_upp() {
        signup = new SignUp(driver);
        signup.clickSignBtn();
    }

    @And("I add email {string} and password {string} and remember")
    public void add_email_and_pw(String email, String passw) {
        signup.setEmail(email);
        signup.setPassWord1(passw);
        emailUser = email;
        userPassword = passw;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("For Sign up used Email: " + email + " and password: " + passw);
    }

    @And("I click Sign up button")
    public void userSignUP() {
        signup = new SignUp(driver);
        signup.clickUserSignUpbtn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Then("click 'Sign out'")
    public void click_sign_out() {
        eodheader = new EODHeader(driver);
        eodheader.clickSignOutBtn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //2nd scenario
    @And("i add data from previous test")
    public void add_previus_user_data() {
        signuppage.enterEmail(emailUser);
        signuppage.enterPassword(userPassword);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("For Login used Email: " + emailUser + " and password: " + userPassword);
    }

    @And("i click Login in")
    public void click_Log_in() {
        signuppage.clickSignInUserBtn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click 'Addresses'")
    public void click_address() {
        eodheader = new EODHeader(driver);
        eodheader.clickAddressBtn();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @And("click new Address")
    public void click_new_address() {
        eodheader.clickCreateNewAddressBtn();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("fill {string}, {string}, {string}, {string}, {string}")
    public void fill_new_address_form(String name, String lastname, String address1, String city, String zipcode) {
        driver.findElement(By.id("address_first_name")).sendKeys(name);
        driver.findElement(By.id("address_last_name")).sendKeys(lastname);
        driver.findElement(By.name("address[address1]")).sendKeys(address1);
        driver.findElement(By.id("address_city")).sendKeys(city);
        driver.findElement(By.name("address[zip_code]")).sendKeys(zipcode);

        //driver.findElement(By.name("file")).sendKeys(file);

    }

    @And("click Create Address")
    public void click_Crate_address() {
        newaddrespage = new NewAddresPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        newaddrespage.clickCreateAddressReadyBtn();
    }

    @And("verify if {string}")
    public void verify_if_address_added(String msg) {
        wait = new WebDriverWait(driver, 15);
        WebElement elementz = driver.findElement(By.cssSelector("[class='alert alert-notice']"));
        wait.until(ExpectedConditions.textToBePresentInElement(elementz, msg));
        assertEquals(msg, elementz.getText(), "Possibly address is not created");

    }

    @And("click List")
    public void click_list_btn() {
        driver.findElement(By.cssSelector("[data-test=list]")).click();
    }

    @And("verify address on page")
    public void verify_adresses() {
//        List<WebElement> table = driver.findElement(By.cssSelector("[class=table]"));
//        assertEquals(table.getRowCount(), 3);
//        List<WebElement> info = driver.findElements(By.xpath("//td[contains(text(),'Davis')]"));
//        Assertions.assertEquals("Dāvis, info());
//

    }

}
