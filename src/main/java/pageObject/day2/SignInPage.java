package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpButton;

    @FindBy(how = How.ID, using = "user_email")
    private WebElement email;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "commit")
    private WebElement commitButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpButton(){
        waitElementAppeared(signUpButton);
        signUpButton.click();
    }

    public void setEmail(String eMail){
        waitElementAppeared(email);
        email.sendKeys(eMail);
    }

    public void setPassword(String passWord){
        password.sendKeys(passWord);
    }

    public void clickCommitButton(){
        commitButton.click();
    }
}
