package org.adarsh;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static TestInfo testInfo;
    public static TestReporter testReporter;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver_win32_91\\chromedriver.exe");
        driver = new ChromeDriver();
        wait =getWebDriverWait(driver);
    }

    @BeforeEach
    public void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        System.out.println(testInfo.getDisplayName() + "Before Each");
    }


    public static WebDriverWait getWebDriverWait(WebDriver driver){
        return new WebDriverWait(driver,10);
    }


    @AfterAll
    public static void tearDown() {
        System.out.println("This is the teardown script!!");
        testReporter.publishEntry(testInfo.getDisplayName());
        driver.quit();
    }
}
