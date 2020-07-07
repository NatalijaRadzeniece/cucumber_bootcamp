package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUp extends BaseCore {
    public SignUp(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Sign up')]")
    private WebElement signUpBtn;

    public void clickSignBtn() {
        signUpBtn.click();
    }

    @FindBy(how = How.NAME, using = "user[email]")
    private WebElement emaiL;

    public void setEmail(String email) {
        emaiL.sendKeys(email);
    }

    @FindBy(how = How.NAME, using = "user[password]")
    private WebElement passWord1;

    public void setPassWord1(String passw) {
        passWord1.sendKeys(passw);
    }

    @FindBy(how = How.CSS, using = "[data-test=\"submit\"]")
    private WebElement userSignUpBtn;

    public void clickUserSignUpbtn() {
        userSignUpBtn.click();
    }
}

