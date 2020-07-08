package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticePage extends BaseFunc {

    @FindBy(how = How.CSS, using = "[id='sign-in']")
    private WebElement pressSignIn;

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement pressSignUp;

    @FindBy(how = How.CSS, using = "[id='user_email']")
    private WebElement insertEmail;

    @FindBy(how = How.CSS, using = "[id='user_password']")
    private WebElement insertPassword;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
    private WebElement applyEmailandPassword;


    public PracticePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn() {
        pressSignIn.click();
    }

    public void clickSignUp() {
        pressSignUp.click();
    }

    public void setEmail(String email) {
        insertEmail.sendKeys(email);
    }

    public void setPass(String password) {
        insertPassword.sendKeys(password);
    }

    public void applyData() {
        applyEmailandPassword.click();
    }


}
