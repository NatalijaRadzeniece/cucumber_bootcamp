package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCore {

    private WebDriver driver;
    private WebDriverWait wait;

    public BaseCore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, 10);
    }
    public void waitTextTobeInElement(WebElement element,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }
}
