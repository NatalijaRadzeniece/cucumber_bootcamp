package stepDefinitions.day2;

import core.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.AddUserPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class AddUserSteps {
    private WebDriver driver;
    private AddUserPage addUserPage;
    private static String nameUser;
    private static String password;
    private Header header;

    public AddUserSteps(){
        driver = Hooks.driver;
    }
    @Given("Im on Add user page")
    public void on_add_user_page() {
        driver.get("http://thedemosite.co.uk/savedata.php");
    }

    @When("I add username {string} and password {string}")
    public void add_user_data(String name, String pass) {
        addUserPage = new AddUserPage(driver);
        addUserPage.setUserName(name);
        addUserPage.setPassword(pass);
        nameUser = name;
        password = pass;
    }

    @And("click save button")
    public void click_Save_Button() {
        addUserPage.clickSaveButton();
    }

    @Then("username and password appeared on page")
    public void verify_user_data() {
        String data = addUserPage.collectData();
        String[] fullDetails = data.split("\n");
        String user = fullDetails[0].replace("The username: ","");
        String userPass = fullDetails[1].replace("The password: ", "");
        Assert.assertEquals(nameUser, user,"Username not the same");
        Assert.assertEquals(password, userPass,"Password not the same");
    }

    @When("I click on 'Login'")
    public void click_on_login() {
        header = new Header(driver);
        header.clickLogin();

    }

    @And("Add user name and password")
    public void add_data() {
        addUserPage = new AddUserPage(driver);
        addUserPage.setUserName(nameUser);
        addUserPage.setPassword(password);
    }

    @And("click Test login")
    public void click_test_login() {
        addUserPage.clickSaveButton();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @Then("message {string} appeared")
    public void verify_message(String message) {
        Assert.assertTrue(message.equals(addUserPage.getLoginMessage()), "Message not the same");
    }
}
