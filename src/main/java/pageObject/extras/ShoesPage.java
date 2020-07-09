package pageObject.extras;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShoesPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//div[text()='Leather/Non Leather']")
    private WebElement leatherFilter;

    @FindBy(how = How.XPATH, using = "//div[text()='Size']")
    private WebElement sizeFilter;

    @FindBy(how = How.XPATH, using = "//div[text()='Brand']")
    private WebElement brandFilter;

    @FindBy(how = How.XPATH, using = "//li[@class='_3LB03xF']")
    private WebElement leatherOptions;

    @FindBy(how = How.XPATH, using = "//label[text()='Leather']")
    private WebElement leather;

    public ShoesPage(WebDriver driver) {
        super(driver);
    }

    public void clickLeatherFilter() {
        waitElementAppeared(leatherFilter);
        leatherFilter.click();
    }

    public void clickSizeFilter() {
        sizeFilter.click();
    }

    public void clickBrandFilter() {
        brandFilter.click();
    }

    public void filterLeather(){
        leather.click();

    }

}
