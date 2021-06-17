package BaseTest;
import Utils.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
    @BeforeTest
    public static void setUpBrowser(){
        Browser.setUp();
    }
    @AfterTest
    public static void quitBrowser(){
        Browser.quit();
    }

}
