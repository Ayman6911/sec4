package dropDownTests;

import org.testng.annotations.Test;
import pages.dropdownPage;
import testbase.frameWork;

public class dropdownTests extends frameWork {

    @Test
    public void dropdownTest(){
        dropdownPage dropdownPage = homePage.clickOnDropdown();
        int x = 1;
        dropdownPage.select(x);
    }
}
