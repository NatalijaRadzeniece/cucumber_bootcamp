package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.hooks.Hooks;

public class FirstSteps {

    private WebDriver driver;
//    private WebDriverWait wait;
    public FirstSteps() {
        this.driver = Hooks.driver;
    }
    @Given("open site HeroKuapp")
    public void  open_site(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }
    @When("I click Add button")
    public void click_button(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void verify_button_added(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete' not added");
    }

    @Given("open site book.theautomatedtester")
    public void open_site2(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @When("I click Chapter2 link")
    public void click_link(){
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }
    @Then("Button with name appeared")
    public void verify_button_appeared(){
//        wait=new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Button with name']"))));
        Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Button with name']")).isDisplayed(), "'Button with the name' is not visible");
    }

}
