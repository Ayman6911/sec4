package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.awt.Color.red;

public class checkBoxesPage {
    WebDriver driver;
    public checkBoxesPage(WebDriver driver){
        this.driver = driver;
    }
    ////////Locators/////
    private By firstBox=By.xpath("//input[@type='checkbox'][1]");
    private By secBox = By.xpath("//input[@type='checkbox'][2]");

    public void markOnFirstBox(){
        driver.findElement(firstBox).click();

    }

    public void secBox(){
        WebElement red = driver.findElement(secBox);
        if(red.isSelected()){
            System.out.println("the second checkbox is selected. Return: " +red.isSelected());
        }




    }
    }


