package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class EODSignInPage extends BaseCore {

    public EODSignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='clearance']/div/div/form/div[4]/a")
    private WebElement signUpButton;

    @FindBy(how = How.XPATH, using = "//*[@id='session_email']")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "//*[@id='session_password']")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id='clearance']/div/div/form/div[3]/input")
    private WebElement signInButton;


    public void clickSignUp(){
        waitForElementAppeared(signUpButton);
        signUpButton.click();
    }
    public void logIn(String email, String password){
        waitForElementAppeared(emailField);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickSignInButton(){
        signInButton.click();
    }

}
