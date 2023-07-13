package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilis.figureCaption;


public class hoverPage {
    WebDriver driver;
   Actions actions;
    public hoverPage(WebDriver driver) {
        this.driver= driver;
    }
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");


    public figureCaption HoverOnFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        actions = new Actions(driver);
        actions.moveToElement(figure).build().perform();
        return new figureCaption(figure.findElement(boxCaption));

    }


}
