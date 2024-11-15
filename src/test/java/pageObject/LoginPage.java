package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final SelenideElement emailInput = $(By.id("email"));
    private static final SelenideElement passDisplay = $(By.id("password"));
    private static final SelenideElement authButton = $(By.xpath(".//button[@data-continue-to=\"password-container\"]"));
    private static final SelenideElement signInButton = $(By.xpath(".//a[contains(text(), 'Sign in')]/parent::div[@class='position-relative HeaderMenu-link-wrap d-lg-inline-block']"));
    private static final SelenideElement userNameInput = $(By.id("login_field"));
    private static final SelenideElement passwordInput = $(By.id("password"));
    private static final SelenideElement loginButton = $(By.xpath(".//input[@data-signin-label=\"Sign in\"]"));
    private static final SelenideElement checkAuth = $(By.xpath(".//h2[text()=\"Home\"]"));
    private static final SelenideElement checkAlert = $(By.xpath(".//div[contains(text(), 'Incorrect username or password')]"));

    public void setEmailInput(String accountEmail) {
        emailInput.shouldBe(visible).setValue(accountEmail);
    }

    public void pushAuthButton(){
        authButton.shouldBe(visible).click();
    }

    public void authOperation(String email) {
        setEmailInput(email);
        pushAuthButton();
        passDisplay.shouldBe(visible);
    }

    public void setValidAuth(String accountName, String accountPassword) {
        signInButton.shouldBe(visible).click();
        userNameInput.shouldBe(visible).setValue(accountName);
        passwordInput.shouldBe(visible).setValue(accountPassword);
        loginButton.shouldBe(visible).click();
        checkAuth.shouldBe(visible);
    }

    public void setInvalidAuth(String accountName, String accountPassword) {
        signInButton.shouldBe(visible).click();
        userNameInput.shouldBe(visible).setValue(accountName);
        passwordInput.shouldBe(visible).setValue(accountPassword);
        loginButton.shouldBe(visible).click();
        checkAlert.shouldBe(visible);
    }
}