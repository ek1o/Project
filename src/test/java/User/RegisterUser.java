package User;

import BaseTest.BaseTest;
import Pages.User.PragmaticShopHomePage;
import Pages.User.RegisterAccountPage;
import org.testng.annotations.Test;

public class RegisterUser extends BaseTest {
@Test
    public static void registerUser() {
    PragmaticShopHomePage.registerUser();
    RegisterAccountPage.fillUpUserInfo();
    RegisterAccountPage.verifySuccessfulRegistration();
    }
}
