package pageObject.EODpages;

import core.BaseFunc;
import model.EODUserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpLink;

    @FindBy(how = How.XPATH, using = "//input[@data-test='submit']")
    private WebElement signInButton;

    @FindBy(how = How.ID, using = "session_email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "session_password")
    private WebElement passwordField;


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpLink() {
        waitElementAppeared(signUpLink);
        signUpLink.click();
    }

//    public EODUserData addEmailAndPassword() {
//        EODUserData user = new EODUserData();
//        emailField.sendKeys(user.getEmail());
//        passwordField.sendKeys(user.getPassword());
//        return user;
//    }

    public void addEmailAndPassword(String email, String password) {
        waitElementAppeared(emailField);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
