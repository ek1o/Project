package Pages.Admin;
import Utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminDashBoardPage  {

   @FindBy(xpath = "//span[@class='hidden-xs hidden-sm hidden-md']")
   public static WebElement dashBoardLogOutButton;

   static {
      PageFactory.initElements(Browser.driver,AdminDashBoardPage.class);
   }


   }

