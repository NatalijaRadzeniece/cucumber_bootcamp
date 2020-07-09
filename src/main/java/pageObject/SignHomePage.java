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

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/div[1]/a[2]")
    private WebElement addressesClick;

    public void clickSignOut() {
        waitElementAppeared(logOut);
        logOut.click();
    }

    public void addresClick() {
        addressesClick.click();
    }

}
