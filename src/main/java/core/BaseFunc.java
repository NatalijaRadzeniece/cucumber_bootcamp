package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunc {

    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void waitTextToBeInElement(WebElement element,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitElementAppeared(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
