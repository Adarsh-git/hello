package org.adarsh;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FormyTest {

    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\dev\\chromedriver_win32_91\\chromedriver.exe");
    }

    @Test
    public void launchChrome() {
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");
        String welcomecomponent = driver.findElement(By.xpath(".//div[@class='jumbotron-fluid']/h1")).getText();
        assertEquals("Welcome to Formy", welcomecomponent);
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This is the teardown script!!");
        driver.quit();
    }

}


