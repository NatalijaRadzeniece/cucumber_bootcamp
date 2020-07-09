package Core;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class BaseFunc {

    private WebDriver driver;
    private WebDriverWait wait;
    public BaseFunc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForTextToBeInElement(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
