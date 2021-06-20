package Pages.User;

import Utils.Browser;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterAccountPage {
    public static String url = "http://shop.pragmatic.bg";
    @FindBy(id = "input-firstname")
    public static WebElement firstNameFiled;
    @FindBy(id = "input-lastname")
    public static WebElement lastNameFiled;
    @FindBy(id = "input-email")
    public static WebElement emailFiled;
    @FindBy(id = "input-telephone")
    public static WebElement telephoneFiled;
    @FindBy(id = "input-password")
    public static WebElement passwordFiled;
    @FindBy(id = "input-confirm")
    public static WebElement confirmPasswordFiled;
    @FindBy(xpath = "//input[@type='checkbox']")
    public static WebElement privacyPolicyCheckBox;
    @FindBy(xpath = "//input[@value='Continue']")
    public static WebElement continueButton;

    static {
        PageFactory.initElements(Browser.driver, RegisterAccountPage.class);
    }
    public static void fillUpUserInfo (){
        firstNameFiled.sendKeys("Emil");
        lastNameFiled.sendKeys("Iliev");
        String randomSymbols = RandomStringUtils.randomAlphabetic(6);
        String randomEmail = randomSymbols+"@gmail.com";
        emailFiled.sendKeys(randomEmail);
        telephoneFiled.sendKeys("0897878155");
        passwordFiled.sendKeys("StrongPassword");
        confirmPasswordFiled.sendKeys("StrongPassword");
        if(!privacyPolicyCheckBox.isSelected()){
            privacyPolicyCheckBox.click();}
        continueButton.click();
    }
    public static void verifySuccessfulRegistration (){
        WebElement head = Browser.driver.findElement(By.xpath("//div[@id='content']/h1"));
        String text = head.getText();
        Assert.assertTrue(text.contains(" Created"));

    }
}



