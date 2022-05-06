package Mobile_Test;

import org.testng.annotations.Test;

public class LoginPageTest extends LoginPageClass{

    @Test
    public void LoginDemoUser() throws Exception {
        loginDemoUser();
    }

    @Test
    public void LoginTestQA() throws Exception {
        loginQAUser();
    }
}
