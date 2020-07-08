package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends BaseFunc {

    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement pressSignOut;

    public void clickSignOut() {
        pressSignOut.click();
    }
}
