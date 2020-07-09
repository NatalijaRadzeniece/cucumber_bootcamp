package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignHomePage extends BaseFunc {

    public SignHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement logOut;

    public void clickSignOut() {
        waitElementAppeared(logOut);
        logOut.click();
    }

}
