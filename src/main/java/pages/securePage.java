package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class securePage {
    WebDriver driver;
    public securePage(WebDriver driver){
        this.driver=  driver;
    }
////Locators////
    private By locateMsg = By.id("flash");

    ////Action///
    public String getLoggedText(){
       String loggedText = driver.findElement(locateMsg).getText();
        return loggedText ;
    }




}
