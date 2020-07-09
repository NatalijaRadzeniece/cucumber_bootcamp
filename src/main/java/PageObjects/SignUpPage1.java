package PageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage1 extends BaseCore {
    public SignUpPage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "user_email")
    private WebElement email;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@value='Sign up']")
    private WebElement signUpButton;

    public void EnterDataEmail(String textToSend) {
        email.clear();
        email.sendKeys(textToSend);
    }

    public void EnterDataPass(String textToSend) {
        password.clear();
        password.sendKeys(textToSend);
    }

    public void ClickSignUpButton() {

        signUpButton.click();
    }
}
