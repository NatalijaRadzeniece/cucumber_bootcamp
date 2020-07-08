package pageObject.EODpages;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends BaseFunc {


    @FindBy(how = How.ID, using = "user_email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement passwordField;

    @FindBy(how = How.NAME, using = "commit")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void setEmailandPasword(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

}
