package pageObjects.finalWork;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressHomePage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@id='sign-in']")
    private WebElement signIn;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign up')]")
    private WebElement signUp;

    @FindBy(how = How.XPATH, using = "//input[@id='user_email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='user_password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='commit']")
    private WebElement signUpTwo;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
    private WebElement signOut;


    public AddressHomePage(WebDriver driver) {
        super(driver);
    }

    public void setSignIn() {
        signIn.click();

    }
    public void setSignUp() {
        signUp.click();
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }


    public void setSignUpTwo() {
        signUpTwo.click();
    }

    public void setsignOut() {
        signOut.click();
    }
}






