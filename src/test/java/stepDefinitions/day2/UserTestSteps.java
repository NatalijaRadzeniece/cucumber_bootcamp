package stepDefinitions.day2;

import core.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObjects.AddUserPage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;


public class UserTestSteps {
    private WebDriver driver;
    private AddUserPage addUserPage;
    private String nameUser;
    private String password;
    private Header header;

    public UserTestSteps() {
        driver = Hooks.driver;
    }

    @Given("Im on Add user Page")
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
    public void click_save_button() {
        addUserPage.clickSaveButton();
    }

    @Then("username and password appeared on page")
    public void verify_user_data() {
        String data = addUserPage.collectData();
        String[] fullDetails = data.split("\n");
        String user = fullDetails[0].replace("The username: ", "");
        String userPass = fullDetails[1].replace("The password: ", "");
        Assertions.assertEquals(nameUser, user, "User Name not the same");
        Assertions.assertEquals(password, userPass, "Password not the same");
    }

    @When("I click on 'Login'")
    public void click_on_login() {
        header = new Header(driver);
        header.clickLogin();
    }

    @And("Add user name {string} and password {string}")
    public void add_data(String userName, String password) {
        addUserPage = new AddUserPage(driver);
        addUserPage.setUserName(userName);
        addUserPage.setPassword(password);
    }

    @And("click Test login")
    public void click_test_login() {
        addUserPage.clickSaveButton();
    }

    @Then("message {string} appeared")
    public void verify_message(String message) {
        Assertions.assertTrue(message.equals(addUserPage.getLoginMessage()), "Message not the same");
    }
}
