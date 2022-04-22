package Mobile_Test;

import io.appium.java_client.MobileElement;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SettingsClass extends Utils {

    LoginPage loginPage = new LoginPage();
    String loginPageLabel_ai = loginPage.LoginPageLabel_AI;

    HomePage homePage = new HomePage();
    String toolbarSettings_ai = homePage.ToolbarSettings_AI;
    String settingsMenu_ai = homePage.SettingsMenu_AI;
    String logoutMenu_ai = homePage.LogoutMenu_AI;
    String logoutMasterUser_ai = homePage.LogoutMasterUser_AI;
    String logoutMasterUserPopup_xpath = homePage.LogoutMasterUserPopup_XPATH;

    Utils utils = new Utils();

    @BeforeTest
    public void setup() {
        utils.iPadSetup();
    }

//    @AfterTest
//    public void teardown() {
//        utils.QuitDriver();
//    }

    public void clickToolbarSettingsButton() {
        try {
            MobileElement toolbarSettingsButton;
            toolbarSettingsButton = utils.getElementByAccessibilityId(toolbarSettings_ai);
            toolbarSettingsButton.click();
            System.out.println("click Toolbar Settings Button");
        } catch (Exception exp) {
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getCause());
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getMessage());
        }
    }

    public void clickSettingsMenuButton() {
        try {
            MobileElement settingsMenuButton;
            settingsMenuButton = utils.getElementByAccessibilityId(settingsMenu_ai);
            settingsMenuButton.click();
            System.out.println("click Settings Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMenuButton() {
        try {
            MobileElement logoutMenuButton;
            logoutMenuButton = utils.getElementByAccessibilityId(logoutMenu_ai);
            logoutMenuButton.click();
            System.out.println("click Logout Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserButton() {
        try {
            MobileElement logoutMasterUserButton;
            logoutMasterUserButton = utils.getElementByAccessibilityId(logoutMasterUser_ai);
            logoutMasterUserButton.click();
            System.out.println("click Logout MasterUser Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserPopupButton() {
        try {
            MobileElement logoutMasterUserPopupButton;
            logoutMasterUserPopupButton = utils.getElementByXpath(logoutMasterUserPopup_xpath);
            logoutMasterUserPopupButton.click();
            System.out.println("click Logout MasterUser Popup Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getMessage());
        }
    }

    public void LogoutValidation() throws Exception {
        utils.wait(10);
        try {
            MobileElement loginPageLabel;
            loginPageLabel = utils.getElementByAccessibilityId(loginPageLabel_ai);
            if (loginPageLabel.getText().equals("Login")) {
                System.out.println("the page is " + loginPageLabel.getText());
                System.out.println("Logout success");
            } else {
                System.out.println("Logout fail");
            }
        } catch (Exception exp) {
            System.out.println("\nLogout fail ERROR " + exp.getCause());
            System.out.println("\nLogout fail ERROR " + exp.getMessage());
        }

    }
}
