package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderFirst extends BaseFunc {

    public HeaderFirst(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[href='login.php']")
    private WebElement loginLink;

    public void clickLogin() {
        loginLink.click();
    }

}

