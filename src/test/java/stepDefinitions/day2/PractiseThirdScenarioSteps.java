package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObjects.PractiseSecondScenarioPage;
import pageObjects.PractiseThirdScenarioPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class PractiseThirdScenarioSteps {

    private WebDriver driver;
    private PractiseThirdScenarioPage thirdScenarioPage;
    private PractiseThirdScenarioPage clickDestroy;
    private static String email;
    private static String addPassword;

    public PractiseThirdScenarioSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on the Page")
    public void im_on_this_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I press sign in")
    public void i_press_sign_in() {
        thirdScenarioPage = new PractiseThirdScenarioPage(driver);
        thirdScenarioPage.clickOnSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I type in email {string} and password {string}")
    public void i_type_inside(String data, String password) {
        thirdScenarioPage.setYourEmail(data);
        thirdScenarioPage.setYourPass(password);
        email = data;
        addPassword = password;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("I click sign in button")
    public void i_click_in_button() {
        thirdScenarioPage.pressToSignIn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("click on adress link")
    public void i_click_on_adress_link() {
        thirdScenarioPage.pressAddresses();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("destroy one adress")
    public void destroy_one_adress() {
        clickDestroy = new PractiseThirdScenarioPage(driver);
        clickDestroy.destroyOneAdress(1);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
    }

    @Then("message {string} appears this")
    public void verify(String text) {
            Assertions.assertTrue(text.equals(thirdScenarioPage.assertMessageAppers()), "Message are not the same");
    }
}
