package testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class frameWork {

   public WebDriver driver;
protected HomePage homePage;
   @BeforeClass
    public void setup(){
       WebDriverManager.chromedriver().setup();
       driver  = new ChromeDriver();
       homePage = new HomePage(driver);
       driver.get("https://the-internet.herokuapp.com/");

    }

    @BeforeMethod
    public void goHome(){
       driver.get("https://the-internet.herokuapp.com/");
    }

//    @AfterClass
//    public void quit(){
//       driver.quit();
//    }
}
