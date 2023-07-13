package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage {
    WebDriver driver;
   // WebDriverWait wait;
    String frame = "mce_0_ifr";
    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
  //  private By locateContentMsg = By.xpath("//p[contains(text(), 'Your content goes here.')]");
    private By newField = By.xpath("//p[text()='hello']");
  //p[text()='hello']
    private By locateContentMsg= By.cssSelector(".mce-content-body");
   private By field = By.id("tinymce");


    public void clearContent(){
        switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tinymce"))));
        driver.findElement(field).clear();
        switchToParentFrame();

    }

    public void insertText(){
        switchToFrame();
        driver.findElement(field).sendKeys("Hello World");
        switchToParentFrame();

    }

    public void switchToFrame(){
        driver.switchTo().frame(frame);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }




}
