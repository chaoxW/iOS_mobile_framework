package Mobile_Test;

import Pages.HomePage;
import io.appium.java_client.MobileElement;
import Pages.LoginPage;
import Config.UserData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass extends Utils{

    LoginPage loginPage = new LoginPage();
    String userNameInput_ai = loginPage.UserNameInput_AI;
    String passWordInput_ai = loginPage.PasswordInput_AI;
    String loginButton_ai = loginPage.LoginButton_AI;
    String demoUserButton_ai = loginPage.DemoUserButton_AI;
    String proceedButton_ai = loginPage.ProceedButton_AI;
    String searchRegistersInput_ai = loginPage.SearchRegistersInput_AI;
    String registerUserButton_ai = loginPage.RegisterUserButton_AI;
    String popupProceedButton_xpath = loginPage.PopupProceedButton_Xpath;
    String shopManagerButton_ai = loginPage.ShopManager_AI;
    String numberPad_one_xpath = loginPage.NumberPad_One_Xpath;
    String numberPad_two_xpath = loginPage.NumberPad_Two_Xpath;
    String numberPad_three_xpath = loginPage.NumberPad_Three_Xpath;
    String numberPad_four_xpath = loginPage.NumberPad_Four_Xpath;
    String numberPad_login_xpath = loginPage.NumberPad_Login_Xpath;
    String numberPad_xpath = loginPage.NumberPad_Xpath;
    String numberPad_xpath1 = loginPage.NumberPad_Xpath1;

    UserData userData = new UserData();
    String userName = userData.UserName;
    String passWord = userData.Password;
    String registerName = userData.RegisterName;

    HomePage homePage = new HomePage();
    String toolbarSettings_ai = homePage.ToolbarSettings_AI;
    String settingsMenu_ai = homePage.SettingsMenu_AI;
    String logoutMenu_ai = homePage.LogoutMenu_AI;
    String logoutMasterUser_ai = homePage.LogoutMasterUser_AI;
    String logoutMasterUserPopup_xpath = homePage.LogoutMasterUserPopup_XPATH;

    Utils utils = new Utils();

    @BeforeTest
    public void setup() {
        utils.setup();
    }

    @AfterTest
    public void teardown() {
        utils.QuitDriver();
    }

    public void clearUsername() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.clear();
            System.out.println("clear Username Input");
        } catch (Exception exp) {
            System.out.println("\nclear Username Input ERROR " + exp.getCause());
            System.out.println("\nclear Username Input ERROR " + exp.getMessage());
        }
    }

    public void clearPassword() {
        try {
            MobileElement passWordInput;
            passWordInput = utils.getElementByAccessibilityId(passWordInput_ai);
            passWordInput.clear();
            System.out.println("clear Password Input");
        } catch (Exception exp) {
            System.out.println("\nclear Password Input ERROR " + exp.getCause());
            System.out.println("\nclear Password Input ERROR " + exp.getMessage());
        }
    }

    public void insertDemoUsername() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.sendKeys(userName);
            System.out.println("insert username Input with " + userName);
        } catch (Exception exp) {
            System.out.println("\ninsert username Input ERROR " + exp.getCause());
            System.out.println("\ninsert username Input ERROR " + exp.getMessage());
        }
    }

    public void insertDemoUserPassword() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(passWordInput_ai);
            userNameInput.sendKeys(passWord);
            System.out.println("insert password Input with " + passWord);
        } catch (Exception exp) {
            System.out.println("\ninsert password Input ERROR " + exp.getCause());
            System.out.println("\ninsert password Input ERROR " + exp.getMessage());
        }
    }

    public void clickLoginButton() {
        try {
            MobileElement loginButton;
            loginButton = utils.getElementByAccessibilityId(loginButton_ai);
            loginButton.click();
            System.out.println("click login button");
        } catch (Exception exp) {
            System.out.println("\nclick login button ERROR " + exp.getCause());
            System.out.println("\nclick login button ERROR " + exp.getMessage());
        }
    }

    public void clickDemoUserButton() {
        try {
            utils.wait(10);
            MobileElement demoUserButton;
            demoUserButton = utils.getElementByAccessibilityId(demoUserButton_ai);
            demoUserButton.click();
            System.out.println("demo user button");
        } catch (Exception exp) {
            System.out.println("\ndemo user button ERROR " + exp.getCause());
            System.out.println("\ndemo user button ERROR " + exp.getMessage());
        }
    }

    public void clickProceedButton() {
        try {
            MobileElement proceedButton;
            proceedButton = utils.getElementByAccessibilityId(proceedButton_ai);
            proceedButton.click();
            System.out.println("proceed button");
        } catch (Exception exp) {
            System.out.println("\nproceed button ERROR " + exp.getCause());
            System.out.println("\nproceed button ERROR " + exp.getMessage());
        }
    }

    public void setSearchRegisterUser() {
        try {
            utils.wait(10);
            MobileElement searchRegistersInput;
            searchRegistersInput = utils.getElementByAccessibilityId(searchRegistersInput_ai);
            searchRegistersInput.sendKeys(registerName);
            System.out.println("set Search Register User input");
        } catch (Exception exp) {
            System.out.println("\nset Search Register User input ERROR " + exp.getCause());
            System.out.println("\nset Search Register User input ERROR " + exp.getMessage());
        }
    }

    public void clickRegisterUser() {
        try {
            MobileElement registerUserButton;
            registerUserButton = utils.getElementByAccessibilityId(registerUserButton_ai);
            registerUserButton.click();
            System.out.println("click Register User button");
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void  clickPopupProceedButton(){
        try {
            MobileElement popupProceedButton = utils.getElementByXpath(popupProceedButton_xpath);
            popupProceedButton.click();
            System.out.println("popup Proceed Button");
        } catch (Exception exp) {
            System.out.println("\npopup Proceed Button ERROR " + exp.getCause());
            System.out.println("\npopup Proceed Button ERROR " + exp.getMessage());
        }
    }

    public void clickShopManagerButton() {
        try {
            utils.wait(10);
            MobileElement shopManagerButton = utils.getElementByAccessibilityId(shopManagerButton_ai);
            shopManagerButton.click();
            System.out.println("shop manager button");
        } catch (Exception exp) {
            System.out.println("\nshop manager button ERROR " + exp.getCause());
            System.out.println("\nshop manager button ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPad(int number){
        try {
            MobileElement numberSelect = utils.getElementByXpath(numberPad_xpath + number + numberPad_xpath1);
            numberSelect.click();
            System.out.println("set Shop Manager Pin");
        } catch (Exception exp) {
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getCause());
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPadLogin(){
        try {
            MobileElement numberPadLoginButton = utils.getElementByXpath(numberPad_login_xpath);
            numberPadLoginButton.click();
            System.out.println("click number pad login");
        } catch (Exception exp) {
            System.out.println("\nclick number pad login ERROR " + exp.getCause());
            System.out.println("\nclick number pad login ERROR " + exp.getMessage());
        }
    }

    public void setShopManagerPin(){
        try {
            MobileElement numberOne = utils.getElementByXpath(numberPad_one_xpath);
            numberOne.click();
            MobileElement numberTwo = utils.getElementByXpath(numberPad_two_xpath);
            numberTwo.click();
            MobileElement numberThree = utils.getElementByXpath(numberPad_three_xpath);
            numberThree.click();
            MobileElement numberFour = utils.getElementByXpath(numberPad_four_xpath);
            numberFour.click();
            System.out.println("set Shop Manager Pin");
        } catch (Exception exp) {
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getCause());
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getMessage());
        }
    }


    public void hideKeyboard(){
        utils.hideKeyboard();
    }

    public void clickToolbarSettingsButton() {
        try {
            MobileElement loginButton = utils.getElementByAccessibilityId(toolbarSettings_ai);
            loginButton.click();
            System.out.println("click Toolbar Settings Button");
        } catch (Exception exp) {
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getCause());
            System.out.println("\nclick Toolbar Settings Button ERROR " + exp.getMessage());
        }
    }

    public void clickSettingsMenuButton() {
        try {
            MobileElement loginButton = utils.getElementByAccessibilityId(settingsMenu_ai);
            loginButton.click();
            System.out.println("click Settings Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Settings Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMenuButton() {
        try {
            MobileElement loginButton = utils.getElementByAccessibilityId(logoutMenu_ai);
            loginButton.click();
            System.out.println("click Logout Menu Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout Menu Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserButton() {
        try {
            MobileElement loginButton = utils.getElementByAccessibilityId(logoutMasterUser_ai);
            loginButton.click();
            System.out.println("click Logout MasterUser Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Button ERROR " + exp.getMessage());
        }
    }

    public void clickLogoutMasterUserPopupButton() {
        try {
            MobileElement loginButton = utils.getElementByAccessibilityId(logoutMasterUserPopup_xpath);
            loginButton.click();
            System.out.println("click Logout MasterUser Popup Button");
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser Popup Button ERROR " + exp.getMessage());
        }
    }
}
