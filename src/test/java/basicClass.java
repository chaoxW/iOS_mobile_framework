
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import Config.iPadDriver;
import Config.iPadSimulatorDriver;
import org.testng.annotations.Test;
import Mobile_Test.Utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class basicClass {

    iPadDriver iPadDriver = new iPadDriver();
    iPadSimulatorDriver iPadSimulatorDriver = new iPadSimulatorDriver();
    Utils utils = new Utils();

    @Test
    public void firstTest()  {

        IOSDriver driver;

        driver = utils.iPadSetup();

//        driver = utils.iPadSimulatorSetup();

//        driver = utils.iPadBrowserstackSetup();
//        utils.acceptAlert();
//        driver.quit();
        utils.wait(5);
        driver.findElementByAccessibilityId("1").click();

    }

}
