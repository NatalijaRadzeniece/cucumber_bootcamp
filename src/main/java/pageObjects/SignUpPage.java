package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage extends BaseCore {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.ID, using = "sign-in")
    private WebElement signInBtn;

    @FindBy(how = How.NAME, using = "session[email]")
    private WebElement emailLogin;

    @FindBy(how = How.NAME, using = "session[password]")
    private WebElement passWordLogin;

    @FindBy(how = How.NAME, using = "commit")
    private WebElement signInUserBtn;

    public void clickLoginBtn(){
        signInBtn.click();
    }

    public void enterEmail(String email){
        emailLogin.sendKeys(email);
    }
    public void enterPassword(String passw){
        passWordLogin.sendKeys(passw);
    }

    public  void clickSignInUserBtn(){
        signInUserBtn.click();
    }

}
