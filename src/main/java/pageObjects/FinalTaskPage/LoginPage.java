package pageObjects.FinalTaskPage;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BaseFunc {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpButton;

    @FindBy(how = How.ID, using = "user_email")
    private WebElement signUpEmailField;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement signUpPasswordField;

    @FindBy(how = How.ID, using = "session_email")
    private WebElement signInEmailField;

    @FindBy(how = How.ID, using = "session_password")
    private WebElement signInPasswordField;

    @FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Sign up']")
    private WebElement signUpConfirmationButton;

    @FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Sign in']")
    private WebElement signInpConfirmationButton;

    public void registerNewUser(String email, String password) {
        signUpButton.click();
        typeNewText(signUpEmailField, email);
        typeNewText(signUpPasswordField, password);
        signUpConfirmationButton.click();
    }

    public void loginUser(String email, String password) {
        typeNewText(signInEmailField, email);
        typeNewText(signInPasswordField, password);
        signInpConfirmationButton.click();
    }
}
