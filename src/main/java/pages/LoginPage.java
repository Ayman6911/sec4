package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    /////locators////
    private By locateUserNameField = By.id("username");
    private By locatePassword = By.id("password");
    private By locateLoginButton = By.className("fa");

    /////Actions////
    public void insertUserName(String user){
        driver.findElement(locateUserNameField).sendKeys(user);
    }
    public void insertPassword(String password){
        driver.findElement(locatePassword).sendKeys(password);
    }
    public securePage clickOnLoginButton(){
        driver.findElement(locateLoginButton).click();
        return new securePage(driver);
    }
}
