package Mobile_Test;

import org.testng.annotations.Test;

public class LoginPageTest extends LoginPageClass{

    @Test
    public void LoginMasterUser() throws Exception {
        // clear username and password if login before
        clearUsername();
        clearPassword();
        // insert username
        insertDemoUsername();
        // insert password
        insertDemoUserPassword();
        // click login button
        clickLoginButton();
        // click demo user button
        clickDemoUserButton();
        // click proceed button
        clickProceedButton();
        // set register user
        setSearchRegisterUser();
        // hide keyboard
        hideKeyboard();
        // pick register user rebecca
        clickRegisterUser();
        // click proceed button
        clickProceedButton();
        // click popup proceed button
        clickPopupProceedButton();
        // pick shop manager
        clickShopManagerButton();
        // set pin and login
        setShopManagerPin();
//        clickNumberPad(1);
//        clickNumberPad(2);
//        clickNumberPad(3);
//        clickNumberPad(4);
        clickNumberPadLogin();
        LoginValidation();


    }
}
