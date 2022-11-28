package pageObjects;

import Tests.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class BasePage {

    protected static WebDriver driver = DriverFactory.getDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    protected static Actions action = new Actions(driver);

    static void FindAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        action.keyDown(element, Keys.CONTROL)
                .sendKeys(element, "a")
                .keyUp(element,Keys.CONTROL)
                .sendKeys(element, Keys.DELETE)
                .build().perform();
        element.sendKeys(inputString);
    }

    static void waitAndClick(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    static boolean elementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    static void findSelectAndSelectByValue(By selector, String valueName) {
        WebElement selectorListWait = wait.until(ExpectedConditions.elementToBeClickable(selector));
        Select selectorList = new Select(selectorListWait);
        selectorList.selectByValue(valueName);
    }

    static void elementCopyPaste(By copyElementSelector, By pasteElementSelector) {
        WebElement copyElement = wait.until(ExpectedConditions.elementToBeClickable(copyElementSelector));
        WebElement pasteElement = wait.until(ExpectedConditions.elementToBeClickable(pasteElementSelector));

        //copy from first element
        action.keyDown(copyElement, Keys.CONTROL)
                .sendKeys(copyElement, "a")
                .sendKeys(copyElement, "c")
                .keyUp(copyElement, Keys.CONTROL);

        //paste to second element
        action.keyDown(pasteElement, Keys.CONTROL);
        action.sendKeys(pasteElement, "v");
        action.keyUp(pasteElement, Keys.CONTROL);
        action.build().perform();
    }

}
