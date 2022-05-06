package Mobile_Test;

import Pages.*;
import io.appium.java_client.MobileElement;
import Config.UserData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.List;

public class RegressionClass extends Utils{

    HomePage homePage = new HomePage();
    String homepageLabel_ai = homePage.HomepageLabel_AI;
    String toolbarSettings_ai = homePage.ToolbarSettings_AI;

    SettingPage settingPage = new SettingPage();
    String settingsMenu_ai = settingPage.SettingsMenu_AI;
    String logoutMenu_ai = settingPage.LogoutMenu_AI;
    String logoutMasterUser_ai = settingPage.LogoutMasterUser_AI;
    String logoutMasterUserPopup_xpath = settingPage.LogoutMasterUserPopup_XPATH;

    LoginPage loginPage = new LoginPage();
    String userNameInput_ai = loginPage.UserNameInput_AI;
    String passWordInput_ai = loginPage.PasswordInput_AI;
    String loginButton_ai = loginPage.LoginButton_AI;
    String demoUserButton_ai = loginPage.DemoUserButton_AI;
    String qaManualTestButton_ai = loginPage.QAManualTestButton_AI;
    String proceedButton_ai = loginPage.ProceedButton_AI;
    String searchRegistersInput_ai = loginPage.SearchRegistersInput_AI;
    String registerUserButton_ai = loginPage.RegisterUserButton_AI;
    String qaRegisterUserButton_ai = loginPage.QARegisterUserButton_AI;
    String popupProceedButton_ai = loginPage.PopupProceedButton_AI;
    String shopManagerButton_ai = loginPage.ShopManager_AI;
    String qaShopOwnerButton_ai = loginPage.QAShopOwner_AI;
    String numberPad_one_xpath = loginPage.NumberPad_One_Xpath;
    String numberPad_two_xpath = loginPage.NumberPad_Two_Xpath;
    String numberPad_three_xpath = loginPage.NumberPad_Three_Xpath;
    String numberPad_four_xpath = loginPage.NumberPad_Four_Xpath;
    String numberPad_login_xpath = loginPage.NumberPad_Login_Xpath;
    String numberPad_xpath = loginPage.NumberPad_Xpath;
    String numberPad_xpath1 = loginPage.NumberPad_Xpath1;
    String loginPageLabel_ai = loginPage.LoginPageLabel_AI;

    UserData userData = new UserData();
    String userName = userData.UserName;
    String qaTestUserName = userData.QATestUserName;
    String passWord = userData.Password;
    String qaTestPassword = userData.QATestPassword;
    String registerName = userData.RegisterName;

    TablePage tablePage = new TablePage();

    OrderPage orderPage = new OrderPage();
    String tableVerification_ai = orderPage.TableVerification_AI;
    String backButton_xpath = orderPage.BackButton_XPATH;
    String coke_ai = orderPage.OrderCoke_AI;
    String pizza_ai = orderPage.OrderPizza_AI;
    String burger_ai = orderPage.OrderBurger_AI;
    String clearTableButton_ai = orderPage.ClearTableButton_AI;
    String addToTable_xpath = orderPage.AddToTable_XPATH;
    String yesButton_ai = orderPage.YesButton_AI;
    String billList_xpath = orderPage.billList_XPATH;
    String menuListGridView_xpath = orderPage.MenuListGridView_XPATH;
    String menuListListView_xpath = orderPage.MenuListListView_XPATH;
    String gridViewButton_ai = orderPage.GridViewButton_AI;
    String listViewButton_ai = orderPage.ListViewButton_AI;

    public String[] arrMenu;
    public String[] arrBill;


    Utils utils = new Utils();

    @BeforeTest
    public void setup() {
//        utils.iPadSetup();
        utils.iPadBrowserstackSetup();
        utils.testSuiteStartLog();
    }

    @AfterTest
    public void teardown() {
        utils.QuitDriver();
        utils.testSuiteEndLog();
    }

