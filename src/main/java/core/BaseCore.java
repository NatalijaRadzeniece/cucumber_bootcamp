package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseCore {

    private WebDriver driver;
    private WebDriverWait wait;
    private Alert alert;
    public BaseCore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void waitTextToBeInElement(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitForElementAppeared(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void acceptAlert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }




}
