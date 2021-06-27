package org.adarsh;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FormyTest extends BaseClass{

    @DisplayName("This is a very special test case")
    @Test
    public void launchChrome() {
     //   System.out.println("running the :: --> "+testInfo.getDisplayName());
        driver.get("https://formy-project.herokuapp.com/");
        String welcomecomponent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='jumbotron-fluid']/h1"))).getText();
        assertEquals("Welcome to Formy", welcomecomponent);
      /*  driver.navigate().to("https://formy-project.herokuapp.com/dropdown");

       Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='dropdownMenuButton']"))));
       select.selectByVisibleText("Radio Button");*/
    }



}


