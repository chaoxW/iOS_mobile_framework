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
import Config.iPadDriver;
import Config.iPadSimulatorDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

import Mobile_Test.Utils;
import Mobile_Test.LoginPageClass;


public class basicClass {

    iPadDriver iPadDriver = new iPadDriver();
    iPadSimulatorDriver iPadSimulatorDriver = new iPadSimulatorDriver();

    Utils utils = new Utils();

    @Test
    public void firstTest() throws Exception {

        IOSDriver driver;

//        driver = utils.iPadSetup();
        driver = utils.iPadSimulatorSetup();
//        driver = iPadSimulatorDriver.iPadSimulatorSetup();

        driver.removeApp("com.superb.IntegrationApp");

    }

}
