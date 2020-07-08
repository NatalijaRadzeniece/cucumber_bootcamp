package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    private WebElement email2;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement password2;

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpButton;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign in']")
    private WebElement signInButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail2(String eMailIn) {
        waitElementAppeared(email2);
        email2.sendKeys(eMailIn);
    }

    public void setPassword2(String passWordIn) {
        password2.sendKeys(passWordIn);
    }

    public void clickSignUpButton() {
        waitElementAppeared(signUpButton);
        signUpButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