    public void acceptAlert() throws Exception {
            utils.acceptAlert();
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

    public void insertQATestName() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(userNameInput_ai);
            userNameInput.sendKeys(qaTestUserName);
            System.out.println("insert username Input with " + qaTestUserName);
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

    public void insertQATestPassword() {
        try {
            MobileElement userNameInput;
            userNameInput = utils.getElementByAccessibilityId(passWordInput_ai);
            userNameInput.sendKeys(qaTestPassword);
            System.out.println("insert password Input with " + qaTestPassword);
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
            System.out.println("click demo user button");
        } catch (Exception exp) {
            System.out.println("\nclick demo user button ERROR " + exp.getCause());
            System.out.println("\nclick demo user button ERROR " + exp.getMessage());
        }
    }

    public void clickQAManualTestButton() {
        try {
            utils.wait(10);
            MobileElement demoUserButton;
            demoUserButton = utils.getElementByAccessibilityId(qaManualTestButton_ai);
            demoUserButton.click();
            System.out.println("click QA Manual Test button");
        } catch (Exception exp) {
            System.out.println("\nclick demo user button ERROR " + exp.getCause());
            System.out.println("\nclick demo user button ERROR " + exp.getMessage());
        }
    }

    public void clickProceedButton() {
        try {
            MobileElement proceedButton;
            proceedButton = utils.getElementByAccessibilityId(proceedButton_ai);
            proceedButton.click();
            System.out.println("click proceed button");
        } catch (Exception exp) {
            System.out.println("\nclick proceed button ERROR " + exp.getCause());
            System.out.println("\nclick proceed button ERROR " + exp.getMessage());
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

    public void clickQARegisterUser() {
        utils.wait(60);
        try {
            MobileElement registerUserButton;
            registerUserButton = utils.getElementByAccessibilityId(qaRegisterUserButton_ai);
            registerUserButton.click();
            System.out.println("click Register User Register2 button");
        } catch (Exception exp) {
            System.out.println("\nclick Register User button ERROR " + exp.getCause());
            System.out.println("\nclick Register User button ERROR " + exp.getMessage());
        }
    }

    public void  clickPopupProceedButton(){
        utils.wait(60);
        try {
            MobileElement popupProceedButton;
            popupProceedButton = utils.getElementByAccessibilityId(popupProceedButton_ai);
            popupProceedButton.click();
            System.out.println("click popup Proceed Button");
        } catch (Exception exp) {
            System.out.println("\nclick popup Proceed Button ERROR " + exp.getCause());
            System.out.println("\nclick popup Proceed Button ERROR " + exp.getMessage());
        }
    }

    public void clickShopManagerButton() {
        try {
            utils.wait(10);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(shopManagerButton_ai);
            shopManagerButton.click();
            System.out.println("click shop manager button");
        } catch (Exception exp) {
            System.out.println("\nclick shop manager button ERROR " + exp.getCause());
            System.out.println("\nclick shop manager button ERROR " + exp.getMessage());
        }
    }

    public void clickQAShopOwnerButton() {
        try {
            utils.wait(10);
            MobileElement shopManagerButton;
            shopManagerButton = utils.getElementByAccessibilityId(qaShopOwnerButton_ai);
            shopManagerButton.click();
            System.out.println("click QA shop owner button");
        } catch (Exception exp) {
            System.out.println("\nclick QA shop owner button ERROR " + exp.getCause());
            System.out.println("\nclick QA shop owner button ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPad(int number){
        utils.wait(5);
        try {
            MobileElement numberSelect;
            numberSelect = utils.getElementByXpath(numberPad_xpath + number + numberPad_xpath1);
            numberSelect.click();
            System.out.println("click number pad " + number);
        } catch (Exception exp) {
            System.out.println("\nclick number pad ERROR " + exp.getCause());
            System.out.println("\nclick number pad ERROR " + exp.getMessage());
        }
    }

    public void clickNumberPadLogin(){
        try {
            MobileElement numberPadLoginButton;
            numberPadLoginButton = utils.getElementByXpath(numberPad_login_xpath);
            numberPadLoginButton.click();
            System.out.println("click number pad login");
        } catch (Exception exp) {
            System.out.println("\nclick number pad login ERROR " + exp.getCause());
            System.out.println("\nclick number pad login ERROR " + exp.getMessage());
        }
    }

    public void setShopManagerPin(){
        try {
            MobileElement numberOne;
            numberOne = utils.getElementByXpath(numberPad_one_xpath);
            numberOne.click();
            MobileElement numberTwo;
            numberTwo = utils.getElementByXpath(numberPad_two_xpath);
            numberTwo.click();
            MobileElement numberThree;
            numberThree = utils.getElementByXpath(numberPad_three_xpath);
            numberThree.click();
            MobileElement numberFour;
            numberFour = utils.getElementByXpath(numberPad_four_xpath);
            numberFour.click();
            System.out.println("set Shop Manager Pin");
        } catch (Exception exp) {
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getCause());
            System.out.println("\nset Shop Manager Pin ERROR " + exp.getMessage());
        }
    }

    public void HomepageValidation() throws Exception {
        utils.wait(10);
        try {
            MobileElement homePageLocation;
            homePageLocation = utils.getElementByAccessibilityId(homepageLabel_ai);
            Boolean homePage = homePageLocation.isDisplayed();
            if (homePage == true) {
                System.out.println("Get homepage successfully");
            } else {
                System.out.println("Homepage validation fail");
            }
        } catch (Exception exp) {
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getCause());
            System.out.println("\nLogin homepage validation fail ERROR " + exp.getMessage());
        }

    }

    public void hideKeyboard(){
        utils.hideKeyboard();
    }

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
        utils.wait(60);
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
        utils.wait(60);
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
        utils.wait(60);
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
        utils.wait(60);
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
        utils.wait(60);
        try {
            MobileElement loginPageLabel;
            loginPageLabel = utils.getElementByAccessibilityId(loginPageLabel_ai);
            if (loginPageLabel.getText().equals("Login")) {
                System.out.println("Logout validation success now the page is " + loginPageLabel.getText());
            } else {
                System.out.println("Logout validation fail");
            }
        } catch (Exception exp) {
            System.out.println("\nLogout fail ERROR " + exp.getCause());
            System.out.println("\nLogout fail ERROR " + exp.getMessage());
        }

    }

    public void logoutMasterUser() {
        try {
            clickToolbarSettingsButton();
            clickSettingsMenuButton();
            clickLogoutMenuButton();
            clickLogoutMasterUserButton();
            clickLogoutMasterUserPopupButton();
            LogoutValidation();
        } catch (Exception exp) {
            System.out.println("\nclick Logout MasterUser ERROR " + exp.getCause());
            System.out.println("\nclick Logout MasterUser ERROR " + exp.getMessage());
        }
    }

    public void loginQAUser() {
        try {
            clearUsername();
            clearPassword();
            insertQATestName();
            insertQATestPassword();
            clickLoginButton();
            clickQAManualTestButton();
            clickProceedButton();
            clickQARegisterUser();
            clickProceedButton();
            clickPopupProceedButton();
            clickQAShopOwnerButton();
            clickNumberPad(1);
            clickNumberPad(2);
            clickNumberPad(3);
            clickNumberPad(4);
            clickNumberPadLogin();
            HomepageValidation();
        } catch (Exception exp) {
            System.out.println("\nLogin QA user ERROR " + exp.getCause());
            System.out.println("\nLogin QA user ERROR " + exp.getMessage());
        }
    }

    public void loginDemoUser() {
        try {
            clearUsername();
            clearPassword();
            insertDemoUsername();
            insertDemoUserPassword();
            clickLoginButton();
            clickDemoUserButton();
            clickProceedButton();
            setSearchRegisterUser();
            hideKeyboard();
            clickRegisterUser();
            clickProceedButton();
            clickPopupProceedButton();
            clickShopManagerButton();
            setShopManagerPin();
            clickNumberPad(1);
            clickNumberPad(2);
            clickNumberPad(3);
            clickNumberPad(4);
            clickNumberPadLogin();
            HomepageValidation();
        } catch (Exception exp) {
            System.out.println("\nLogin QA user ERROR " + exp.getCause());
            System.out.println("\nLogin QA user ERROR " + exp.getMessage());
        }
    }
//↧↧↧********************************** table class *****************************************↧↧↧
public void checkTable(int num) {
    try {
        MobileElement tableNumberValidation;
        tableNumberValidation = utils.getElementByAccessibilityId(num+tableVerification_ai);
        if (tableNumberValidation.isDisplayed()) {
            System.out.println("table correctly selected " + num + tableVerification_ai);
        }
    } catch (Exception exp) {
        System.out.println("\ncheck table ERROR " + exp.getCause());
        System.out.println("\ncheck table ERROR " + exp.getMessage());
    }
}

    public void selectTable(int tableNumber) {
        utils.wait(500);
        try {
            MobileElement table;
            table = utils.getElementByAccessibilityId(Integer.toString(tableNumber));
            table.click();
            System.out.println("select table " + tableNumber);
        } catch (Exception exp) {
            System.out.println("\nselect table " + tableNumber + " ERROR " + exp.getCause());
            System.out.println("\nselect table " + tableNumber + " ERROR " + exp.getMessage());
        }
    }

    public void clickBackButton() {
        utils.wait(3);
        try {
            MobileElement backButton;
            backButton = utils.getElementByXpath(backButton_xpath);
            backButton.click();
            System.out.println("click back button");
        } catch (Exception exp) {
            System.out.println("\nclick back button ERROR " + exp.getCause());
            System.out.println("\nclick back button ERROR " + exp.getMessage());
        }
    }

    public void clickClearTableButton() {
        try {
            MobileElement clearTableButton;
            clearTableButton = utils.getElementByAccessibilityId(clearTableButton_ai);
            clearTableButton.click();
            System.out.println("click clear table button");
        } catch (Exception exp) {
            System.out.println("\nclick clear table button ERROR " + exp.getCause());
            System.out.println("\nclick clear table button ERROR " + exp.getMessage());
        }
    }

    public void clickAddToTableButton() {
        utils.wait(2);
        try {
            MobileElement addToTableButton;
            addToTableButton = utils.getElementByXpath(addToTable_xpath);
            addToTableButton.click();
            System.out.println("click add to table button");
        } catch (Exception exp) {
            System.out.println("\nclick add to table button ERROR " + exp.getCause());
            System.out.println("\nclick add to table button ERROR " + exp.getMessage());
        }
    }

    public void clickYesButton() {
        try {
            MobileElement yesButton;
            yesButton = utils.getElementByAccessibilityId(yesButton_ai);
            yesButton.click();
            System.out.println("click Yes button");
        } catch (Exception exp) {
            System.out.println("\nclick Yes button ERROR " + exp.getCause());
            System.out.println("\nclick Yes button ERROR " + exp.getMessage());
        }
    }

    public String[] getTableBillList() {
        try {
            utils.wait(5);
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            arrBill = new String[billList.size()];
            System.out.println("There are " + billList.size() + " items on the bill");
            int itemIndex = 0;
            for (MobileElement bill : billList) {
                String itemName = bill.getText();
                System.out.println("There is " + itemName + " on the bill");
                arrBill[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Table bill list contains " + Arrays.toString(arrBill));
            return arrBill;
        } catch (Exception exp) {
            System.out.println("\nGet table bill list ERROR " + exp.getCause());
            System.out.println("\nGet table bill list ERROR " + exp.getMessage());
        }
        return null;
    }

    public void checkTableStatus(){
        utils.wait(5);
        try {
//            utils.wait(5);
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            if (billList.size() == 0) {
                System.out.println("The table bill is empty");
            }else {
                getTableBillList();
            }
        }catch (Exception exp) {
            System.out.println("\ncheck table status ERROR " + exp.getCause());
            System.out.println("\ncheck table status ERROR " + exp.getMessage());
        }
    }

    public void addCokeToTable() {
        utils.wait(1);
        try {
            MobileElement coke;
            coke = utils.getElementByAccessibilityId(coke_ai);
            coke.click();
            System.out.println("order coke");
        } catch (Exception exp) {
            System.out.println("\norder coke ERROR " + exp.getCause());
            System.out.println("\norder coke ERROR " + exp.getMessage());
        }
    }

    public void addPizzaToTable() {
        try {
            MobileElement pizza;
            pizza = utils.getElementByAccessibilityId(pizza_ai);
            pizza.click();
            System.out.println("order pizza");
        } catch (Exception exp) {
            System.out.println("\nclick pizza ERROR " + exp.getCause());
            System.out.println("\nclick coke ERROR " + exp.getMessage());
        }
    }

    public void addBurgerToTable() {
        try {
            MobileElement burger;
            burger = utils.getElementByAccessibilityId(burger_ai);
            burger.click();
            System.out.println("order burger");
        } catch (Exception exp) {
            System.out.println("\norder burger ERROR " + exp.getCause());
            System.out.println("\norder burger ERROR " + exp.getMessage());
        }
    }

    public void clearTable() {
        utils.wait(5);
        try {
//            utils.wait(5);
            List<MobileElement> billList;
            billList = (List) utils.getElementsByXpath(billList_xpath);
            if (billList.size() == 0){
                System.out.println("The table bill is empty");
                clickBackButton();
            }else {
                getTableBillList();
                clickClearTableButton();
                clickYesButton();
                clickAddToTableButton();
                System.out.println("Clear table done now table bill is empty");
            }
        } catch (Exception exp) {
            System.out.println("\nclear table ERROR " + exp.getCause());
            System.out.println("\nclear table ERROR " + exp.getMessage());
        }
    }

    public void clearSelectTable(int tableNumber) {
        selectTable(tableNumber);
        checkTable(tableNumber);
        clearTable();
    }

    public String[] getMenuListGridView() {
        try {
            utils.wait(5);
            List<MobileElement> menuList;
            menuList = (List) utils.getElementsByXpath(menuListGridView_xpath);
            arrMenu = new String[menuList.size()];
            System.out.println("There are " + menuList.size() + " items from the menu");
            int itemIndex = 0;
            for (MobileElement menu : menuList) {
                String itemName = menu.getText();
                System.out.println("There is " + itemName);
                arrMenu[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Menu contains " + Arrays.toString(arrMenu));
            return arrMenu;
        } catch (Exception e) {
            System.out.println("\nMenu list ERROR " + e.getCause());
            System.out.println("\nMenu list ERROR " + e.getMessage());
        }
        return null;
    }

    public String[] getMenuListListView() {
        try {
            utils.wait(5);
            List<MobileElement> menuList;
            menuList = (List) utils.getElementsByXpath(menuListListView_xpath);
            arrMenu = new String[menuList.size()];
            System.out.println("There are " + menuList.size() + " items from the menu");
            int itemIndex = 0;
            for (MobileElement menu : menuList) {
                String itemName = menu.getText();
                System.out.println("There is " + itemName);
                arrMenu[itemIndex] = itemName;
                itemIndex++;
            }
            System.out.println("Menu contains " + Arrays.toString(arrMenu));
            return arrMenu;
        } catch (Exception e) {
            System.out.println("\nMenu list ERROR " + e.getCause());
            System.out.println("\nMenu list ERROR " + e.getMessage());
        }
        return null;
    }


    public void getTableMenuList(int tableNumber) {
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        getMenuListGridView();
        clickBackButton();
    }

    public void orderFood(int foodIndex) {
        try {
            MobileElement food;
            food = utils.getElementByAccessibilityId(arrMenu[foodIndex]);
            food.click();
            System.out.println("order " + arrMenu[foodIndex]);
        } catch (Exception exp) {
            System.out.println("\norder food ERROR " + exp.getCause());
            System.out.println("\norder food ERROR " + exp.getMessage());
        }
    }

    public void getTableGridViewMenuList(int tableNumber) {
        utils.wait(10);
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsGridView();
        getMenuListGridView();
        clickBackButton();
    }

    public void getTableListViewMenuList(int tableNumber) {
        utils.wait(10);
        selectTable(tableNumber);
        utils.wait(3);
        checkTable(tableNumber);
        setProductsListView();
        getMenuListListView();
        clickBackButton();
    }

    public void setProductsGridView() {
        try {
            MobileElement gridViewButton;
            gridViewButton = utils.getElementByAccessibilityId(gridViewButton_ai);
            gridViewButton.click();
            System.out.println("Set products grid view");
        } catch (Exception exp) {
            System.out.println("\nSet products grid view ERROR " + exp.getCause());
            System.out.println("\nSet products grid view ERROR " + exp.getMessage());
        }
    }

    public void setProductsListView() {
        try {
            MobileElement gridViewButton;
            gridViewButton = utils.getElementByAccessibilityId(listViewButton_ai);
            gridViewButton.click();
            System.out.println("Set products list view");
        } catch (Exception exp) {
            System.out.println("\nSet products list view ERROR " + exp.getCause());
            System.out.println("\nSet products list view ERROR " + exp.getMessage());
        }
    }

//↥↥↥********************************** table class *****************************************↥↥↥

}
