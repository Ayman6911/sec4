package frameTests;

import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;
import testbase.frameWork;

public class frameTest extends frameWork {

    @Test
    public void frameTest()  {
       WYSIWYGEditorPage WYSIWYGEditorPage = homePage.clickOnWYSIWYGEditor();
      // Thread.sleep(3000);
       WYSIWYGEditorPage.clearContent();
        WYSIWYGEditorPage.insertText();
    }
}
