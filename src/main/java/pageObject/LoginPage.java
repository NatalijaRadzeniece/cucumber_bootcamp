package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'ogin')]")
    private WebElement loginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getLoginMessage() {
        return loginMessage.getText();
    }
}
