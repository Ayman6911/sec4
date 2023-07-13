package loginTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.securePage;
import testbase.frameWork;

import static org.testng.Assert.assertTrue;

public class LoginTests extends frameWork {
WebDriver driver;
        String validUser = "tomsmith";
        String invalidUser= "AbBC";
        String validPass ="SuperSecretPassword!";
        String invalidPass ="Aym@n";




    @Test
    public void validLogin(){
       LoginPage loginPage = homePage.clickOnFormAuthentication();
       loginPage.insertPassword(validPass);
       loginPage.insertUserName(validUser);
        securePage securePage = loginPage.clickOnLoginButton();
        String actualResult = securePage.getLoggedText();
        String expectedResult = "You logged into a secure area!";
        assertTrue (actualResult.contains(expectedResult));
    }

//    @Test
//    public void invalidLogin(){
//        LoginPage obj = homePage.clickOnFormAuthentication();
//        obj.insertUserName(invalidUser);
//    }




}
