package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage {
    WebDriver driver;
    public dynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    ///////Locators////

private By locateExampleOne = By.xpath("//a[contains(text(),'Example 1')]");
   // private By locateExampleOne = By.xpath("//a[@href='/dynamic_loading/1']");

    /////Actions////
    public OnePageDynamicLoad clickOnExample(){
        driver.findElement(locateExampleOne).click();
        return new OnePageDynamicLoad(driver);
    }
}
