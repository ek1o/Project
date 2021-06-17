package Admin.PositiveTests;
import BaseTest.BaseTest;
import Pages.Admin.AdminLogInPage;
import org.testng.annotations.Test;



public class AdminLogInTest extends BaseTest {

    @Test
    public static void logInUsingCorrectUserNameAndPassword(){
        AdminLogInPage.goToAdminLogInPage();
        AdminLogInPage.logInAsAdmin("admin","parola123!");
        AdminLogInPage.verifySuccessfulLogInAsAdmin();
    }
}
