package pageObject;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseCore {

    @FindBy(how = How.NAME, using ="username")
    private WebElement userName;

    @FindBy(how = How.NAME, using ="password")
    private WebElement password;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
