package pageObjects;

import core.BaseFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseFunctions {

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "FormsButton2")
    private WebElement saveButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
