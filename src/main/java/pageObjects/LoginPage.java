package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseFunc {

    @FindBy(how = How.NAME, using = "username")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    public LoginPage(WebDriver driver){
        super(driver);
    }
}
