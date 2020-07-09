package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForCheck extends BaseFunc {

    public ForCheck(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement check;

    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
    private WebElement list;

    public String getVerifyMessage() {
        return check.getText();
    }

    public void clickList() {
        list.click();
    }

}
