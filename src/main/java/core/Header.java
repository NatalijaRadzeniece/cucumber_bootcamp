package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends BaseCore {

    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'4. Login')]")
    private WebElement loginLink;


    public void clickLogin() {
        loginLink.click();
    }
}

