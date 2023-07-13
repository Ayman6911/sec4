package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver ;
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    //////Locators/////
    private By locateFormAuthentication = By.linkText("Form Authentication");
    private By locateCheckBoxes = By.linkText("Checkboxes");
    private By locateFileUpload = By.linkText("File Upload");
    private By locateDynamicLoading = By.linkText("Dynamic Loading");
    private By dropDownLink = By.linkText("Dropdown");
    private By javaScriptAlert = By.linkText("JavaScript Alerts");
    private By locateWYSIWYGEditor = By.linkText("WYSIWYG Editor");
    private By hoverLink = By.linkText("Hovers");

    ////Actions////

    public LoginPage clickOnFormAuthentication(){
        driver.findElement(locateFormAuthentication).click();
        return new LoginPage(driver);
    }
    public checkBoxesPage clickOnCheckBoxes(){
        driver.findElement(locateCheckBoxes).click();
        return new checkBoxesPage(driver);
    }
    public fileUploadPage clickOnFileUpload(){
        driver.findElement(locateFileUpload).click();
        return new fileUploadPage(driver);
    }
    public dynamicLoadingPage clickOnDynamicLoad (){
        driver.findElement(locateDynamicLoading).click();
        return new dynamicLoadingPage (driver);
    }
    public dropdownPage clickOnDropdown(){
        driver.findElement(dropDownLink).click();
        return new dropdownPage(driver);
    }

//    public javaScriptAlertsPage clickOnJavaScriptAlert(){
//        driver.findElement(javaScriptAlert).click();
//        return new javaScriptAlertsPage(driver);
//    }

    public void clickOnLink(By LinkText){          // Method to click on j.s Script Alert
        driver.findElement(LinkText).click();
    }
    public javaScriptAlertsPage clickOnJavaScriptAlert(){
      clickOnLink(javaScriptAlert);
      return  new javaScriptAlertsPage(driver);
    }

    public WYSIWYGEditorPage clickOnWYSIWYGEditor(){
        clickOnLink(locateWYSIWYGEditor);
        return new WYSIWYGEditorPage(driver);
    }
    public hoverPage clickOnHoverLink(){
        clickOnLink(hoverLink);
        return new hoverPage(driver);
    }





}
