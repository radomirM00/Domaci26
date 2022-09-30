package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class Test {
    private LoginPage loginPage;
    private HomePage homePage;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        loginPage = new LoginPage(driver);
        //homePage = new HomePage(driver);
    }
    @org.testng.annotations.Test
    public void logInTest(){
        loginPage.logIn("standard_user","secret_sauce");
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = loginPage.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }



}
