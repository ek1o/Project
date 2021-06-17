package Admin.NegativeTests;
import BaseTest.BaseTest;
import Pages.Admin.AdminLogInPage;
import org.testng.annotations.Test;


public class AdminLogInTest extends BaseTest {
    @Test
    public static void logInUsingInCorrectUsernameAndPassword(){
        AdminLogInPage.goToAdminLogInPage();
        AdminLogInPage.logInAsAdmin("adminnn","parola");
        AdminLogInPage.verifyFailedLogInAsAdmin();
    }
    @Test
    public static void logInUsingInCorrectUsername(){
        AdminLogInPage.goToAdminLogInPage();
        AdminLogInPage.logInAsAdmin("adminnn2","parola123!");
        AdminLogInPage.verifyFailedLogInAsAdmin();
    }
    @Test
    public static void logInUsingInCorrectPassword(){
        AdminLogInPage.goToAdminLogInPage();
        AdminLogInPage.logInAsAdmin("admin","parola2");
        AdminLogInPage.verifyFailedLogInAsAdmin();
    }


}

