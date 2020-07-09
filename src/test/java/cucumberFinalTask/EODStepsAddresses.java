package cucumberFinalTask;

import Core.Login;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.hooks.Hooks;

public class EODStepsAddresses {
    WebDriver driver;
    private Login login;

    public EODStepsAddresses(Login login) {
        this.driver = Hooks.driver;
        this.login = login;
    }

    @When("I click sign in")
    public void sign_in() {
        driver.findElement(By.xpath("//*[@id='sign-in']")).click();
    }

    @And("insert {string} and {string} from previous test")
    public void populate_signin() {
        String email = login.getEmail();
        String password = login.getPassword();
        new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='user[email]']"))).sendKeys(email);
        driver.findElement(By.id("session_password")).sendKeys(password);
    }

    @And("I click on sign in")
    public void click_sign_in() {
        driver.findElement(By.xpath("//input[@data-test='submit']")).click();
    }

    @And("click Addresses")
    public void click_addresses(){
        driver.findElement(By.xpath("//a[@data-test='addresses']")).click();
    }

    @And("click new Address")
    public void click_new_address(){
        driver.findElement(By.xpath("//a[@data-test='create']")).click();
    }

    @And("populate form")
    public void populate_form(){
        driver.findElement(By.xpath("//input[@id='address_first_name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='address_last_name']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@id='address_street_address']")).sendKeys("Address 1");
        driver.findElement(By.xpath("//input[@id='address_secondary_address']")).sendKeys("Address 2");
        driver.findElement(By.xpath("//input[@id='address_city']")).sendKeys("City");
        driver.findElement(By.xpath("//select[@id='address_state']")).click();
        driver.findElement(By.xpath("//option[@value='FL']")).click();
        driver.findElement(By.xpath("//input[@id='address_zip_code]'")).sendKeys("ZIP");
        driver.findElement(By.xpath("//input[@id='address_country_us']")).click();
    }




}

