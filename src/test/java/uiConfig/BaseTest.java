package uiConfig;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class BaseTest {
    @BeforeAll
    public static void setConf() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 500000;
        Configuration.timeout = 500000;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }

    @AfterAll
    public static void clearData() {
        clearBrowserCookies();
    }
}
