package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EODPage extends BaseCore {
    private WebDriverWait wait;

    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//a[@href='/sign_up']")
    private WebElement signUp;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement signUpTwo;

    public EODPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String emailName) {
        email.sendKeys(emailName);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public String getEmail() {
        String emailDetails = email.getText();
        return emailDetails;
    }

    public String getPassword() {
        String passwordDetails = password.getText();
        return passwordDetails;
    }

    public void clickSignUp() {
        signUp.click();
    }

    public void clickSignUpTwo() {
        signUpTwo.click();
    }

}
