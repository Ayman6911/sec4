package fileUploadTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.fileUploadPage;
import testbase.frameWork;

import static org.testng.Assert.assertTrue;

public class fileUploadTests extends frameWork {

    String expect = "File Uploaded!";


    @Test
    public void testUpLoadFile(){
        fileUploadPage uploadPage = homePage.clickOnFileUpload();
        uploadPage.upLoadImg();
        String actual = uploadPage.getActualMsg();
        assertTrue(actual.contains(expect));
    }
}
