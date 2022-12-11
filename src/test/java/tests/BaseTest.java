package tests;

import com.codeborne.selenide.Configuration;
import driver.MyAppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest extends MyAppiumDriver {

    @BeforeAll
    public static void setUp() {
        Configuration.browser = MyAppiumDriver.class.getName();
        Configuration.browserSize = null;
        Configuration.timeout = 12000;
    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
