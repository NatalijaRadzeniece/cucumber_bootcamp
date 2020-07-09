package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends BaseFunc {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "user_email")
    private WebElement email;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "commit")
    private WebElement signUp;



    public void setEmail(String Email) {
        waitElementAppeared(email);
        email.sendKeys(Email);
    }

    public void setPassword(String Password) {
        password.sendKeys(Password);
    }

    public void clickSignUp() {
        signUp.click();
    }
}
