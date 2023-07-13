package alertsTests;

import org.testng.annotations.Test;
import pages.javaScriptAlertsPage;
import testbase.frameWork;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class alertTests extends frameWork {

    @Test
    public void javaScriptAlert(){
        javaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptAlert();
        javaScriptAlertsPage.clickOnJavaScriptAlert();
    }
    @Test
    public void javaScriptConfirm(){
        javaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptAlert();
        javaScriptAlertsPage.clickOnJavaConfirm();
        javaScriptAlertsPage.acceptJavaConfirm();
        String actualResult = javaScriptAlertsPage.getValidationMsg();
        String expectedResult = "You clicked: Ok";
        assertEquals(actualResult,expectedResult);

    }
    @Test
    public void javaScriptPrompt(){
        javaScriptAlertsPage javaScriptAlertsPage = homePage.clickOnJavaScriptAlert();
        javaScriptAlertsPage.clickOnJavaPrompt();
        String sentKey = "ayman";
        javaScriptAlertsPage.sendKeyPrompt(sentKey);
        String actualResult = javaScriptAlertsPage.getValidationMsg();
        String expected = "You entered: ayman";
        assertEquals(actualResult,expected);
    }
    @Test
    public  void javaPromptCancelNull(){
        javaScriptAlertsPage javaScriptAlertsPage =homePage.clickOnJavaScriptAlert();
        javaScriptAlertsPage.clickOnJavaPrompt();
        javaScriptAlertsPage.cancelPrompt();
        String expectedResult = "You entered: null";
        String actualResult = javaScriptAlertsPage.getValidationMsg();
        assertEquals(actualResult,expectedResult);
    }
}
