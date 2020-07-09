package pageObjects.finalWork;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressHomePage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@id='sign-in']")
    private WebElement signIn;

    @FindBy(how = How.XPATH, using = "//*[@id='session_email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@id='session_password']")
    private WebElement password;

//    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div/form/div[4]/a")
//    private WebElement signUp;

    @FindBy(how = How.XPATH, using = "//input[@name='commit']")
    private WebElement signInEnter;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
    private WebElement signOut;


    public AddressHomePage(WebDriver driver) {
        super(driver);
    }

    public void setSignIn() {
        signIn.click();

    }
//    public void setSignUp() {
//        signUp.click();
//    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void setSignInEnter(){
        signInEnter.click();
    }


    public void setsignOut() {
        signOut.click();
    }
}






