package uiTests;

import org.junit.jupiter.api.Test;
import pageObject.LoginPage;
import uiConfig.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTests extends BaseTest {
    @Test
    public void checkInputEmail(){
        open("/signup");
        LoginPage loginPage = new LoginPage();
        loginPage.authOperation("n9858508501@yandex.ru");
    }


    @Test
    public void setNameAndPassForAuth(){
        open("/");
        LoginPage loginPage = new LoginPage();
        loginPage.setValidAuth("RagaMuffinn2024", "Raga_muffinn2024");
    }

    @Test
    public void setInvalidNameAndPassForAuth(){
        open("/");
        LoginPage loginPage = new LoginPage();
        loginPage.setInvalidAuth("RagaMuffinn2024", "Raga_muffinn");
    }
}
