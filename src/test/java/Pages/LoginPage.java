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
    public String ProceedButton_AI = "proceed";
    public String PopupProceedButton_Xpath = "(//XCUIElementTypeStaticText[@name=\"PROCEED\"])[2]";
    public String SearchRegistersInput_AI = "SearchRegisters";
    public String RegisterUserButton_AI = registerName+"'s register";
    public String ShopManager_AI = "Shop Manager";
    public String NumberPad_One_Xpath = "//XCUIElementTypeButton[@name=\"1\"]";
    public String NumberPad_Two_Xpath = "//XCUIElementTypeButton[@name=\"2\"]";
    public String NumberPad_Three_Xpath = "//XCUIElementTypeButton[@name=\"3\"]";
    public String NumberPad_Four_Xpath = "//XCUIElementTypeButton[@name=\"4\"]";
    public String NumberPad_Login_Xpath = "//XCUIElementTypeButton[@name=\"LOGIN\"]";
    public String NumberPad_Xpath = "//XCUIElementTypeButton[@name=\"";
    public String NumberPad_Xpath1 = "\"]";
}
