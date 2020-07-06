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
    private WebElement signUpBtnn;

    public void clickSignBtn() {
        signUpBtnn.click();
    }

}
