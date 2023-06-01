package resultVerification;

import commanPages.Utils;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import webElements.RegisterPage;

public class ResultVerificationforRegisterPage extends Utils {


    public void registerPageTitle(){
        String registerPageTitle = driver.getTitle();
        Assert.assertEquals(registerPageTitle,"nopCommerce demo store. Register","Register title page not matched");
    }
}
