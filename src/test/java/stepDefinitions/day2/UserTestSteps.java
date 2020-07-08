package stepDefinitions.day2;

import core.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObject.AddUserPage;
import pageObject.LoginPage;
import stepDefinitions.hooks.Hooks;

public class UserTestSteps {
    private WebDriver driver;
    private AddUserPage addUserPage;
    private static String nameUser;
    private static String password;
    private Header header;
    private LoginPage loginPage;

    public UserTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on Add user Page")
    public void open_page() {
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
        Assertions.assertEquals(nameUser, user, "User Name is not the same");
        Assertions.assertEquals(password, userPass, "Password is not the same");

    }

    @When("I click on 'Login'")
    public void click_login() {
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
    }

    @Then("message {string}")
    public void message(String message) {
        loginPage = new LoginPage(driver);
        Assertions.assertTrue(message.equals(loginPage.getLoginMessage()), "Message not the same");
    }
}
