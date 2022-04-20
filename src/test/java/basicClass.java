import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Config.AppData;
import Config.UserData;
import Config.AppiumData;
import Config.MobileData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

import Mobile_Test.Utils;
import Mobile_Test.LoginPageClass;


public class basicClass {

    MobileData mobileData = new MobileData();
    String iPad_udid = mobileData.iPad_UDID;
    String iPad_deviceName = mobileData.iPad_DeviceName;
    String iPad_platformVersion = mobileData.iPad_PlatformVersion;
    String iPad_platformName = mobileData.iPad_PlatformName;

    AppData appData = new AppData();
     String STGBundleId = appData.AppSTGBundleId;

     UserData userData = new UserData();
     String userName = userData.UserName;
     String passWord = userData.Password;
     String registerName = userData.RegisterName;

     AppiumData appiumData = new AppiumData();
     String appiumUrl= appiumData.AppiumUrl;
     String appiumAutomationName = appiumData.AppiumAutomationName;

     LoginPage loginData = new LoginPage();
     String userNameInput = loginData.UserNameInput_AI;
     String passWordInput = loginData.PasswordInput_AI;
     String loginButton = loginData.LoginButton_AI;
     String demoUserButton = loginData.DemoUserButton_AI;
     String proceedButton = loginData.ProceedButton_AI;
     String searchRegistersInput = loginData.SearchRegistersInput_AI;
     String registerButton = loginData.RegisterUserButton_AI;
     String popupProceedButton = loginData.PopupProceedButton_Xpath;
     String shopManagerButton = loginData.ShopManager_AI;
     String numberPad_One = loginData.NumberPad_One_Xpath;
     String numberPad_Two = loginData.NumberPad_Two_Xpath;
     String numberPad_Three = loginData.NumberPad_Three_Xpath;
     String numberPad_Four = loginData.NumberPad_Four_Xpath;
     String numberPad_Login = loginData.NumberPad_Login_Xpath;

    Utils utils = new Utils();
    LoginPageClass loginPageClass = new LoginPageClass();

    @Test
    public void firstTest() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", iPad_platformName);
        caps.setCapability("platformVersion", iPad_platformVersion);
        caps.setCapability("deviceName", iPad_deviceName);
        caps.setCapability(MobileCapabilityType.UDID,iPad_udid);
        caps.setCapability("automationName",appiumAutomationName);
        caps.setCapability("bundleId",STGBundleId);

        URL url = null;
        try {
            url = new URL(appiumUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        IOSDriver driver;
        driver = new IOSDriver(url, caps);

        //login
//        driver.findElementByAccessibilityId(userNameInput).clear();
//        driver.findElementByAccessibilityId(passWordInput).clear();
//        MobileElement loginInput = utils.getElementByAccessibilityId(userNameInput);
//        loginInput.sendKeys(userName);
//        driver.findElementByAccessibilityId(userNameInput).sendKeys(userName);
//        driver.findElementByAccessibilityId(passWordInput).sendKeys(passWord);
//        driver.findElementByAccessibilityId(loginButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId(demoUserButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId(proceedButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement element = driver.findElementByAccessibilityId(searchRegistersInput);
//        element.sendKeys(registerName);
//        driver.hideKeyboard();
//        driver.findElementByAccessibilityId(registerButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId(proceedButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByXPath(popupProceedButton).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId(shopManagerButton).click();
//          driver.findElementByIosClassChain(numberPad_One).click();
//        driver.findElementByIosClassChain(numberPad_Two).click();
//        driver.findElementByIosClassChain(numberPad_Three).click();
//        driver.findElementByIosClassChain(numberPad_Four).click();
//        driver.findElementByIosClassChain(numberPad_Login).click();
//
//        //logout
//        driver.findElementByAccessibilityId("superb toolbar settings").click();
//        driver.findElementByAccessibilityId("SETTINGS").click();
//        driver.findElementByAccessibilityId("LOG OUT").click();
//        driver.findElementByAccessibilityId("logoutMasterUser").click();
//        driver.findElementByIosClassChain("**/XCUIElementTypeButton[`label == \"LOG OUT\"`]").click();

        Boolean test = driver.findElementByAccessibilityId("Login").isDisplayed();
        System.out.println(test);

//        driver.closeApp();

    }

}

