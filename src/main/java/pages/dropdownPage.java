package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownPage {
    WebDriver driver;
    Select select;
    public dropdownPage(WebDriver driver){
        this.driver=driver;
    }
    ///////Locators////
    private By locateSelect = By.xpath("//select");

    /////Actions/////
    public void select(int index){
        select = new Select(driver.findElement(locateSelect));
        select.selectByIndex(index);  ///by index
      // select.selectByValue("1");     //// value
       // select.selectByVisibleText("Option 1"); ///By visible text
    }
}
