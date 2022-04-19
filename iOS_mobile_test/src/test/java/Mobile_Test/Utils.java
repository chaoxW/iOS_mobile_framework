package Mobile_Test;

import Config.AppData;
import Config.AppiumData;
import Config.MobileData;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Utils {

    IOSDriver driver;

    MobileData mobileData = new MobileData();
    String iPad_udid = mobileData.iPad_UDID;
    String iPad_deviceName = mobileData.iPad_DeviceName;
    String iPad_platformVersion = mobileData.iPad_PlatformVersion;
    String iPad_platformName = mobileData.iPad_PlatformName;

    AppData appData = new AppData();
    String STGBundleId = appData.AppSTGBundleId;
    AppiumData appiumData = new AppiumData();
    String appiumUrl= appiumData.AppiumUrl;
    String appiumAutomationName = appiumData.AppiumAutomationName;

    public void setup(){
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

        driver = new IOSDriver(url, caps);
    }

    public void QuitDriver() {
        driver.quit();
    }

    public MobileElement getElementByAccessibilityId(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByAccessibilityId(id);
            return element;
        } catch (Exception exp) {
            System.out.println("getElementByAccessibilityId ERROR is " + exp.getCause());
            System.out.println("getElementByAccessibilityId ERROR is " + exp.getMessage());
        }
        return null;
    }

    public MobileElement getElementByXpath(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByXPath(id);
            return element;
        } catch (Exception exp) {
            System.out.println("getElementByXpath ERROR is " + exp.getCause());
            System.out.println("getElementByXpath ERROR is " + exp.getMessage());
        }
        return null;
    }

    public MobileElement getElementByIosClassChain(String id) throws Exception {
        try {
            MobileElement element;
            element = (MobileElement) driver.findElementByIosClassChain(id);
            return element;
        } catch (Exception exp) {
            System.out.println("getElementByIosClassChain ERROR is " + exp.getCause());
            System.out.println("getElementByIosClassChain ERROR is " + exp.getMessage());
        }
        return null;
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    }

    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
