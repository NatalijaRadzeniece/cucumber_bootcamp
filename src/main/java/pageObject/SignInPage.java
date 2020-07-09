package pageObject;

import com.fasterxml.jackson.databind.ser.Serializers;
import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BaseFunc {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpButton;

    @FindBy(how = How.XPATH, using = "//*[@id='session_email']")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "//*[@id='session_password']")
    private WebElement passwordField;



    public void clickSignInButton() {
        signUpButton.click();
    }

    public void SignIn(String Email, String Password){

        emailField.sendKeys(Email);
        passwordField.sendKeys(Password);
    }
}
