package Mobile_Test;

import Config.iPadDriver;
import Config.iPadSimulatorDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import java.util.concurrent.TimeUnit;

public class Utils {

    IOSDriver driver;

    iPadDriver iPadDriver = new iPadDriver();

    iPadSimulatorDriver iPadSimulatorDriver = new iPadSimulatorDriver();

    public IOSDriver iPadSetup(){
        driver = iPadDriver.iPadSetup();
        return driver;
    }

    public IOSDriver iPadSimulatorSetup(){
        driver = iPadSimulatorDriver.iPadSimulatorSetup();
        return driver;
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
