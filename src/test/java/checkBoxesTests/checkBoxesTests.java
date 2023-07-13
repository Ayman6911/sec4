package checkBoxesTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.checkBoxesPage;
import testbase.frameWork;

public class checkBoxesTests extends frameWork {
WebDriver driver;
@Test
    public void checkFirstBox(){
    checkBoxesPage obj = homePage.clickOnCheckBoxes();
    obj.markOnFirstBox();
    obj.secBox();
}

// @Test
//         public void  checkIfSecBoxIsChecked(){
//     checkBoxesPage obj = homePage.clickOnCheckBoxes();



 }



