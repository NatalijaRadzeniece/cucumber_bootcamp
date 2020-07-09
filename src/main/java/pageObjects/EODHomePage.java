package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODHomePage extends BaseCore {

    public EODHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='sign-in']")
    private WebElement signInButton;

    public void clickSignIn(){
        waitForElementAppeared(signInButton);
        signInButton.click();
    }
}
