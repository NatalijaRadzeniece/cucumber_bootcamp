package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class Steps {

    WebDriver driver;
    public Steps() {
        this.driver = Hooks.driver;
    }

    @Given("open website")
    public void open_website() {
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
    }
}
