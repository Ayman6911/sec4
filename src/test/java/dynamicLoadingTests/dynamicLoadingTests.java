package dynamicLoadingTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.OnePageDynamicLoad;
import pages.dynamicLoadingPage;
import testbase.frameWork;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class dynamicLoadingTests extends frameWork {

    @Test
    public void dynamic_Loading_Test() throws InterruptedException {
        dynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoad();
      OnePageDynamicLoad onePageDynamicLoad = dynamicLoadingPage.clickOnExample();
        onePageDynamicLoad.clickOnStartButton();
        String actualMsg = onePageDynamicLoad.EndMessage();
        String expectedMsg = "Hello World!";
     assertTrue(actualMsg.contains(expectedMsg));



    }
}
