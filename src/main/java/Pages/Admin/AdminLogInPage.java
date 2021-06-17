package Pages.Admin;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminLogInPage  {

    private static  String url = "http://shop.pragmatic.bg/admin";
    @FindBy(id = "input-username")
    private static WebElement userNameInputField;
    @FindBy(id = "input-password")
    private static WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement logInButton;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private static WebElement validationMessage;
    static { PageFactory.initElements(Browser.driver, AdminLogInPage.class); }


    public static void goToAdminLogInPage() {
        Browser.driver.get(url);
    }

    public static void logInAsAdmin(String userName, String password) {
        userNameInputField.sendKeys(userName);
        passwordInputField.sendKeys(password);
        logInButton.click();
    }

    public static void verifySuccessfulLogInAsAdmin() {
       Assert.assertTrue(AdminDashBoardPage.dashBoardLogOutButton.isDisplayed());
    }
    public static void verifyFailedLogInAsAdmin(){
        Assert.assertTrue(AdminLogInPage.validationMessage.getText().contains("No match for Username and/or Password."));
    }
}


