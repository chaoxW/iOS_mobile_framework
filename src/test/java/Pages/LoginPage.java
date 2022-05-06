package Pages;
import Config.UserData;


public class LoginPage {

    UserData userData = new UserData();
    String registerName = userData.RegisterName;

    public String LoginPageLabel_AI = "Login";
    public String UserNameInput_AI = "user";
    public String PasswordInput_AI = "password";
    public String LoginButton_AI = "login";
    public String DemoUserButton_AI = "DEMO user";
    public String QAManualTestButton_AI = "QA Manual Testing";
    public String ProceedButton_AI = "proceed";
    public String PopupProceedButton_AI = "okButton";;
    public String SearchRegistersInput_AI = "SearchRegisters";
    public String RegisterUserButton_AI = registerName+"'s register";
    public String QARegisterUserButton_AI = "Register 2";
    public String ShopManager_AI = "Shop Manager";
    public String QAShopOwner_AI = "Shop Owner";
    public String NumberPad_One_Xpath = "//XCUIElementTypeButton[@name=\"1\"]";
    public String NumberPad_Two_Xpath = "//XCUIElementTypeButton[@name=\"2\"]";
    public String NumberPad_Three_Xpath = "//XCUIElementTypeButton[@name=\"3\"]";
    public String NumberPad_Four_Xpath = "//XCUIElementTypeButton[@name=\"4\"]";
    public String NumberPad_Login_Xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]";
    public String NumberPad_Xpath = "//XCUIElementTypeButton[@name=\"";
    public String NumberPad_Xpath1 = "\"]";
}
