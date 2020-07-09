package PageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BaseCore {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement password;

    @FindBy(how = How.LINK_TEXT, using = "Sign up")
    private WebElement signUpLink;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign in']")
    private WebElement signInButton;

    public void ClickSignUpLink() {

        signUpLink.click();
    }

    public void EnterDataEmail(String textToSend) {
        email.clear();
        email.sendKeys(textToSend);
    }

    public void EnterDataPass(String textToSend) {
        password.clear();
        password.sendKeys(textToSend);
    }
    public void ClickSignInButton() {

        signInButton.click();
    }

    public void clickAlert() {

        signInButton.click();
    }

    //public void acceptAlert(){

        //signInButton.acceptAlert();
    //}
}
