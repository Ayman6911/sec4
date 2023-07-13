package utilis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class figureCaption {
    WebElement caption;
    public figureCaption(WebElement caption) {
        this.caption = caption;
    }
    private By locateName = By.tagName("h5");
    private By link = By.tagName("a");

    public String getName(){
       return caption.findElement(locateName).getText();
    }
    public String getLink(){
        return caption.findElement(link).getText();
    }

}
