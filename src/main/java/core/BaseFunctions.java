package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunctions {

    protected WebDriver driver;
    protected WebDriverWait wait10s;
    protected WebDriverWait wait1s;

    public BaseFunctions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait10s = new WebDriverWait(driver, 10);
        wait1s = new WebDriverWait(driver, 1);
    }

    public void waitTextToBeInElement(WebElement element, String text){
        wait10s.until(ExpectedConditions.textToBePresentInElement(element, text));

    }

    protected WebElement waitAndFindElement(By locator){
        wait10s.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }
}
