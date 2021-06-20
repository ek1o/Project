package Pages.User;

import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PragmaticShopHomePage {
    public static String url = "http://shop.pragmatic.bg";
    @FindBy (xpath = "//a[@title='My Account']")
    public static WebElement myAccountButton;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/li[1]")
    public static WebElement registerButton;


    public static void goToPragmaticShopHomePage () {
        Browser.driver.get(url);
        PageFactory.initElements(Browser.driver,PragmaticShopHomePage.class);
    }

     public static void registerUser() {
        PragmaticShopHomePage.goToPragmaticShopHomePage();
        PragmaticShopHomePage.myAccountButton.click();
        PragmaticShopHomePage.registerButton.click();
    }
}
