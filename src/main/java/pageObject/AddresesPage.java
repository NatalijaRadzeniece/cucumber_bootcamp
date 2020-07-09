package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddresesPage extends BaseFunc {

    public AddresesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement NewAddress;


    public void NewAddress() {
        NewAddress.click();
    }
}
