package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class javaScriptAlertsPage {
    WebDriver driver;
    WebDriverWait wait;
    public javaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By locateJavaScriptAlert = By.xpath("//button[@onclick='jsAlert()']");
private By locateJavaConfirm = By.xpath("//button[@onclick='jsConfirm()']");
    private By locatePromt = By.xpath("//button[@onclick='jsPrompt()']");
    private By validationMsg = By.id("result");


//    public void clickOnPromote(){
//        driver.findElement(locatePromt).click();
//    }

    public void clickOnButton(By linkTextButton){
        driver.findElement(linkTextButton).click();
    }

    public String clickOnJavaScriptAlert(){
        clickOnButton(locateJavaScriptAlert);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println("the Alert msg is: "+alertText);
        return alertText;
    }


    public void clickOnJavaConfirm(){
        clickOnButton(locateJavaConfirm);
    }
    public void acceptJavaConfirm(){
        driver.switchTo().alert().accept();
    }

    public String getValidationMsg(){
       return driver.findElement(validationMsg).getText();
    }
    public void clickOnJavaPrompt(){
        clickOnButton(locatePromt);
    }
    public void sendKeyPrompt(String name){
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
    }
    public void cancelPrompt(){
        driver.switchTo().alert().dismiss();
    }











}
