package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnePageDynamicLoad {
    WebDriver driver;
    WebDriverWait wait;
    public OnePageDynamicLoad(WebDriver driver) {
        this.driver = driver;
    }

    private By locateStartButton = By.cssSelector("#start button");
    private By endMsg = By.cssSelector("#finish h4");
    private By loadingBar = By.cssSelector("#loading");
    /////Action///

    public void clickOnStartButton(){
        driver.findElement(locateStartButton).click();
    }
    public String EndMessage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
     // wait.until(ExpectedConditions.visibilityOf(driver.findElement(endMsg)));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));

        String text = driver.findElement(endMsg).getText();
        return text;
    }


    }


