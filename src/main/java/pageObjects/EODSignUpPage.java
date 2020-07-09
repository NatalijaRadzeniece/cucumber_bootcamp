package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODSignUpPage extends BaseCore {

    public EODSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "user_email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id='new_user']/div[3]/input")
    private WebElement signUpButton;

    public void setEmail(String email){
        waitForElementAppeared(emailField);
        emailField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickSignUp(){
        signUpButton.click();
    }

}
