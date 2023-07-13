package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class fileUploadPage {
    WebDriver driver;
    public fileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    //////Locators////
    private By locateUploadBtn = By.id("file-upload");
    private By locateSubmitBtn = By.id("file-submit");
    private  By locateMsg = By.tagName("h3");
    //////Action////
    public void upLoadImg(){
        driver.findElement(locateUploadBtn).sendKeys("C:\\Users\\w11\\Desktop\\img\\11.jpg");
        driver.findElement(locateSubmitBtn).click();
    }
    public String getActualMsg(){
        String text = driver.findElement(locateMsg).getText();
        return  text;
    }
}
