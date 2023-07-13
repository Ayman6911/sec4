package hoverTests;

import org.testng.annotations.Test;
import testbase.frameWork;

import static org.testng.Assert.assertEquals;

public class hoverTests extends frameWork {

    @Test
    public void hoverTest(){
        var hoverPage= homePage.clickOnHoverLink();
        var figureCaption =hoverPage.HoverOnFigure(1);
       String actualName =  figureCaption.getName();
       String actualLink =  figureCaption.getLink();
       String expectedName = "name: user1";
       String expectedLink = "View profile";
       assertEquals(actualLink,expectedLink);
       assertEquals(actualName,expectedName);


    }
}
